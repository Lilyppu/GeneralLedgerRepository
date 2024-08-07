package com.GeneralLedger.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.GeneralLedger.Models.GlFuMaster;

@Repository
public interface IGlFuMasterRepository extends JpaRepository<GlFuMaster, Integer> {
	
	List<GlFuMaster> findByglFuStatusAndGlFuSeq(String status,Integer Seqno);
	
	List<GlFuMaster> findByglFuCodeContaining(String Code);
	
	List<GlFuMaster> findByglFuDescContaining(String desc);
	
	List<GlFuMaster> findByglFuStatus(String status);
	
	Optional<GlFuMaster> findByglFuSeq(Integer seq);
	
	@Query("select s.glFuDesc from GlFuMaster s where s.glFuCode=?1")
	public String getMstFuDesc(String code);

}
