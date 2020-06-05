package org.sid.dto;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

public class AgentPcrDto {
	private Long id;
	private String nameAgent;
	private String lastNameAgent;
	private String phoneAgent ;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNameAgent() {
		return nameAgent;
	}
	public void setNameAgent(String nameAgent) {
		this.nameAgent = nameAgent;
	}
	public String getLastNameAgent() {
		return lastNameAgent;
	}
	public void setLastNameAgent(String lastNameAgent) {
		this.lastNameAgent = lastNameAgent;
	}
	public String getPhoneAgent() {
		return phoneAgent;
	}
	public void setPhoneAgent(String phoneAgent) {
		this.phoneAgent = phoneAgent;
	}
	
	
	public AgentPcrDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AgentPcrDto(Long id, String nameAgent, String lastNameAgent, String phoneAgent) {
		super();
		this.id = id;
		this.nameAgent = nameAgent;
		this.lastNameAgent = lastNameAgent;
		this.phoneAgent = phoneAgent;
	}
	
	
	
}
