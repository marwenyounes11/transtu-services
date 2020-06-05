package org.sid.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.CascadeType;
@Entity
public class AccidentType implements Serializable {
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
    @JoinColumn(name = "accident_id")
	@JsonManagedReference
  Accident accident;
	@OneToMany(mappedBy = "accidentType",cascade = CascadeType.REMOVE,orphanRemoval = true,fetch=FetchType.EAGER)
	@JsonBackReference
    Set<DeclarationAcc> declarationAcc;
	
	@OneToMany(mappedBy = "accidenttype",cascade = CascadeType.REMOVE,orphanRemoval = true,fetch=FetchType.EAGER)
	@JsonBackReference
    Set<AccidentSubType> accidentSubType;
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
	
	public Accident getAccident() {
		return accident;
	}
	public void setAccident(Accident accident) {
		this.accident = accident;
	}
	
	
	public Set<DeclarationAcc> getDeclarationAcc() {
		return declarationAcc;
	}
	public void setDeclarationAcc(Set<DeclarationAcc> declarationAcc) {
		this.declarationAcc = declarationAcc;
	}
	
	
	public Set<AccidentSubType> getAccidentSubType() {
		return accidentSubType;
	}
	public void setAccidentSubType(Set<AccidentSubType> accidentSubType) {
		this.accidentSubType = accidentSubType;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public AccidentType() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AccidentType(Long id, String label, String alias, Accident accident, Set<DeclarationAcc> declarationAcc,
			Set<AccidentSubType> accidentSubType) {
		super();
		this.id = id;
		this.label = label;
		this.alias = alias;
		this.accident = accident;
		this.declarationAcc = declarationAcc;
		this.accidentSubType = accidentSubType;
	}
	
	
	
	
}
