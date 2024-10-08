package com.GeneralLedger.Controllers;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.GeneralLedger.Models.GlGltDet;
import com.GeneralLedger.Models.GlGltMaster;
import com.GeneralLedger.Models.GlTypeMaster;
import com.GeneralLedger.Services.ServiceGlGltDetail;
import com.GeneralLedger.Services.ServiceGlGltMaster;


@RestController
public class ControllerGlGltMaster {
	@Autowired
	ServiceGlGltMaster servGlMs;
	
	@GetMapping("/journal/getjournalmasterlist")
	public List<GlGltMaster> GlListAll (){
		return servGlMs.GlListAll();
	}
	
	@GetMapping("/journal/getjournalmaster")
	public List<GlGltMaster> GlMst (String ref){
		return servGlMs.GlMst(ref);
	}
	
}
