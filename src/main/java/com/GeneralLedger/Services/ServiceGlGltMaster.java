package com.GeneralLedger.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GeneralLedger.Models.GlGltDet;
import com.GeneralLedger.Models.GlGltMaster;
import com.GeneralLedger.Repository.IGlGltMasterRepository;


@Service
public class ServiceGlGltMaster {
	@Autowired
	IGlGltMasterRepository repoGlMs;
	
	public List<GlGltMaster> GlListAll (){
		return repoGlMs.findAll();
	}
	
	public Optional<GlGltMaster> GlMst (String ref){
		return repoGlMs.findByGlMstrRef(ref);
	}
	
	public String saveUpdateJournalMaster(GlGltMaster glt) {
		repoGlMs.save(glt);
		return "Submit Successfully 1231";
	}
}

