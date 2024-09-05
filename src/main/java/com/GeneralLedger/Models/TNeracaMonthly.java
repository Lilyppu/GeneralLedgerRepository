package com.GeneralLedger.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "t_neraca_monthly")
public class TNeracaMonthly {
	@Id
	@Column(name="tnm_id")
	private Integer tnmId;
	
	@Column(name="tnm_company",length=100)
	private String tnmCompany;
	
	@Column(name="tnm_monthly",length=10)
	private String tnmMonth;
	
	@Column(name="tnm_fpos",length=30)
	private String tnmFpos;
	
	@Column(name="tnm_fposdesc",length=100)
	private String tnmfposDesc;
	
	@Column(name="tnm_debit")
	private BigDecimal tnmDebit;
	
	@Column(name="tnm_credit")
	private BigDecimal tnmCredit;
	
	@Column(name="tnm_level")
	private Integer tnmLevel;
	
	@Column(name="tnm_sum_into", length=25)
	private String tnmSumInto;
	
	
}
