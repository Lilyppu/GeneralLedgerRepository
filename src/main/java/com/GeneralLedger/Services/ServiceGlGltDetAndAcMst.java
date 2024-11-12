package com.GeneralLedger.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GeneralLedger.Repository.IGlGltDetAndAcMstRepository;

import java.util.Date;

@Service
public class ServiceGlGltDetAndAcMst {
	
	@Autowired
	IGlGltDetAndAcMstRepository repoGltDtlAndAcMst;
	
	public List getGlGltDetPList(String pRef,String pDate) {
		return repoGltDtlAndAcMst.getGlGltDetPList(pRef,pDate);
	}

}
