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

import com.GeneralLedger.Models.GlGltDetAndAcMst;
import com.GeneralLedger.Models.GlGltDetAndAcMstCompkey;

@Repository
public interface IGlGltDetAndAcMstRepository extends JpaRepository<GlGltDetAndAcMst, GlGltDetAndAcMstCompkey> {
	
	@Query(value="select ggd.gl_ref, ggd.gl_seq_no, ggd.ac_acc, gam.ac_desc, ggd.gl_desc, ggd.gl_amt, ggd.gl_db_cr "
				  + "from general_ledger.gl_glt_detail ggd, general_ledger.gl_ac_mstr gam where ggd.ac_acc = gam.ac_code "
				  + "and (ggd.gl_ref = :pRef or to_char(ggd.gl_date,'ddmmyyyy') = :pDate) "
				  + "order by ggd.gl_ref, ggd.gl_seq_no", nativeQuery = true)
	List<GlGltDetAndAcMst> getGlGltDetPList(String pRef, String pDate);

}

