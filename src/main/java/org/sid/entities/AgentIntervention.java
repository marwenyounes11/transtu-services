package org.sid.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class AgentIntervention implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id ;
	private String nameAgentInt;
	private String lastNameAgentInt;
	private String phoneAgentInt ;
	private String emailAgentInt;
	@OneToMany(mappedBy="agentIntervention",cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	@JsonBackReference
	private Collection<Intervention> interventions ;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	
	public Collection<Intervention> getInterventions() {
		return interventions;
	}
	public void setInterventions(Collection<Intervention> interventions) {
		this.interventions = interventions;
	}
	public AgentIntervention() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AgentIntervention(Long id, String nameAgentInt, String lastNameAgentInt, String phoneAgentInt,
			String emailAgentInt, Collection<Intervention> interventions) {
		super();
		this.id = id;
		this.nameAgentInt = nameAgentInt;
		this.lastNameAgentInt = lastNameAgentInt;
		this.phoneAgentInt = phoneAgentInt;
		this.emailAgentInt = emailAgentInt;
		this.interventions = interventions;
	}
	

}
