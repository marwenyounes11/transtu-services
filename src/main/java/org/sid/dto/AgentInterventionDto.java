package org.sid.dto;

public class AgentInterventionDto {
	private String nameAgentInt;
	private String lastNameAgentInt;
	private String phoneAgentInt ;
	private String emailAgentInt;
	public String getNameAgentInt() {
		return nameAgentInt;
	}
	public void setNameAgentInt(String nameAgentInt) {
		this.nameAgentInt = nameAgentInt;
	}
	public String getLastNameAgentInt() {
		return lastNameAgentInt;
	}
	public void setLastNameAgentInt(String lastNameAgentInt) {
		this.lastNameAgentInt = lastNameAgentInt;
	}
	public String getPhoneAgentInt() {
		return phoneAgentInt;
	}
	public void setPhoneAgentInt(String phoneAgentInt) {
		this.phoneAgentInt = phoneAgentInt;
	}
	public String getEmailAgentInt() {
		return emailAgentInt;
	}
	public void setEmailAgentInt(String emailAgentInt) {
		this.emailAgentInt = emailAgentInt;
	}
	public AgentInterventionDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AgentInterventionDto(String nameAgentInt, String lastNameAgentInt, String phoneAgentInt,
			String emailAgentInt) {
		super();
		this.nameAgentInt = nameAgentInt;
		this.lastNameAgentInt = lastNameAgentInt;
		this.phoneAgentInt = phoneAgentInt;
		this.emailAgentInt = emailAgentInt;
	}
	
}
