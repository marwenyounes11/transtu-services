package org.sid.dto;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

public class BoucheIncendieDto {
	private Long id;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy", timezone = "UTC")
    @Temporal(TemporalType.DATE)
	private Date datePeremption;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy", timezone = "UTC")
    @Temporal(TemporalType.DATE)
	private Date dateAcquisition;
	private String description ;
	private String numberSerie;
	private String diametre ;
	private int nombreBouche ;
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
	public String getDiametre() {
		return diametre;
	}
	public void setDiametre(String diametre) {
		this.diametre = diametre;
	}
	public int getNombreBouche() {
		return nombreBouche;
	}
	public void setNombreBouche(int nombreBouche) {
		this.nombreBouche = nombreBouche;
	}
	public Long getIdDept() {
		return idDept;
	}
	public void setIdDept(Long idDept) {
		this.idDept = idDept;
	}
	public BoucheIncendieDto(Long id, Date datePeremption, Date dateAcquisition, String description, String numberSerie,
			String diametre, int nombreBouche, Long idDept) {
		super();
		this.id = id;
		this.datePeremption = datePeremption;
		this.dateAcquisition = dateAcquisition;
		this.description = description;
		this.numberSerie = numberSerie;
		this.diametre = diametre;
		this.nombreBouche = nombreBouche;
		this.idDept = idDept;
	}
	public BoucheIncendieDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
