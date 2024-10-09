package com.GeneralLedger.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "gl_glt_mstr")
public class GlGltMaster {
	@Id
	@Column(name="glm_ref",length=20,  nullable = false)
	private String glMstrRef;
	
	@Column(name="glm_desc",length=250)
	private String glMstrDesc;
	
	
	@Column(name="glm_date")
	private Date glMstrDate;
	
	@Column(name="glm_post")
	private String glMstrPost;	
	
	@Column(name="glm_curr")
	private String glMstrCurr;	
	
	@Column(name="glm_doc")
	private String glMstrDoc;	
	
	@Column(name="glm_doc_type")
	private String glMstrDocType;
	
	@Column(name="glm_ref_journal")
	private String glMstrRefJournal;
	
	@Column(name="glm_al_code")
	private String glMstrAlCode;
	

	 @Column(name="AC_USER_CRE",length=20)
	 private String glGltDtlUserCrea;
	 
	 @Column(name="AC_DATE_CRE")
	 @JsonFormat(pattern = "dd/MM/yyyy")
	 private Date glGltDtlDateCrea;
	 
	 @Column(name="AC_USER_UPD",length=20)
	 private String glGltDtlUserUpd;
	 
	 @Column(name="AC_DATE_UPD")
	 @JsonFormat(pattern = "dd/MM/yyyy")
	 private Date glGltDtlDateUpd;

}
