package com.GeneralLedger.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.GeneralLedger.Models.GlFmMaster;
import com.GeneralLedger.Models.TNeracaMonthly;

@Repository
public interface ITNeracaMonthlyRepository extends JpaRepository<TNeracaMonthly, Integer> {
	
	@Procedure(procedureName = "p_create_neraca")
	public String runNeraca(String pmonth, String pmsg);	
		
	
}
