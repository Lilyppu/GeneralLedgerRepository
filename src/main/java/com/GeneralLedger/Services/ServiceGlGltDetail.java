package com.GeneralLedger.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GeneralLedger.Models.GlGltDet;
import com.GeneralLedger.Repository.IGlGltDtailRepository;

import java.util.Date;

@Service
public class ServiceGlGltDetail {
	@Autowired
	IGlGltDtailRepository repoGltDtl;
	
	public List<GlGltDet> getJournalMstList(String reffNo){
		return repoGltDtl.findByGlGltDtlRef(reffNo);
	}
	
	public Optional<GlGltDet> getJournalCU(String reffNo, Integer seqno){
		return repoGltDtl.findByGlGltDtlRefAndGlDltDtlSeqNo(reffNo, seqno);
	}
		
	public String saveUpdateJournal(GlGltDet glt) {
		repoGltDtl.save(glt);
		return "Submit Successfully 1231";
	}
	
	public String execPostJuournal(String p_reffno, String msg) {
		return repoGltDtl.runPostJournal(p_reffno, msg);		
	}
	
	public String runInsReffJournal(String p_accno, String p_reffno, String p_reffdate, String msg) {
		return repoGltDtl.runInsReffJournal( p_accno,  p_reffno, p_reffdate, msg);		
	}
	
	public String DeleteData (String reff, Integer seq) {
		repoGltDtl.deleteReffNo(reff, seq);
		return "Delete Successfully";
	}
	
	public String execUpdateJournal(String p_reffno, String p_date , String p_effdate ,
			String p_docno, String p_doctype, String p_curr, String p_reffjournal, 
				String p_alcode, String outmsg) {
		return repoGltDtl.runUpdateJournal(p_reffno, p_date ,p_effdate ,
				p_docno, p_doctype, p_curr, p_reffjournal,  p_alcode,  outmsg);		
	}
	
	public String getDeleteDetail(String reffno, Integer seqno) {
		repoGltDtl.deleteById(null);
		return "Delete Journal Successfully";
	}
	
	public String getGlDate(String pGlRef, String pGlDate) {
		return repoGltDtl.getGlDate(pGlRef, pGlDate);
	}
	
}
