package com.GeneralLedger.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.GeneralLedger.Models.TIncomeStatement;

@Repository
public interface ITIncomeStatementRepository extends JpaRepository<TIncomeStatement,Integer>{
	
	@Procedure(procedureName = "p_income_statement")
	public String runIncomeStatement(String pmonth, String pmsg);	
	
	@Query("select distinct s.tismCompany from TIncomeStatement s where s.tismMonth=?1")
	public String getCoyDesc(String pMon);
	
	@Query("select distinct s.tismMonth from TIncomeStatement s where s.tismMonth=?1")
	public String getMonDesc(String pMon);	
	
	@Query(value="select * from general_ledger.t_incomestatement_monthly where tism_monthly=:pMon order by tism_id", nativeQuery = true)
	List<TIncomeStatement> getIncomePList(String pMon);
	
	@Query(value="select max(tism_level) from general_ledger.t_incomestatement_monthly where tism_monthly=:pMon", nativeQuery = true)
	public Integer getLevelMax(String pMon);
	
}
