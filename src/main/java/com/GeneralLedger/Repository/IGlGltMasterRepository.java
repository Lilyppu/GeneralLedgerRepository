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

import com.GeneralLedger.Models.GlGltMaster;

@Repository
public interface IGlGltMasterRepository extends JpaRepository<GlGltMaster, String>{
	
	public List<GlGltMaster> findByGlMstrRef(String ref);
	

}
