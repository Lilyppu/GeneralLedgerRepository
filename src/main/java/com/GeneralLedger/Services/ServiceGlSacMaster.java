package com.GeneralLedger.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GeneralLedger.Models.GlSacMaster;
import com.GeneralLedger.Repository.IGlSacMaster;

@Service
public class ServiceGlSacMaster {
	
	@Autowired
	IGlSacMaster repoSacMst;
	
	public List<GlSacMaster> getGlSacMaster(){
		return repoSacMst.findAll();
	}
	
	public List<GlSacMaster> getGlSacSts(String status){
		return repoSacMst.findByglsmacstatus(status);
	}
	
	public List<GlSacMaster> getGlSacByAccCode(String acc){
		return repoSacMst.findByglsmsacacc(acc);
	}
	
	public List<GlSacMaster> getGlSacByAccCodeSubAcc(String acc,String subacc){
		return repoSacMst.findByglsmsacaccAndGlsmsacsubContaining(acc, subacc);
	}
	
	public List<GlSacMaster> getGlSacByAccCodeDesc(String acc,String desc){
		return repoSacMst.findByglsmsacaccAndGlsmascdescContaining(acc, desc);
	}
	
	public List<GlSacMaster> getGlSacByAcc(String acc){
		return repoSacMst.findByglsmsacaccContaining(acc);
	}
	
	public List<GlSacMaster> getGlSacByStsAcc(String status, String acc){
		return repoSacMst.findByglsmacstatusAndGlsmsacaccContaining(status, acc);
	}
	
	public List<GlSacMaster> getGlSacBySubAcc(String subacc){
		return repoSacMst.findByglsmsacsubContaining(subacc);
	}
	
	public List<GlSacMaster> getGlSacByStsSubAcc(String status, String subacc){
		return repoSacMst.findByglsmacstatusAndGlsmsacsubContaining(status, subacc);
	}
	
	public List<GlSacMaster> getGlSacByDesc(String desc){
		return repoSacMst.findByglsmascdescContaining(desc);
	}
	
	public List<GlSacMaster> getGlSacByStsDesc(String status, String desc){
		return repoSacMst.findByglsmacstatusAndGlsmascdescContaining(status, desc);
	}
	
	public List<GlSacMaster> getGlSacByStsCode(String status,String acc){
		return repoSacMst.findByglsmacstatusAndGlsmsacacc(status, acc);
	}
	
	public List<GlSacMaster> getGlSacByStsCodeSub(String status,String acc, String subacc){
		return repoSacMst.findByglsmacstatusAndGlsmsacaccAndGlsmsacsubContaining(status, acc, subacc);
	}
	
	public List<GlSacMaster> getGlSacByStsCodeDesc(String status,String acc, String desc){
		return repoSacMst.findByglsmacstatusAndGlsmsacaccAndGlsmascdescContaining(status, acc, desc);
	}
	
	public Optional<GlSacMaster> getSacCode(String acc,String subacc){
	    return repoSacMst.findByglsmsacaccAndGlsmsacsub(acc, subacc);
	}
	
	public String getAccSubDesc(String code) {
		return repoSacMst.getMstAccSubDesc(code);
	}
	
	public String saveUpdateSacMaster(GlSacMaster sacmaster) {
		repoSacMst.save(sacmaster);
		return "Submit Successfully";
	}

}
