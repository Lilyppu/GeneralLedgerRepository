package com.GeneralLedger.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.GeneralLedger.Models.TIncomeStatement;
import com.GeneralLedger.Services.ServiceTIncomeStatement;

@RestController
public class ControllerTIncomeStatement {
	@Autowired
	ServiceTIncomeStatement servTIMS;
	
	@GetMapping("/GeneralLedger/getIncomeStatelist")
	public List<TIncomeStatement> getIcomeStatement(String pmonth, String pmsg){		
		return servTIMS.getIncomeStatement(pmonth, pmsg);
	}
	
	@GetMapping("/GeneralLedger/getincomecoydesc")
	public String getCoyDesc(String pMon) {
		return servTIMS.getCoyDesc(pMon);
	}
	
	@GetMapping("/GeneralLedger/getincomemondesc")
	public String getMonDesc(String pMon) {
		return servTIMS.getMonDesc(pMon);
	}	
		
	@GetMapping("/GeneralLedger/getincomeplist")
	public List<TIncomeStatement> getIncomePList(String pMon) {
		return servTIMS.getIncomePList(pMon);
	}
	
	@GetMapping("/GeneralLedger/getincomelevelmax")
	public Integer getLevelMax(String pMon){
		return servTIMS.getLevelMax(pMon);
	}

}
