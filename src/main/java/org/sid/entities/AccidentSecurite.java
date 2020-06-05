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
public class AccidentSecurite {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	   
    @JoinColumn(name = "accident_id")
	@JsonManagedReference
  Accident accidentt;
 
    @ManyToOne
 
    @JoinColumn(name = "securite_id")
    @JsonManagedReference
    Securite securite;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public Accident getAccidentt() {
		return accidentt;
	}

	public void setAccidentt(Accident accidentt) {
		this.accidentt = accidentt;
	}

	
	

	public Securite getSecurite() {
		return securite;
	}

	public void setSecurite(Securite securite) {
		this.securite = securite;
	}

	public AccidentSecurite() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccidentSecurite(Long id, Accident accidentt, Securite securite) {
		this.id = id;
		this.accidentt = accidentt;
		this.securite = securite;
	}

	
	
    
}
