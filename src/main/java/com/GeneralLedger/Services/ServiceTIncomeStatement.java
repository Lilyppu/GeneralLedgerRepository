package com.GeneralLedger.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GeneralLedger.Models.GlPjDetail;
import com.GeneralLedger.Models.TIncomeStatement;
import com.GeneralLedger.Models.TNeracaMonthly;
import com.GeneralLedger.Repository.IGlPjDetailRepository;
import com.GeneralLedger.Repository.ITIncomeStatementRepository;
import com.GeneralLedger.Repository.ITNeracaMonthlyRepository;

@Service
public class ServiceTIncomeStatement {
	@Autowired
	ITIncomeStatementRepository repoTISM;
	
	public List<TIncomeStatement> getIncomeStatement(String pmonth, String pmsg){
		repoTISM.runIncomeStatement(pmonth, pmsg);
		return repoTISM.findAll();
	}
	
	

}
