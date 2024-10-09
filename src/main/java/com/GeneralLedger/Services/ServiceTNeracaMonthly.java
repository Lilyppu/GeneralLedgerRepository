package com.GeneralLedger.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GeneralLedger.Models.TNeracaMonthly;
import com.GeneralLedger.Repository.ITNeracaMonthlyRepository;

@Service
public class ServiceTNeracaMonthly {
	@Autowired
	ITNeracaMonthlyRepository repoTnm;
	
	public List<TNeracaMonthly> getNeracaMonthly(String pmonth, String pmsg){
		repoTnm.runNeraca(pmonth, pmsg);
		System.out.println("aaaa :"+pmsg);
		return repoTnm.findAll();
	}
	
	public String getCoyDesc(String pMon) {
		return repoTnm.getCoyDesc(pMon);
	}
	
	public String getMonDesc(String pMon) {
		return repoTnm.getMonDesc(pMon);
	}
	
	public List getNeracaPList(String pMon) {
		return repoTnm.getNeracaPList(pMon);
	}
	
	public Integer getLevelMax(String pMon){
		return repoTnm.getLevelMax(pMon);
	}

}
