package org.sid.bi.entitie;
import javax.persistence.Entity;

import javax.persistence.Id;
@Entity
public class EstimationPrixDegatParSousTypeAccident {
	@Id
	private String id;
	private String description;
	private Double estimationPrixDegat;
	
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
	public Double getEstimationPrixDegat() {
		return estimationPrixDegat;
	}
	public void setEstimationPrixDegat(Double estimationPrixDegat) {
		this.estimationPrixDegat = estimationPrixDegat;
	}
	public EstimationPrixDegatParSousTypeAccident() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EstimationPrixDegatParSousTypeAccident(String id, String description, Double estimationPrixDegat) {
		super();
		this.id = id;
		this.description = description;
		this.estimationPrixDegat = estimationPrixDegat;
	}
	
	
}
