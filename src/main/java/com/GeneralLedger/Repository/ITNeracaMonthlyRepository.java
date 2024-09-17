package com.GeneralLedger.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.GeneralLedger.Models.TNeracaMonthly;

@Repository
public interface ITNeracaMonthlyRepository extends JpaRepository<TNeracaMonthly, Integer> {
	
	@Procedure(procedureName = "p_create_neraca")
	public String runNeraca(String pmonth, String pmsg);	
	
	@Query("select distinct s.tnmCompany from TNeracaMonthly s where s.tnmMonth=?1")
	public String getCoyDesc(String pMon);
	
	@Query("select distinct s.tnmMonth from TNeracaMonthly s where s.tnmMonth=?1")
	public String getMonDesc(String pMon);		
	
	@Query(value="select * from general_ledger.t_neraca_monthly where tnm_monthly=:pMon order by tnm_fpos", nativeQuery = true)
	List<TNeracaMonthly> getNeracaPList(String pMon);
	
	@Query(value="select max(tnm_level) from general_ledger.t_neraca_monthly where tnm_monthly=:pMon", nativeQuery = true)
	public Integer getLevelMax(String pMon);
	
	
		
}
