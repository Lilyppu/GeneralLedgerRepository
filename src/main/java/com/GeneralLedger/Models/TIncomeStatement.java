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
@Table(name = "T_INCOMESTATEMENT_MONTHLY")
public class TIncomeStatement {
	
	@Id
	@Column(name="tism_id")
	private Integer tismId;
	
	@Column(name="tism_company",length=100)
	private String tismCompany;
	
	@Column(name="tism_monthly",length=10)
	private String tismMonth;
	
	@Column(name="tism_fpos",length=30)
	private String tismFpos;
	
	@Column(name="tism_fposdesc",length=100)
	private String tismfposDesc;
	
	@Column(name="tism_amount")
	private BigDecimal tismAmount;
	
	@Column(name="tism_level")
	private Integer tismLevel;
	
	@Column(name="tism_sum_into", length=25)
	private String tismSumInto;

}
