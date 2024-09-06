package com.GeneralLedger.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.GeneralLedger.Models.TIncomeStatement;
import com.GeneralLedger.Services.ServiceGlAcMaster;
import com.GeneralLedger.Services.ServiceTIncomeStatement;
import com.GeneralLedger.Services.ServiceTNeracaMonthly;

@RestController
public class ControllerTIncomeStatement {
	@Autowired
	ServiceTIncomeStatement servTIMS;
	
	@GetMapping("/GeneralLedger/getIncomeStatelist")
	public List<TIncomeStatement> getIcomeStatement(String pmonth, String pmsg){		
		return servTIMS.getIncomeStatement(pmonth, pmsg);
	}

}
