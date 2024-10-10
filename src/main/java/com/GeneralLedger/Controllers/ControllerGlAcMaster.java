package com.GeneralLedger.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.GeneralLedger.Models.GlAcMaster;
import com.GeneralLedger.Services.ServiceGlAcMaster;

@RestController
public class ControllerGlAcMaster {
	
	@Autowired
	ServiceGlAcMaster servAcMst;
	
	@GetMapping("/GeneralLedger/getglacmstlistall")
	public List<GlAcMaster> getGlAcMst(){
		return servAcMst.getGlAcMaster();
	}
	
	@GetMapping("/GeneralLedger/getglacstatuslist")
	public List<GlAcMaster> getGlAcStatus(String status){
		return servAcMst.getGlAcStatus(status);
	}
	
	@GetMapping("/GeneralLedger/getglactypestslist")
	public List<GlAcMaster> getGlAcTypeSts(String status,String type){
		return servAcMst.getGlAcTypeSts(status, type);
	}
	
	@GetMapping("/GeneralLedger/getglactypestscodelist")
	public List<GlAcMaster> getGlAcTypeStsCode(String status,String type,String code){
		return servAcMst.getGlAcTypeStsCode(status, type, code);
	}
	
	@GetMapping("/GeneralLedger/getglactypestsdesclist")
	public List<GlAcMaster> getGlAcTypeStsDesc(String status,String type,String desc){
		return servAcMst.getGlAcTypeStsDesc(status, type, desc);
	}
	
	@GetMapping("/GeneralLedger/getglactypestsdesc2list")
	public List<GlAcMaster> getGlAcTypeStsDesc2(String status,String type,String desc2){
		return servAcMst.getGlAcTypeStsDesc2(status, type, desc2);
	}
	
	@GetMapping("/GeneralLedger/getglbyaccodelist")
	public List<GlAcMaster> getGlbyAcCode(String code){
		return servAcMst.getGlByAcCode(code);
	}
	
	@GetMapping("/GeneralLedger/getglbyaccodestslist")
	public List<GlAcMaster> getGlbyAcCodeSts(String status, String code){
		return servAcMst.getGlByAcCodeSts(status, code);
	}
	
	@GetMapping("/GeneralLedger/getglbyacdesclist")
	public List<GlAcMaster> getGlbyAcDesc(String desc){
		return servAcMst.getGlByAcDesc(desc);
	}
	
	@GetMapping("/GeneralLedger/getglbyacdescstslist")
	public List<GlAcMaster> getGlbyAcDescSts(String status, String desc){
		return servAcMst.getGlByAcDescSts(status, desc);
	}
	
	@GetMapping("/GeneralLedger/getglbyacdesc2list")
	public List<GlAcMaster> getGlbyAcDesc2(String desc2){
		return servAcMst.getGlByAcDesc2(desc2);
	}
	
	@GetMapping("/GeneralLedger/getglbyacdesc2stslist")
	public List<GlAcMaster> getGlbyAcDesc2Sts(String status, String desc2){
		return servAcMst.getGlByAcDesc2Sts(status, desc2);
	}
	
	@GetMapping("/GeneralLedger/getaccodesingle")
	public Optional<GlAcMaster> getAcCode(String code) {
		return servAcMst.getAcCode(code);
	}
	
	@GetMapping("/GeneralLedger/getmstaccdesc")
	public String getAccDesc(String code) {
		return servAcMst.getAccDesc(code);
	}
	
	@PostMapping("/GeneralLedger/saveupdacmster")
	public String saveUpdateProduksi(@RequestBody GlAcMaster acmaster) {
		return servAcMst.saveUpdateAcMaster(acmaster) ;
	
	}
}
