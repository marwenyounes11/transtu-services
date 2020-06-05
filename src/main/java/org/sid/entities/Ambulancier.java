package org.sid.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
public class Ambulancier implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nameAmbulancier;
	private String lastNameAmbulancier;
	private String phoneAmbulancier;
	@OneToMany(mappedBy = "ambulancier",cascade = CascadeType.REMOVE,orphanRemoval = true,fetch=FetchType.EAGER)
	 @JsonBackReference
    Set<AccidentAmbulancier> accidentAmbulancier;
	@OneToMany(mappedBy = "ambulancier",cascade = CascadeType.REMOVE,orphanRemoval = true,fetch=FetchType.EAGER)
	@JsonBackReference
    Set<DeclarationRes> declarationRes;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNameAmbulancier() {
		return nameAmbulancier;
	}
	public void setNameAmbulancier(String nameAmbulancier) {
		this.nameAmbulancier = nameAmbulancier;
	}
	public String getLastNameAmbulancier() {
		return lastNameAmbulancier;
	}
	public void setLastNameAmbulancier(String lastNameAmbulancier) {
		this.lastNameAmbulancier = lastNameAmbulancier;
	}
	public String getPhoneAmbulancier() {
		return phoneAmbulancier;
	}
	public void setPhoneAmbulancier(String phoneAmbulancier) {
		this.phoneAmbulancier = phoneAmbulancier;
	}
	public Set<AccidentAmbulancier> getAccidentAmbulancier() {
		return accidentAmbulancier;
	}
	public void setAccidentAmbulancier(Set<AccidentAmbulancier> accidentAmbulancier) {
		this.accidentAmbulancier = accidentAmbulancier;
	}
	
	
	public Set<DeclarationRes> getDeclarationRes() {
		return declarationRes;
	}
	public void setDeclarationRes(Set<DeclarationRes> declarationRes) {
		this.declarationRes = declarationRes;
	}
	public Ambulancier() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ambulancier(Long id, String nameAmbulancier, String lastNameAmbulancier, String phoneAmbulancier,
			Set<AccidentAmbulancier> accidentAmbulancier, Set<DeclarationRes> declarationRes) {
		super();
		this.id = id;
		this.nameAmbulancier = nameAmbulancier;
		this.lastNameAmbulancier = lastNameAmbulancier;
		this.phoneAmbulancier = phoneAmbulancier;
		this.accidentAmbulancier = accidentAmbulancier;
		this.declarationRes = declarationRes;
	}
	
	
	
}
