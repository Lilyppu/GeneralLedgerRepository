package com.GeneralLedger.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GeneralLedger.Models.TIncomeStatement;
import com.GeneralLedger.Repository.ITIncomeStatementRepository;

@Service
public class ServiceTIncomeStatement {
	@Autowired
	ITIncomeStatementRepository repoTISM;
	
	public List<TIncomeStatement> getIncomeStatement(String pmonth, String pmsg){
		repoTISM.runIncomeStatement(pmonth, pmsg);
		return repoTISM.findAll();
	}
	
	public String getCoyDesc(String pMon) {
		return repoTISM.getCoyDesc(pMon);
	}
	
	public String getMonDesc(String pMon) {
		return repoTISM.getMonDesc(pMon);
	}
	
	public List getIncomePList(String pMon) {
		return repoTISM.getIncomePList(pMon);
	}
	
	public Integer getLevelMax(String pMon){
		return repoTISM.getLevelMax(pMon);
	}

}
