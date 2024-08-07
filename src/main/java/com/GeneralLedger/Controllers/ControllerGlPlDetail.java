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

import com.GeneralLedger.Models.GlPlDetail;
import com.GeneralLedger.Services.ServiceGlPlDetail;

@RestController
public class ControllerGlPlDetail {
	
	@Autowired
	ServiceGlPlDetail servGlPlDetail;
	
	@GetMapping("/GeneralLedger/getglpldetaillist")
	public List<GlPlDetail> getGlPpDetailList(){
		return servGlPlDetail.getGlPlDetailList();
	}
	
	@GetMapping("/GeneralLedger/getglpldtlbycodelist")
	public List<GlPlDetail> getGlPldDtlByCodeList(String glPlDtlCode){
		return servGlPlDetail.getGlPlDtlByCodeList(glPlDtlCode);
	}
	
	@GetMapping("/GeneralLedger/getglpldetailcu")
	public Optional<GlPlDetail> getGlPlDetailCU(String glPlDtlCode, String glPlDtlType, String glPlDtlAcc){
		return servGlPlDetail.getGlPlDetailCU(glPlDtlCode, glPlDtlType, glPlDtlAcc);
	}
	
	@PostMapping("/GeneralLedger/saveupdglpldetail")
	public String saveUpdateGlPlDetail(@RequestBody GlPlDetail plDtlCode) {
		return servGlPlDetail.saveUpdateGlPlDetail(plDtlCode);
	
	}

}
