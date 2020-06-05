package org.sid.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class AccidentAmbulancier {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	   
    @JoinColumn(name = "accident_id")
	@JsonManagedReference
  Accident accident;
 
    @ManyToOne
 
    @JoinColumn(name = "ambulancier_id")
    @JsonManagedReference
    Ambulancier ambulancier;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Accident getAccident() {
		return accident;
	}

	public void setAccident(Accident accident) {
		this.accident = accident;
	}

	public Ambulancier getAmbulancier() {
		return ambulancier;
	}

	public void setAmbulancier(Ambulancier ambulancier) {
		this.ambulancier = ambulancier;
	}

	public AccidentAmbulancier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccidentAmbulancier(Long id, Accident accident, Ambulancier ambulancier) {
		this.id = id;
		this.accident = accident;
		this.ambulancier = ambulancier;
	}
    
    

}
