package com.GeneralLedger.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.yaml.snakeyaml.events.Event.ID;

import com.GeneralLedger.Models.GlCcMaster;
import com.GeneralLedger.Services.ServiceGlCcMaster;

@RestController
public class ControllerGlCcMaster {
	@Autowired
	ServiceGlCcMaster servGlCcMaster;
	
	@GetMapping("/GeneralLedger/getglccmasterlist")
	public List<GlCcMaster> getGlCcMasterList(){
		return servGlCcMaster.getGlCcMasterList();
	}
	
	@GetMapping("/GeneralLedger/getglccmastercu")
	public Optional<GlCcMaster> getGlCcMasterCU(String ccCode){
		return servGlCcMaster.getGlCcMasterCU(ccCode);
	}
	
	@PostMapping("/GeneralLedger/saveupdglccmaster")
	public String saveUpdateGlCcMaster(@RequestBody GlCcMaster ccCode) {
		return servGlCcMaster.saveUpdateGlCcMaster(ccCode);
	
	}
	
	@GetMapping("/GeneralLedger/getglccmasterstslist")
	public List<GlCcMaster> getGlCcMasterStatus(String glCcSts){
		return servGlCcMaster.getGlCcMasterSts(glCcSts);
	}
	
	@GetMapping("/GeneralLedger/getglbycccodelist")
	public List<GlCcMaster> getGlByCcCode(String code){
		return servGlCcMaster.getGlByCcCode(code);
	}
	
	@GetMapping("/GeneralLedger/getglbycccodestslist")
	public List<GlCcMaster> getGlByCcCodeSts(String status,String code){
		return servGlCcMaster.getGlByCcCodeSts(status, code);
	}
	
	@GetMapping("/GeneralLedger/getglbyccdesclist")
	public List<GlCcMaster> getGlByCcDesc(String desc){
		return servGlCcMaster.getGlByCcDesc(desc);
	}
	
	@GetMapping("/GeneralLedger/getglbyccdescstslist")
	public List<GlCcMaster> getGlByCcDescSts(String status,String desc){
		return servGlCcMaster.getGlByCcDescSts(status, desc);
	}
	
	@GetMapping("/GeneralLedger/getglccmstdesc")
	public String getGlCcMstDesc(String glCcCode) {
		return servGlCcMaster.getGlCcMstDesc(glCcCode);
	}
}
