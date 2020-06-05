package org.sid.bi.entitie;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class NbrBlesserInterneParSousTypeAccident {
	@Id
	private String id;
	private String description;
	private double nbrBlesserInterne;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getNbrBlesserInterne() {
		return nbrBlesserInterne;
	}
	public void setNbrBlesserInterne(double nbrBlesserInterne) {
		this.nbrBlesserInterne = nbrBlesserInterne;
	}
	public NbrBlesserInterneParSousTypeAccident() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NbrBlesserInterneParSousTypeAccident(String id, String description, double nbrBlesserInterne) {
		super();
		this.id = id;
		this.description = description;
		this.nbrBlesserInterne = nbrBlesserInterne;
	}
	
	

}
