package org.sid.bi.entitie;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class NbrBlesserExterneParSousTypeAccident {
	@Id
	private String id;
	private String description;
	private double nbrBlesserExterne;
	
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
	public double getNbrBlesserExterne() {
		return nbrBlesserExterne;
	}
	public void setNbrBlesserExterne(double nbrBlesserExterne) {
		this.nbrBlesserExterne = nbrBlesserExterne;
	}
	public NbrBlesserExterneParSousTypeAccident() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NbrBlesserExterneParSousTypeAccident(String id, String description, double nbrBlesserExterne) {
		super();
		this.id = id;
		this.description = description;
		this.nbrBlesserExterne = nbrBlesserExterne;
	}
	
}
