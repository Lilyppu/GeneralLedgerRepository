package com.GeneralLedger.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.GeneralLedger.Models.GlAcMaster;
import com.GeneralLedger.Models.TNeracaMonthly;
import com.GeneralLedger.Services.ServiceGlAcMaster;
import com.GeneralLedger.Services.ServiceTNeracaMonthly;

@RestController
public class ControllerTNeracaMonthly {
	@Autowired
	ServiceTNeracaMonthly servTnm;
	
	@GetMapping("/GeneralLedger/getneracalist")
	public List<TNeracaMonthly> getNeracaMonthly(String pmonth, String pmsg){		
		return servTnm.getNeracaMonthly(pmonth, pmsg);
	}

}
