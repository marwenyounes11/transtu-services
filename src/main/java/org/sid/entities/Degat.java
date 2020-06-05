package org.sid.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity

public class Degat implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String descriptionDegat;
	private String estimationPrixDegat ;
	@ManyToOne
	@JoinColumn(name = "accident_id")
	@JsonManagedReference
	private Accident accident;
	
	@OneToMany(mappedBy = "degatMateriel",cascade = CascadeType.REMOVE,orphanRemoval = true,fetch=FetchType.EAGER)
	 @JsonBackReference
    Set<DegatTransport> degatTransport;
	
	@OneToMany(mappedBy = "degatPhysique", cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	 @JsonBackReference
    Set<DegatVictime> degatVictime;
	@OneToMany(mappedBy = "degat",cascade = CascadeType.REMOVE,orphanRemoval = true,fetch=FetchType.EAGER)
	@JsonBackReference
    Set<DeclarationAcc> declarationAcc;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getDescriptionDegat() {
		return descriptionDegat;
	}

	public void setDescriptionDegat(String descriptionDegat) {
		this.descriptionDegat = descriptionDegat;
	}

	
	public String getEstimationPrixDegat() {
		return estimationPrixDegat;
	}

	public void setEstimationPrixDegat(String estimationPrixDegat) {
		this.estimationPrixDegat = estimationPrixDegat;
	}

	public Accident getAccident() {
		return accident;
	}

	public void setAccident(Accident accident) {
		this.accident = accident;
	}

	
	
	public Set<DegatTransport> getDegatTransport() {
		return degatTransport;
	}

	public void setDegatTransport(Set<DegatTransport> degatTransport) {
		this.degatTransport = degatTransport;
	}

	public Set<DegatVictime> getDegatVictime() {
		return degatVictime;
	}

	public void setDegatVictime(Set<DegatVictime> degatVictime) {
		this.degatVictime = degatVictime;
	}

	

	
	public Set<DeclarationAcc> getDeclarationAcc() {
		return declarationAcc;
	}

	public void setDeclarationAcc(Set<DeclarationAcc> declarationAcc) {
		this.declarationAcc = declarationAcc;
	}

	

	public Degat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Degat(Long id, String descriptionDegat, String estimationPrixDegat, Accident accident,
			Set<DegatTransport> degatTransport, Set<DegatVictime> degatVictime, Set<DeclarationAcc> declarationAcc) {
		super();
		this.id = id;
		this.descriptionDegat = descriptionDegat;
		this.estimationPrixDegat = estimationPrixDegat;
		this.accident = accident;
		this.degatTransport = degatTransport;
		this.degatVictime = degatVictime;
		this.declarationAcc = declarationAcc;
	}

	

	
	

	
	
	
	

	

	
	

	

	
	

	
	

}
