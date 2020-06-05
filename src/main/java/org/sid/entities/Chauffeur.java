package org.sid.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Chauffeur implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nameChauffeur;
	private String lastNameChauffeur;
	private String addressChauffeur;
	private String cityChauffeur;
	private String emailChauffeur;
	private String phoneChauffeur;
	@OneToMany(mappedBy = "chauffeur", cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	 @JsonBackReference
  Set<Transport> transport;
	
	@OneToMany(mappedBy = "chauffeur",cascade = CascadeType.REMOVE,orphanRemoval = true,fetch=FetchType.EAGER)
	@JsonBackReference
    Set<DeclarationAcc> declarationAcc;
	@OneToMany(mappedBy = "chauffeur",cascade = CascadeType.REMOVE,orphanRemoval = true,fetch=FetchType.EAGER)
	@JsonBackReference
    Set<DeclarationAccident> declarationAccident;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameChauffeur() {
		return nameChauffeur;
	}

	public void setNameChauffeur(String nameChauffeur) {
		this.nameChauffeur = nameChauffeur;
	}

	public String getLastNameChauffeur() {
		return lastNameChauffeur;
	}

	public void setLastNameChauffeur(String lastNameChauffeur) {
		this.lastNameChauffeur = lastNameChauffeur;
	}

	public String getAddressChauffeur() {
		return addressChauffeur;
	}

	public void setAddressChauffeur(String addressChauffeur) {
		this.addressChauffeur = addressChauffeur;
	}

	public String getCityChauffeur() {
		return cityChauffeur;
	}

	public void setCityChauffeur(String cityChauffeur) {
		this.cityChauffeur = cityChauffeur;
	}

	public String getEmailChauffeur() {
		return emailChauffeur;
	}

	public void setEmailChauffeur(String emailChauffeur) {
		this.emailChauffeur = emailChauffeur;
	}

	public String getPhoneChauffeur() {
		return phoneChauffeur;
	}

	public void setPhoneChauffeur(String phoneChauffeur) {
		this.phoneChauffeur = phoneChauffeur;
	}

	public Set<Transport> getTransport() {
		return transport;
	}

	public void setTransport(Set<Transport> transport) {
		this.transport = transport;
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

	public Chauffeur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Chauffeur(Long id, String nameChauffeur, String lastNameChauffeur, String addressChauffeur,
			String cityChauffeur, String emailChauffeur, String phoneChauffeur, Set<Transport> transport,
			Set<DeclarationAcc> declarationAcc, Set<DeclarationAccident> declarationAccident) {
		super();
		this.id = id;
		this.nameChauffeur = nameChauffeur;
		this.lastNameChauffeur = lastNameChauffeur;
		this.addressChauffeur = addressChauffeur;
		this.cityChauffeur = cityChauffeur;
		this.emailChauffeur = emailChauffeur;
		this.phoneChauffeur = phoneChauffeur;
		this.transport = transport;
		this.declarationAcc = declarationAcc;
		this.declarationAccident = declarationAccident;
	}

	

	

	
	
	
	

	

}
