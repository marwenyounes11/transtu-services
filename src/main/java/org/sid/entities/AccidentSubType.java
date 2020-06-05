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
public class AccidentSubType implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String label;
	private String alias;
	@ManyToOne 
    @JoinColumn(name = "accidenttype_id")
	@JsonManagedReference
  AccidentType accidenttype;
	@OneToMany(mappedBy = "accidentSubType",cascade = CascadeType.REMOVE,orphanRemoval = true,fetch=FetchType.EAGER)
	@JsonBackReference
    Set<DeclarationAcc> declarationAcc;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public AccidentType getAccidenttype() {
		return accidenttype;
	}
	public void setAccidenttype(AccidentType accidenttype) {
		this.accidenttype = accidenttype;
	}
	public Set<DeclarationAcc> getDeclarationAcc() {
		return declarationAcc;
	}
	public void setDeclarationAcc(Set<DeclarationAcc> declarationAcc) {
		this.declarationAcc = declarationAcc;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public AccidentSubType() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AccidentSubType(Long id, String label, String alias, AccidentType accidenttype,
			Set<DeclarationAcc> declarationAcc) {
		super();
		this.id = id;
		this.label = label;
		this.alias = alias;
		this.accidenttype = accidenttype;
		this.declarationAcc = declarationAcc;
	}
	
	
}
