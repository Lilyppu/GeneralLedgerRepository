package com.GeneralLedger.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GeneralLedger.Models.GlPjDetail;
import com.GeneralLedger.Models.TNeracaMonthly;
import com.GeneralLedger.Repository.IGlPjDetailRepository;
import com.GeneralLedger.Repository.ITNeracaMonthlyRepository;

@Service
public class ServiceTNeracaMonthly {
	@Autowired
	ITNeracaMonthlyRepository repoTnm;
	
	public List<TNeracaMonthly> getNeracaMonthly(String pmonth, String pmsg){
		repoTnm.runNeraca(pmonth, pmsg);
		return repoTnm.findAll();
	}
}
