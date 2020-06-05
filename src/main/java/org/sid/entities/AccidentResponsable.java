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
public class AccidentResponsable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	   
    @JoinColumn(name = "accident_id")
	@JsonManagedReference
  Accident accident;
 
    @ManyToOne
 
    @JoinColumn(name = "responsable_id")
    @JsonManagedReference
    Responsable responsable;

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

	public Responsable getResponsable() {
		return responsable;
	}

	public void setResponsable(Responsable responsable) {
		this.responsable = responsable;
	}

	public AccidentResponsable() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccidentResponsable(Long id, Accident accident, Responsable responsable) {
		this.id = id;
		this.accident = accident;
		this.responsable = responsable;
	}
    
}
