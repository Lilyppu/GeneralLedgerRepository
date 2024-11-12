package com.GeneralLedger.Controllers;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.GeneralLedger.Models.GlGltDet;
import com.GeneralLedger.Services.ServiceGlGltDetail;


@RestController
public class ControllerGlGltDetail {
	@Autowired
	ServiceGlGltDetail servGltDtl;
	
	@GetMapping("/journal/getjournallist")
	public List<GlGltDet> getJournalMstCu(String reffNo){
		return servGltDtl.getJournalMstList(reffNo);
	}
	
	@GetMapping("/journal/getjournalCU")
	public Optional<GlGltDet> getJournalCU(String reffNo, Integer seqno){
		return servGltDtl.getJournalCU(reffNo, seqno);
	}
		
	@GetMapping("/journal/execpostjournal")
	public String execPostJuournal(String p_reffno,  String msg) {
		return servGltDtl.execPostJuournal(p_reffno, msg) ;
	}
	
	@GetMapping("/journal/execinsreffjournal")
	public String runInsReffJournal(String p_accno, String p_reffno, String p_reffdate, String msg) {
		return servGltDtl.runInsReffJournal( p_accno,  p_reffno, p_reffdate, msg);		
	}
	
	@GetMapping("/journal/execupdatejournal")
	public String execUpdateJuournal(String p_reffno, String p_date , String p_effdate ,
			String p_docno, String p_doctype, String p_curr, String p_reffjournal, 
			String p_alcode, String outmsg) {
		return servGltDtl.execUpdateJournal(p_reffno, p_date, p_effdate , p_docno, 
				p_doctype, p_curr, p_reffjournal,p_alcode,  outmsg);
	}
	
	@PostMapping("/journal/saveupdjournal")
	public String saveUpdateProduksi(@RequestBody GlGltDet glt) {
		return servGltDtl.saveUpdateJournal(glt);	
	}
	
	@GetMapping("/journal/deletejournal")
	public String DeleteData (String reff, Integer seq) {
		return servGltDtl.DeleteData(reff, seq);
	}
	
	@GetMapping("/GeneralLedger/getjurnaldate")
	public String getGlDate(String pGlRef, String pGlDate) {
		return servGltDtl.getGlDate(pGlRef, pGlDate);
	}	
	
}
