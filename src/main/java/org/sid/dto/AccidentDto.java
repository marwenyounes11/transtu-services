package org.sid.dto;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

public class AccidentDto {
private Long id;
	
	
	private String timeAccident;
	 
	private String dateAccident;
	
	private String dateInfo;
	
	private String timeInfo;
	 
		private String dateSaisi;
		
		private String timeSaisi;
	private String description;
	
	
    private String photo;
    private Long idEmplacement;
   	private Long idAgentPcr;
   	private Long idRecord;
   	private Long idSourceInfo;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getTimeAccident() {
		return timeAccident;
	}
	public void setTimeAccident(String timeAccident) {
		this.timeAccident = timeAccident;
	}
	
	
	public String getDateAccident() {
		return dateAccident;
	}
	public void setDateAccident(String dateAccident) {
		this.dateAccident = dateAccident;
	}
	public String getDateInfo() {
		return dateInfo;
	}
	public void setDateInfo(String dateInfo) {
		this.dateInfo = dateInfo;
	}
	public String getTimeInfo() {
		return timeInfo;
	}
	public void setTimeInfo(String timeInfo) {
		this.timeInfo = timeInfo;
	}
	
	
	public String getDateSaisi() {
		return dateSaisi;
	}
	public void setDateSaisi(String dateSaisi) {
		this.dateSaisi = dateSaisi;
	}
	public String getTimeSaisi() {
		return timeSaisi;
	}
	public void setTimeSaisi(String timeSaisi) {
		this.timeSaisi = timeSaisi;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	
	
	public Long getIdEmplacement() {
		return idEmplacement;
	}
	public void setIdEmplacement(Long idEmplacement) {
		this.idEmplacement = idEmplacement;
	}
	public Long getIdAgentPcr() {
		return idAgentPcr;
	}
	public void setIdAgentPcr(Long idAgentPcr) {
		this.idAgentPcr = idAgentPcr;
	}
	public Long getIdRecord() {
		return idRecord;
	}
	public void setIdRecord(Long idRecord) {
		this.idRecord = idRecord;
	}
	public Long getIdSourceInfo() {
		return idSourceInfo;
	}
	public void setIdSourceInfo(Long idSourceInfo) {
		this.idSourceInfo = idSourceInfo;
	}
	public AccidentDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AccidentDto(Long id, String timeAccident, String dateAccident, String dateInfo, String timeInfo,
			String dateSaisi, String timeSaisi, String description, String photo, Long idEmplacement, Long idAgentPcr,
			Long idRecord, Long idSourceInfo) {
		super();
		this.id = id;
		this.timeAccident = timeAccident;
		this.dateAccident = dateAccident;
		this.dateInfo = dateInfo;
		this.timeInfo = timeInfo;
		this.dateSaisi = dateSaisi;
		this.timeSaisi = timeSaisi;
		this.description = description;
		this.photo = photo;
		this.idEmplacement = idEmplacement;
		this.idAgentPcr = idAgentPcr;
		this.idRecord = idRecord;
		this.idSourceInfo = idSourceInfo;
	}
	
	
	
}
