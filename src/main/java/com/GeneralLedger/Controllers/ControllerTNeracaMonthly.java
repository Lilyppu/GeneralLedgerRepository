package com.GeneralLedger.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.GeneralLedger.Models.TNeracaMonthly;
import com.GeneralLedger.Services.ServiceTNeracaMonthly;

@RestController
public class ControllerTNeracaMonthly {
	@Autowired
	ServiceTNeracaMonthly servTnm;
	
	@GetMapping("/GeneralLedger/getneracalist")
	public List<TNeracaMonthly> getNeracaMonthly(String pmonth, String pmsg){		
		return servTnm.getNeracaMonthly(pmonth, pmsg);
	}
	
	@GetMapping("/GeneralLedger/getcoydesc")
	public String getCoyDesc(String pMon) {
		return servTnm.getCoyDesc(pMon);
	}
	
	@GetMapping("/GeneralLedger/getmondesc")
	public String getMonDesc(String pMon) {
		return servTnm.getMonDesc(pMon);
	}	
		
	@GetMapping("/GeneralLedger/getneracaplist")
	public List<TNeracaMonthly> getNeracaPList(String pMon) {
		return servTnm.getNeracaPList(pMon);
	}
	
	@GetMapping("/GeneralLedger/getneracalevelmax")
	public Integer getLevelMax(String pMon){
		return servTnm.getLevelMax(pMon);
	}

}
