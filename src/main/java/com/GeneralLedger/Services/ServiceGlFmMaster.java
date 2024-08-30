package com.GeneralLedger.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GeneralLedger.Models.GlFmMaster;
import com.GeneralLedger.Repository.IGlFmMaster;

@Service
public class ServiceGlFmMaster {
	
	@Autowired
	IGlFmMaster repoFmMst;
	
	public List<GlFmMaster> getGlFmMaster(){
		//return repoFmMst.findAll();
		return repoFmMst.findByglfmacstatus("AC");		
	}
	
	public List<GlFmMaster> getGlFmMasterByDesc(String desc){
		return repoFmMst.findByGlfmfmdescContaining(desc);		
	}
	
	public List<GlFmMaster> getGlFmMasterByLv(Integer lv){
		return repoFmMst.findByGlfmfmlevel(lv);		
	}

	
	public List<GlFmMaster> getFmAcSts(String status){
		return repoFmMst.findByglfmacstatus(status);
	}
	
	public Optional<GlFmMaster> getFmpos(String fmpos){
	    return repoFmMst.findByglfmfmfpos(fmpos);
	}
	
	public List<GlFmMaster> getFmType(String ty){
	    return repoFmMst.findByGlfmfmtypeContaining(ty);
	}
	
	public String saveUpdateFmMaster(GlFmMaster fmmaster) {
		repoFmMst.save(fmmaster);
		return "Submit Successfully";
	}
	


}
