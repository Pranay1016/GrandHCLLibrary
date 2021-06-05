package com.hcl.GrandHCLLibrary.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Author : Pranay Kamble
@Entity
@Table(name = "BOOKS")
public class BookEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private Integer UUID;
	
	@Column
	private String NAME;
	
	@Column
	private String TITLE;
	
	@Column
	private String AUTHOR;
	
	@Column
	private String CATEGORY;
	
	@Column
	private String STATUS;
	
	@Column(name = "BORROWED_ON")
	private Date BORROWEDON;
	
	@Column(name = "RETURN_DATE")
	private Date RETURNDATE;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getUUID() {
		return UUID;
	}

	public void setUUID(Integer uUID) {
		UUID = uUID;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public String getTITLE() {
		return TITLE;
	}

	public void setTITLE(String tITLE) {
		TITLE = tITLE;
	}

	public String getAUTHOR() {
		return AUTHOR;
	}

	public void setAUTHOR(String aUTHOR) {
		AUTHOR = aUTHOR;
	}

	public String getCATEGORY() {
		return CATEGORY;
	}

	public void setCATEGORY(String cATEGORY) {
		CATEGORY = cATEGORY;
	}

	public String getSTATUS() {
		return STATUS;
	}

	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}

	public Date getBORROWEDON() {
		return BORROWEDON;
	}

	public void setBORROWEDON(Date bORROWEDON) {
		BORROWEDON = bORROWEDON;
	}

	public Date getRETURNDATE() {
		return RETURNDATE;
	}

	public void setRETURNDATE(Date rETURNDATE) {
		RETURNDATE = rETURNDATE;
	}
	
	
	
}
