package org.sid.dto;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

public class RecordDto {
	private Long id;
	
	private String descriptionRecord;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getDescriptionRecord() {
		return descriptionRecord;
	}
	public void setDescriptionRecord(String descriptionRecord) {
		this.descriptionRecord = descriptionRecord;
	}
	public RecordDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RecordDto(Long id, String descriptionRecord) {
		super();
		this.id = id;
		this.descriptionRecord = descriptionRecord;
	}
	
	
}
