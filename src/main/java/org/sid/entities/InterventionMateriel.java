package org.sid.entities;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
public class InterventionMateriel implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
   
    @JoinColumn(name = "intervention_id")
	@JsonManagedReference
    Intervention intervention;
 
    @ManyToOne
 
    @JoinColumn(name = "materiel_id")
    @JsonManagedReference
    Materiel materiel;
    
    
	 
	 
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Intervention getIntervention() {
		return intervention;
	}
	public void setIntervention(Intervention intervention) {
		this.intervention = intervention;
	}
	public Materiel getMateriel() {
		return materiel;
	}
	public void setMateriel(Materiel materiel) {
		this.materiel = materiel;
	}
	
	
	
	
	
	public InterventionMateriel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InterventionMateriel(Long id, Intervention intervention, Materiel materiel) {
		super();
		this.id = id;
		this.intervention = intervention;
		this.materiel = materiel;
	}
	
	
	 
}
