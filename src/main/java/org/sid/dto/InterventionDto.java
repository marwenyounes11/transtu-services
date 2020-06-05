package org.sid.dto;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

public class InterventionDto {
	private Long id;
	private String action;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="HH:mm:ss", timezone = "UTC")
    @Temporal(TemporalType.TIME)
	private Date timeIntervention;
	 @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy", timezone = "UTC")
	    @Temporal(TemporalType.DATE)
	private Date dateIntervention;
	 private Long idAgentIntervention;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public Date getTimeIntervention() {
		return timeIntervention;
	}
	public void setTimeIntervention(Date timeIntervention) {
		this.timeIntervention = timeIntervention;
	}
	public Date getDateIntervention() {
		return dateIntervention;
	}
	public void setDateIntervention(Date dateIntervention) {
		this.dateIntervention = dateIntervention;
	}
	public Long getIdAgentIntervention() {
		return idAgentIntervention;
	}
	public void setIdAgentIntervention(Long idAgentIntervention) {
		this.idAgentIntervention = idAgentIntervention;
	}
	public InterventionDto(Long id, String action, Date timeIntervention, Date dateIntervention,
			Long idAgentIntervention) {
		super();
		this.id = id;
		this.action = action;
		this.timeIntervention = timeIntervention;
		this.dateIntervention = dateIntervention;
		this.idAgentIntervention = idAgentIntervention;
	}
	public InterventionDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	 
	
}
