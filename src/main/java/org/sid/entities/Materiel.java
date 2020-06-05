package org.sid.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "TYPE_MATERIEL", discriminatorType = DiscriminatorType.STRING, length = 8)
public  class Materiel implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String description;
	private String numberSerie;

	
	private String dateAcquisition;
	
	private String datePeremption;

	@OneToMany(mappedBy = "materiel",cascade = CascadeType.ALL,orphanRemoval=true)
	@JsonBackReference
    Set<InterventionMateriel> interventionMateriels;
	
	@ManyToOne
	@JoinColumn(name="departement_id")
	@JsonManagedReference
	private Departement departement ;
	
	@ManyToOne
	@JoinColumn(name="material_type_id")
	@JsonManagedReference
	private MaterialType materialType ;
	
	public MaterialType getMaterialType() {
		return materialType;
	}

	public void setMaterialType(MaterialType materialType) {
		this.materialType = materialType;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNumberSerie() {
		return numberSerie;
	}

	public void setNumberSerie(String numberSerie) {
		this.numberSerie = numberSerie;
	}

	

	public String getDateAcquisition() {
		return dateAcquisition;
	}

	public void setDateAcquisition(String dateAcquisition) {
		this.dateAcquisition = dateAcquisition;
	}

	public String getDatePeremption() {
		return datePeremption;
	}

	public void setDatePeremption(String datePeremption) {
		this.datePeremption = datePeremption;
	}

	public Set<InterventionMateriel> getInterventionMateriels() {
		return interventionMateriels;
	}

	public void setInterventionMateriels(Set<InterventionMateriel> interventionMateriels) {
		this.interventionMateriels = interventionMateriels;
	}

	public Departement getDepartement() {
		return departement;
	}

	public void setDepartement(Departement departement) {
		this.departement = departement;
	}

	public Materiel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Materiel(Long id, String description, String numberSerie, String dateAcquisition, String datePeremption,
			Set<InterventionMateriel> interventionMateriels, Departement departement, MaterialType materialType) {
		super();
		this.id = id;
		this.description = description;
		this.numberSerie = numberSerie;
		this.dateAcquisition = dateAcquisition;
		this.datePeremption = datePeremption;
		this.interventionMateriels = interventionMateriels;
		this.departement = departement;
		this.materialType = materialType;
	}

	

	
	

}
