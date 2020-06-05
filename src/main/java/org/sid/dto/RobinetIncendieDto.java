package org.sid.dto;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

public class RobinetIncendieDto {
	 private Long id;
	 @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy", timezone = "UTC")
	    @Temporal(TemporalType.DATE)
		private Date datePeremption;
		@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy", timezone = "UTC")
	    @Temporal(TemporalType.DATE)
		private Date dateAcquisition;
	private String description ;
	private String numberSerie;
	private String diameter ;
	private String length;
	private String typeRobinet;
    private Long idDept;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDatePeremption() {
		return datePeremption;
	}
	public void setDatePeremption(Date datePeremption) {
		this.datePeremption = datePeremption;
	}
	public Date getDateAcquisition() {
		return dateAcquisition;
	}
	public void setDateAcquisition(Date dateAcquisition) {
		this.dateAcquisition = dateAcquisition;
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
	public String getDiameter() {
		return diameter;
	}
	public void setDiameter(String diameter) {
		this.diameter = diameter;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public String getTypeRobinet() {
		return typeRobinet;
	}
	public void setTypeRobinet(String typeRobinet) {
		this.typeRobinet = typeRobinet;
	}
	public Long getIdDept() {
		return idDept;
	}
	public void setIdDept(Long idDept) {
		this.idDept = idDept;
	}
	public RobinetIncendieDto(Long id, Date datePeremption, Date dateAcquisition, String description,
			String numberSerie, String diameter, String length, String typeRobinet, Long idDept) {
		super();
		this.id = id;
		this.datePeremption = datePeremption;
		this.dateAcquisition = dateAcquisition;
		this.description = description;
		this.numberSerie = numberSerie;
		this.diameter = diameter;
		this.length = length;
		this.typeRobinet = typeRobinet;
		this.idDept = idDept;
	}
	public RobinetIncendieDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
