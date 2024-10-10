package com.GeneralLedger.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.GeneralLedger.Models.GlSacMaster;
import com.GeneralLedger.Models.GlSacMasterCompKey;
import com.GeneralLedger.Models.GlTypeMaster;

@Repository
public interface IGlSacMaster extends JpaRepository<GlSacMaster, GlSacMasterCompKey> {
	
	Optional<GlSacMaster> findByglsmsacaccAndGlsmsacsub(String acc,String subacc);
	
	List<GlSacMaster> findByglsmacstatus(String status);
	
	List<GlSacMaster> findByglsmsacacc(String acc);
	
	List<GlSacMaster> findByglsmsacaccAndGlsmsacsubContaining(String acc,String subacc);
	
	List<GlSacMaster> findByglsmsacaccAndGlsmascdescContaining(String acc,String desc);
	
	List<GlSacMaster> findByglsmsacaccContaining(String acc);
	
	List<GlSacMaster> findByglsmacstatusAndGlsmsacaccContaining(String status, String acc);
	
	List<GlSacMaster> findByglsmsacsubContaining(String subacc);
	
	List<GlSacMaster> findByglsmacstatusAndGlsmsacsubContaining(String status, String subacc);
	
	List<GlSacMaster> findByglsmascdescContaining(String desc);
	
	List<GlSacMaster> findByglsmacstatusAndGlsmascdescContaining(String status, String desc);
	
	List<GlSacMaster> findByglsmacstatusAndGlsmsacacc(String status,String acc );
	
	List<GlSacMaster> findByglsmacstatusAndGlsmsacaccAndGlsmsacsubContaining(String status,String acc,String subacc );
	
	List<GlSacMaster> findByglsmacstatusAndGlsmsacaccAndGlsmascdescContaining(String status,String acc,String desc );
	
	@Query("select s.glsmascdesc from GlSacMaster s where s.glsmsacsub=?1")
	public String getMstAccSubDesc(String code);

}
