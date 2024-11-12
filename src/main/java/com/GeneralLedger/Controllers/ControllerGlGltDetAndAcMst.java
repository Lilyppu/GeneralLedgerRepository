package com.GeneralLedger.Controllers;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.GeneralLedger.Models.GlGltDetAndAcMst;
import com.GeneralLedger.Services.ServiceGlGltDetAndAcMst;

@RestController
public class ControllerGlGltDetAndAcMst {
	
	@Autowired
	ServiceGlGltDetAndAcMst servGltDetAndAcMst;
	
	@GetMapping("/GeneralLedger/getjurnalplist")
	public List<GlGltDetAndAcMst> getGlGltDetPList(String pRef, String pDate) {
		return servGltDetAndAcMst.getGlGltDetPList(pRef,pDate);
	}

}
