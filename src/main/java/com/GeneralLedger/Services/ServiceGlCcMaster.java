package com.GeneralLedger.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GeneralLedger.Models.GlCcMaster;
import com.GeneralLedger.Repository.IGlCcMasterRepository;

@Service
public class ServiceGlCcMaster {
	
	@Autowired
	IGlCcMasterRepository repoGlCcMaster;
	
	public List<GlCcMaster> getGlCcMasterList(){
		return repoGlCcMaster.findAll();
	}
	
	public List<GlCcMaster> getGlCcMasterCU(String glCcSts){
		return repoGlCcMaster.findByGlCcStatus(glCcSts);
	}
	
	public String saveUpdateGlCcMaster(GlCcMaster ccCode) {
		repoGlCcMaster.save(ccCode);
		return "Submit Successfully";
	}

}
