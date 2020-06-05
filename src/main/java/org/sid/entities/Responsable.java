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
public class Responsable implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nameResponsable;
	private String lastNameResponsable;
	private String phoneResponsable;
	private String natureResponsable;
	@OneToMany(mappedBy = "responsable",cascade = CascadeType.REMOVE,orphanRemoval = true,fetch=FetchType.EAGER)
	 @JsonBackReference
    Set<AccidentResponsable> accidentResponsable;
	
	@OneToMany(mappedBy = "responsable",cascade = CascadeType.REMOVE,orphanRemoval = true,fetch=FetchType.EAGER)
	@JsonBackReference
    Set<DeclarationRes> declarationRes;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNameResponsable() {
		return nameResponsable;
	}
	public void setNameResponsable(String nameResponsable) {
		this.nameResponsable = nameResponsable;
	}
	public String getLastNameResponsable() {
		return lastNameResponsable;
	}
	public void setLastNameResponsable(String lastNameResponsable) {
		this.lastNameResponsable = lastNameResponsable;
	}
	public String getPhoneResponsable() {
		return phoneResponsable;
	}
	public void setPhoneResponsable(String phoneResponsable) {
		this.phoneResponsable = phoneResponsable;
	}
	
	public String getNatureResponsable() {
		return natureResponsable;
	}
	public void setNatureResponsable(String natureResponsable) {
		this.natureResponsable = natureResponsable;
	}
	public Set<AccidentResponsable> getAccidentResponsable() {
		return accidentResponsable;
	}
	public void setAccidentResponsable(Set<AccidentResponsable> accidentResponsable) {
		this.accidentResponsable = accidentResponsable;
	}
	
	
	public Set<DeclarationRes> getDeclarationRes() {
		return declarationRes;
	}
	public void setDeclarationRes(Set<DeclarationRes> declarationRes) {
		this.declarationRes = declarationRes;
	}
	public Responsable() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Responsable(Long id, String nameResponsable, String lastNameResponsable, String phoneResponsable,
			String natureResponsable, Set<AccidentResponsable> accidentResponsable,
			Set<DeclarationRes> declarationRes) {
		super();
		this.id = id;
		this.nameResponsable = nameResponsable;
		this.lastNameResponsable = lastNameResponsable;
		this.phoneResponsable = phoneResponsable;
		this.natureResponsable = natureResponsable;
		this.accidentResponsable = accidentResponsable;
		this.declarationRes = declarationRes;
	}
	
		
	
}
