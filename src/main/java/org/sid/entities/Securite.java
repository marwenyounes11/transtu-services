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
public class Securite implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String typeSecurite;
	@OneToMany(mappedBy = "securite",cascade = CascadeType.REMOVE,orphanRemoval = true,fetch=FetchType.EAGER)
	 @JsonBackReference
    Set<AccidentSecurite> accidentSecurite;
	@OneToMany(mappedBy = "securite",cascade = CascadeType.REMOVE,orphanRemoval = true,fetch=FetchType.EAGER)
	@JsonBackReference
    Set<DeclarationRes> declarationRes;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getTypeSecurite() {
		return typeSecurite;
	}
	public void setTypeSecurite(String typeSecurite) {
		this.typeSecurite = typeSecurite;
	}
	public Set<AccidentSecurite> getAccidentSecurite() {
		return accidentSecurite;
	}
	public void setAccidentSecurite(Set<AccidentSecurite> accidentSecurite) {
		this.accidentSecurite = accidentSecurite;
	}
	
	
	public Set<DeclarationRes> getDeclarationRes() {
		return declarationRes;
	}
	public void setDeclarationRes(Set<DeclarationRes> declarationRes) {
		this.declarationRes = declarationRes;
	}
	public Securite() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Securite(Long id, String typeSecurite, Set<AccidentSecurite> accidentSecurite,
			Set<DeclarationRes> declarationRes) {
		super();
		this.id = id;
		this.typeSecurite = typeSecurite;
		this.accidentSecurite = accidentSecurite;
		this.declarationRes = declarationRes;
	}
	
	
	
}
