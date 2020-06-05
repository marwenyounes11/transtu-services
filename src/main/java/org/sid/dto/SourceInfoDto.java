package org.sid.dto;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

public class SourceInfoDto {
	private Long id;
	private String nameInfo;
	private String lastNameInfo;
	private String natureInfo;
	private String phoneInfo ;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNameInfo() {
		return nameInfo;
	}
	public void setNameInfo(String nameInfo) {
		this.nameInfo = nameInfo;
	}
	public String getLastNameInfo() {
		return lastNameInfo;
	}
	public void setLastNameInfo(String lastNameInfo) {
		this.lastNameInfo = lastNameInfo;
	}
	public String getNatureInfo() {
		return natureInfo;
	}
	public void setNatureInfo(String natureInfo) {
		this.natureInfo = natureInfo;
	}
	public String getPhoneInfo() {
		return phoneInfo;
	}
	public void setPhoneInfo(String phoneInfo) {
		this.phoneInfo = phoneInfo;
	}
	
	
	public SourceInfoDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SourceInfoDto(Long id, String nameInfo, String lastNameInfo, String natureInfo, String phoneInfo) {
		super();
		this.id = id;
		this.nameInfo = nameInfo;
		this.lastNameInfo = lastNameInfo;
		this.natureInfo = natureInfo;
		this.phoneInfo = phoneInfo;
	}
	
	
	
}
