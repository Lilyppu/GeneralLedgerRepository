package com.GeneralLedger.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.GeneralLedger.Models.GlFmMaster;
import com.GeneralLedger.Models.TIncomeStatement;
import com.GeneralLedger.Models.TNeracaMonthly;

@Repository
public interface ITIncomeStatementRepository extends JpaRepository<TIncomeStatement,Integer>{
	
	@Procedure(procedureName = "p_income_statement")
	public String runIncomeStatement(String pmonth, String pmsg);	
}
