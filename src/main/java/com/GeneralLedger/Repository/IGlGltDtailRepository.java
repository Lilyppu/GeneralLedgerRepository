package com.GeneralLedger.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.GeneralLedger.Models.GlGltDet;
import com.GeneralLedger.Models.GlGltDetailCompkey;

@Repository
public interface IGlGltDtailRepository extends JpaRepository<GlGltDet,GlGltDetailCompkey> {

		public List<GlGltDet> findByGlGltDtlRef(String reffno);
		
		public Optional<GlGltDet> findByGlGltDtlRefAndGlDltDtlSeqNo(String reffno, Integer seqno);
		
		@Procedure(procedureName = "P_POST_JOURNAL")
		public String runPostJournal(String p_reffno, String msg);	
		
		@Procedure(procedureName = "P_INSERT_REFFJOURNAL")
		public String runInsReffJournal(String p_accno, String p_reffno, String p_reffdate, String msg);
		
		@Procedure(procedureName = "P_UPDATE_JOURNAL")
		public String runUpdateJournal(String p_reffno, String p_date , String p_effdate , 
				String p_docno, String p_doctype, String p_curr, String p_reffjournal, 
				String p_alcode, String outmsg);
	    
		 @Modifying
		 @Query("DELETE FROM GlGltDet m WHERE m.glGltDtlRef =?1 and m.glDltDtlSeqNo=?2") // how do I write this?
		 public void deleteReffNo(String reff, Integer seq);
		 
		 @Query("select distinct to_char(s.glGltDtlGlDate,'dd/mm/yyyy') from GlGltDet s "
		 		+ "where (s.glGltDtlRef=?1 or to_char(s.glGltDtlGlDate,'ddmmyyyy')=?2)")
		 public String getGlDate(String pGlRef, String pGlDate);	
		 
}

