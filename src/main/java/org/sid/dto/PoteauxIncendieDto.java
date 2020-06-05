package org.sid.dto;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

public class PoteauxIncendieDto {
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
	
	private String couleurPoteaux ;
	
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

	public String getCouleurPoteaux() {
		return couleurPoteaux;
	}

	public void setCouleurPoteaux(String couleurPoteaux) {
		this.couleurPoteaux = couleurPoteaux;
	}

	public Long getIdDept() {
		return idDept;
	}

	public void setIdDept(Long idDept) {
		this.idDept = idDept;
	}

	public PoteauxIncendieDto(Long id, Date datePeremption, Date dateAcquisition, String description,
			String numberSerie, String diametre, String couleurPoteaux, Long idDept) {
		super();
		this.id = id;
		this.datePeremption = datePeremption;
		this.dateAcquisition = dateAcquisition;
		this.description = description;
		this.numberSerie = numberSerie;
		this.diametre = diametre;
		this.couleurPoteaux = couleurPoteaux;
		this.idDept = idDept;
	}
	
	
}
