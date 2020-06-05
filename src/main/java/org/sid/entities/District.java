package org.sid.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class District implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String nameDistrict;
	
	@OneToMany(mappedBy = "district",cascade = CascadeType.REMOVE,orphanRemoval = true,fetch=FetchType.EAGER)
	@JsonBackReference
    Set<Depot> depot;
	@OneToMany(mappedBy = "district",cascade = CascadeType.REMOVE,orphanRemoval = true,fetch=FetchType.EAGER)
	@JsonBackReference
    Set<DeclarationAccident> declarationAccident;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNameDistrict() {
		return nameDistrict;
	}
	public void setNameDistrict(String nameDistrict) {
		this.nameDistrict = nameDistrict;
	}
	
	public Set<Depot> getDepot() {
		return depot;
	}
	public void setDepot(Set<Depot> depot) {
		this.depot = depot;
	}
	
	
	public Set<DeclarationAccident> getDeclarationAccident() {
		return declarationAccident;
	}
	public void setDeclarationAccident(Set<DeclarationAccident> declarationAccident) {
		this.declarationAccident = declarationAccident;
	}
	public District() {
		super();
		// TODO Auto-generated constructor stub
	}
	public District(Long id, String nameDistrict, Set<Depot> depot, Set<DeclarationAccident> declarationAccident) {
		super();
		this.id = id;
		this.nameDistrict = nameDistrict;
		this.depot = depot;
		this.declarationAccident = declarationAccident;
	}
	
	
	
}
