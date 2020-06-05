package org.sid.entities;

import java.io.Serializable;
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
public class Emplacement implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private  String delegation;
	private  String gouvernorat;
	private String localisation;
	@OneToMany(mappedBy = "emplacement", cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	 @JsonBackReference
    Set<Accident> accident;
	@OneToMany(mappedBy = "emplacementt",cascade = CascadeType.REMOVE,orphanRemoval = true,fetch=FetchType.EAGER)
	@JsonBackReference
    Set<DeclarationAcc> declarationAcc;
	@OneToMany(mappedBy = "emplacement",cascade = CascadeType.REMOVE,orphanRemoval = true,fetch=FetchType.EAGER)
	@JsonBackReference
    Set<DeclarationAccident> declarationAccident;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public String getDelegation() {
		return delegation;
	}
	public void setDelegation(String delegation) {
		this.delegation = delegation;
	}
	public String getGouvernorat() {
		return gouvernorat;
	}
	public void setGouvernorat(String gouvernorat) {
		this.gouvernorat = gouvernorat;
	}
	public String getLocalisation() {
		return localisation;
	}
	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}
	public Set<Accident> getAccident() {
		return accident;
	}
	public void setAccident(Set<Accident> accident) {
		this.accident = accident;
	}
	
	public Set<DeclarationAcc> getDeclarationAcc() {
		return declarationAcc;
	}
	public void setDeclarationAcc(Set<DeclarationAcc> declarationAcc) {
		this.declarationAcc = declarationAcc;
	}
	
	public Set<DeclarationAccident> getDeclarationAccident() {
		return declarationAccident;
	}
	public void setDeclarationAccident(Set<DeclarationAccident> declarationAccident) {
		this.declarationAccident = declarationAccident;
	}
	public Emplacement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emplacement(Long id, String delegation, String gouvernorat, String localisation, Set<Accident> accident,
			Set<DeclarationAcc> declarationAcc, Set<DeclarationAccident> declarationAccident) {
		super();
		this.id = id;
		this.delegation = delegation;
		this.gouvernorat = gouvernorat;
		this.localisation = localisation;
		this.accident = accident;
		this.declarationAcc = declarationAcc;
		this.declarationAccident = declarationAccident;
	}
	
	
	

}
