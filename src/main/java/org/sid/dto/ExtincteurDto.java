package org.sid.dto;

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ExtincteurDto {

	private Long id;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone = "UTC")
    @Temporal(TemporalType.DATE)
	private Date dateAcquisition;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy", timezone = "UTC")
    @Temporal(TemporalType.DATE)
	private Date datePeremption;
	private String description ;
	private String numberSerie;
	private String typeExtincteur;
	private Long idDepot;
	private Long idTransport;
	private Long idDept;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDateAcquisition() {
		return dateAcquisition;
	}
	public void setDateAcquisition(Date dateAcquisition) {
		this.dateAcquisition = dateAcquisition;
	}
	public Date getDatePeremption() {
		return datePeremption;
	}
	public void setDatePeremption(Date datePeremption) {
		this.datePeremption = datePeremption;
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
	public String getTypeExtincteur() {
		return typeExtincteur;
	}
	public void setTypeExtincteur(String typeExtincteur) {
		this.typeExtincteur = typeExtincteur;
	}
	public Long getIdDepot() {
		return idDepot;
	}
	public void setIdDepot(Long idDepot) {
		this.idDepot = idDepot;
	}
	public Long getIdTransport() {
		return idTransport;
	}
	public void setIdTransport(Long idTransport) {
		this.idTransport = idTransport;
	}
	public Long getIdDept() {
		return idDept;
	}
	public void setIdDept(Long idDept) {
		this.idDept = idDept;
	}
	public ExtincteurDto(Long id, Date dateAcquisition, Date datePeremption, String description, String numberSerie,
			String typeExtincteur, Long idDepot, Long idTransport, Long idDept) {
		super();
		this.id = id;
		this.dateAcquisition = dateAcquisition;
		this.datePeremption = datePeremption;
		this.description = description;
		this.numberSerie = numberSerie;
		this.typeExtincteur = typeExtincteur;
		this.idDepot = idDepot;
		this.idTransport = idTransport;
		this.idDept = idDept;
	}
	public ExtincteurDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
