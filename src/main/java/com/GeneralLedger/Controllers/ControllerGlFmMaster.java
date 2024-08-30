package com.GeneralLedger.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.GeneralLedger.Models.GlFmMaster;
import com.GeneralLedger.Services.ServiceGlFmMaster;

@RestController
public class ControllerGlFmMaster {
	
	@Autowired
	ServiceGlFmMaster servFmMst;
	
	@GetMapping("/GeneralLedger/getglfmmstlistall")
	public List<GlFmMaster> getGlFmMst(){
		return servFmMst.getGlFmMaster();
	}
	
	@GetMapping("/GeneralLedger/getfmacstatuslist")
	public List<GlFmMaster> getFmAcStatus(String status){
		return servFmMst.getFmAcSts(status);
	}
	
	
	@GetMapping("/GeneralLedger/getfmpossingle")
	public Optional<GlFmMaster> getFmpos(String fmpos) {
		return servFmMst.getFmpos(fmpos);
	}
	
	@PostMapping("/GeneralLedger/saveupdfmmaster")
	public String saveUpdateFmMaster(@RequestBody GlFmMaster acmaster) {
		return servFmMst.saveUpdateFmMaster(acmaster) ;
	
	}
	
	@GetMapping("/GeneralLedger/getglfmmstlistbyDesc")
	public List<GlFmMaster> getGlFmMasterByDesc(String desc){
		return servFmMst.getGlFmMasterByDesc(desc);		
	}
	
	@GetMapping("/GeneralLedger/getglfmmstlistbytype")
	public List<GlFmMaster> getFmType(String ty){
		return servFmMst.getFmType(ty);
	}
	
	
	@GetMapping("/GeneralLedger/getglfmmstlistbylv")
	public List<GlFmMaster> getGlFmMasterByLv(Integer lv){
		return servFmMst.getGlFmMasterByLv(lv);		
	}


}
