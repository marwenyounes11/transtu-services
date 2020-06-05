package org.sid.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class GroupLine implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nomGroupFR ;
	private String nomGroupAr ;
	
	@ManyToOne
	@JoinColumn(name="depot_id")
	@JsonManagedReference
	private Depot depot ;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomGroupFR() {
		return nomGroupFR;
	}
	public void setNomGroupFR(String nomGroupFR) {
		this.nomGroupFR = nomGroupFR;
	}
	public String getNomGroupAr() {
		return nomGroupAr;
	}
	public void setNomGroupAr(String nomGroupAr) {
		this.nomGroupAr = nomGroupAr;
	}
	public Depot getDepot() {
		return depot;
	}
	public void setDistrict(Depot depot) {
		this.depot = depot;
	}
	public GroupLine(String nomGroupFR, String nomGroupAr) {
		super();
		this.nomGroupFR = nomGroupFR;
		this.nomGroupAr = nomGroupAr;
		
	}
	public GroupLine() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
