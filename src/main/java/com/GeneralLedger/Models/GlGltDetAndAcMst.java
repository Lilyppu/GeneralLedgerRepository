package com.GeneralLedger.Models;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@IdClass(GlGltDetAndAcMstCompkey.class)
public class GlGltDetAndAcMst {
	
	@Id
	@Column(name="GL_REF",length=20,  nullable = false)
	private String glGltDetAndAcMstRef;
	
	@Id
	@Column(name="GL_SEQ_NO")
	private Integer glGltDetAndAcMstSeqNo;
	
	@Column(name="AC_ACC",length=20)
	private String glGltDetAndAcMstAcc;
	
	@Column(name="AC_DESC",length=50)
	private String glGltDetAndAcMstAccDesc;
	
	@Column(name="GL_DESC",length=50,  nullable = false)
	private String glGltDetAndAcMstGlDesc;
	
	@Column(name="GL_AMT")
	private BigDecimal glGltDetAndAcMstAmt;
	
	@Column(name="GL_DB_CR",length=1)
	private String glGltDetAndAcMstDbCr;

}
