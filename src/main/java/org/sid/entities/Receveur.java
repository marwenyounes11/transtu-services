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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Receveur implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id ;
	private String nameReceveur;
	private String lastNameReceveur;
	private String addressReceveur;
	private String cityReceveur;

	private String emailReceveur ;
	private String phoneReceveur ;
	
	@OneToMany(mappedBy = "receveur", cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	 @JsonBackReference
 Set<Transport> transport;
	@OneToMany(mappedBy = "receveur",cascade = CascadeType.REMOVE,orphanRemoval = true,fetch=FetchType.EAGER)
	@JsonBackReference
    Set<DeclarationAcc> declarationAcc;
	@OneToMany(mappedBy = "receveur",cascade = CascadeType.REMOVE,orphanRemoval = true,fetch=FetchType.EAGER)
	@JsonBackReference
    Set<DeclarationAccident> declarationAccident;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public String getNameReceveur() {
		return nameReceveur;
	}

	public void setNameReceveur(String nameReceveur) {
		this.nameReceveur = nameReceveur;
	}

	public String getLastNameReceveur() {
		return lastNameReceveur;
	}

	public void setLastNameReceveur(String lastNameReceveur) {
		this.lastNameReceveur = lastNameReceveur;
	}

	public String getAddressReceveur() {
		return addressReceveur;
	}

	public void setAddressReceveur(String adressReceveur) {
		this.addressReceveur = adressReceveur;
	}

	public String getCityReceveur() {
		return cityReceveur;
	}

	public void setCityReceveur(String cityReceveur) {
		this.cityReceveur = cityReceveur;
	}

	public String getEmailReceveur() {
		return emailReceveur;
	}

	public void setEmailReceveur(String emailReceveur) {
		this.emailReceveur = emailReceveur;
	}

	public String getPhoneReceveur() {
		return phoneReceveur;
	}

	public void setPhoneReceveur(String phoneReceveur) {
		this.phoneReceveur = phoneReceveur;
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

	public Receveur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Receveur(Long id, String nameReceveur, String lastNameReceveur, String addressReceveur, String cityReceveur,
			String emailReceveur, String phoneReceveur, Set<Transport> transport, Set<DeclarationAcc> declarationAcc,
			Set<DeclarationAccident> declarationAccident) {
		super();
		this.id = id;
		this.nameReceveur = nameReceveur;
		this.lastNameReceveur = lastNameReceveur;
		this.addressReceveur = addressReceveur;
		this.cityReceveur = cityReceveur;
		this.emailReceveur = emailReceveur;
		this.phoneReceveur = phoneReceveur;
		this.transport = transport;
		this.declarationAcc = declarationAcc;
		this.declarationAccident = declarationAccident;
	}


	
	

	
	

	

	

       
}
