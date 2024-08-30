package com.GeneralLedger.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GeneralLedger.Models.GlFmMaster;

@Repository
public interface IGlFmMaster extends JpaRepository<GlFmMaster, String>{
	
	Optional<GlFmMaster> findByglfmfmfpos(String fmpos);
	
	List<GlFmMaster> findByglfmacstatus(String status);
	
	
	public List<GlFmMaster> findByGlfmfmdescContaining(String Desc);
	
	public List<GlFmMaster> findByGlfmfmlevel (Integer lv);
	
	public List<GlFmMaster> findByGlfmfmtypeContaining (String ty);

	
	

}
