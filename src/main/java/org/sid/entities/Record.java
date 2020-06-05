package org.sid.entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Record implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	
	private String descriptionRecord;
	@OneToOne(fetch = FetchType.EAGER,
            
            mappedBy = "record")
	 @JsonBackReference
	    private Accident accident;
	@OneToMany(mappedBy = "record",cascade = CascadeType.REMOVE,orphanRemoval = true,fetch=FetchType.EAGER)
	@JsonBackReference
    Set<DeclarationAcc> declarationAcc;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	
	public String getDescriptionRecord() {
		return descriptionRecord;
	}
	public void setDescriptionRecord(String descriptionRecord) {
		this.descriptionRecord = descriptionRecord;
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
	
	
	public Record() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Record(Long id, String descriptionRecord, Accident accident, Set<DeclarationAcc> declarationAcc) {
		super();
		this.id = id;
		this.descriptionRecord = descriptionRecord;
		this.accident = accident;
		this.declarationAcc = declarationAcc;
	}
	
	
	
	
	
	
	
}
