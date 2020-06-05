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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Depot implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	
	@OneToMany(mappedBy = "depot",cascade = CascadeType.REMOVE,orphanRemoval = true,fetch=FetchType.EAGER)
	@JsonBackReference
    Set<DeclarationAcc> declarationAcc;
	
	@ManyToOne
	@JoinColumn(name = "district_id")
	@JsonManagedReference
    private District district;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

	public Set<DeclarationAcc> getDeclarationAcc() {
		return declarationAcc;
	}
	public void setDeclarationAcc(Set<DeclarationAcc> declarationAcc) {
		this.declarationAcc = declarationAcc;
	}
	
	
	public District getDistrict() {
		return district;
	}
	public void setDistrict(District district) {
		this.district = district;
	}
	public Depot() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Depot(Long id, String name, Set<DeclarationAcc> declarationAcc, District district) {
		super();
		this.id = id;
		this.name = name;
		this.declarationAcc = declarationAcc;
		this.district = district;
	}
	
	
	
	
	

}
