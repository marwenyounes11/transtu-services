package org.sid.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class MaterielDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String description;
	private String numberSerie;

	
	private String dateAcquisition;
	
	private String datePeremption;
	private Long idDepartement;
	private Long  idMaterialType;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getNumberSerie() {
		return numberSerie;
	}
	public void setNumberSerie(String numberSerie) {
		this.numberSerie = numberSerie;
	}
	public String getDateAcquisition() {
		return dateAcquisition;
	}
	public void setDateAcquisition(String dateAcquisition) {
		this.dateAcquisition = dateAcquisition;
	}
	public String getDatePeremption() {
		return datePeremption;
	}
	public void setDatePeremption(String datePeremption) {
		this.datePeremption = datePeremption;
	}
	public Long getIdDepartement() {
		return idDepartement;
	}
	public void setIdDepartement(Long idDepartement) {
		this.idDepartement = idDepartement;
	}
	public Long getIdMaterialType() {
		return idMaterialType;
	}
	public void setIdMaterialType(Long idMaterialType) {
		this.idMaterialType = idMaterialType;
	}
	public MaterielDto(Long id, String description, String numberSerie, String dateAcquisition, String datePeremption,
			Long idDepartement, Long idMaterialType) {
		super();
		this.id = id;
		this.description = description;
		this.numberSerie = numberSerie;
		this.dateAcquisition = dateAcquisition;
		this.datePeremption = datePeremption;
		this.idDepartement = idDepartement;
		this.idMaterialType = idMaterialType;
	}
	public MaterielDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
