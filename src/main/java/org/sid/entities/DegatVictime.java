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
public class DegatVictime {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
    @JoinColumn(name = "degat_id")
	@JsonManagedReference
  Degat degatPhysique;
 
    @ManyToOne
    @JoinColumn(name = "victime_id")
    @JsonManagedReference
    Victime victime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public Degat getDegatPhysique() {
		return degatPhysique;
	}

	public void setDegatPhysique(Degat degatPhysique) {
		this.degatPhysique = degatPhysique;
	}

	public Victime getVictime() {
		return victime;
	}

	public void setVictime(Victime victime) {
		this.victime = victime;
	}

	public DegatVictime() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DegatVictime(Long id, Degat degatPhysique, Victime victime) {
		this.id = id;
		this.degatPhysique = degatPhysique;
		this.victime = victime;
	}

	
    

}
