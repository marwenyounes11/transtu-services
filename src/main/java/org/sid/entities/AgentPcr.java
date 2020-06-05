package org.sid.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class AgentPcr implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id ;
	private String nameAgent;
	private String lastNameAgent;
	private String phoneAgent ;
	
	@OneToMany(mappedBy="agentPcr",cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	 @JsonBackReference
	private Collection<Accident> accidents ;
	@OneToMany(mappedBy = "agentPcr",cascade = CascadeType.REMOVE,orphanRemoval = true,fetch=FetchType.EAGER)
	@JsonBackReference
    Set<DeclarationAcc> declarationAcc;
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
	
	public Collection<Accident> getAccidents() {
		return accidents;
	}
	public void setAccidents(Collection<Accident> accidents) {
		this.accidents = accidents;
	}
	
	public Set<DeclarationAcc> getDeclarationAcc() {
		return declarationAcc;
	}
	public void setDeclarationAcc(Set<DeclarationAcc> declarationAcc) {
		this.declarationAcc = declarationAcc;
	}
	public AgentPcr() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AgentPcr(Long id, String nameAgent, String lastNameAgent, String phoneAgent, Collection<Accident> accidents,
			Set<DeclarationAcc> declarationAcc) {
		super();
		this.id = id;
		this.nameAgent = nameAgent;
		this.lastNameAgent = lastNameAgent;
		this.phoneAgent = phoneAgent;
		this.accidents = accidents;
		this.declarationAcc = declarationAcc;
	}
	
	

}
