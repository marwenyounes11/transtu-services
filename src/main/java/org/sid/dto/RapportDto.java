
  package org.sid.dto;
  
  import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
  
public class RapportDto {
 
	private Long id;
	private String nameLine;
	
	private String localisation;

	private String numTransport;
	
	
	private Date timeAccident;
	
	 private Date dateAccident;


	private String nameChauffeur;
	private String nameReceveur;
	
	
	
	private String descriptionDegat;
	
	
 
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameLine() {
		return nameLine;
	}

	public void setNameLine(String nameLine) {
		this.nameLine = nameLine;
	}

	

	public String getLocalisation() {
		return localisation;
	}

	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}


	public String getNumTransport() {
		return numTransport;
	}

	public void setNumTransport(String numTransport) {
		this.numTransport = numTransport;
	}

	public Date getTimeAccident() {
		return timeAccident;
	}

	public void setTimeAccident(Date timeAccident) {
		this.timeAccident = timeAccident;
	}

	public Date getDateAccident() {
		return dateAccident;
	}

	public void setDateAccident(Date dateAccident) {
		this.dateAccident = dateAccident;
	}

	
	public String getNameChauffeur() {
		return nameChauffeur;
	}

	public void setNameChauffeur(String nameChauffeur) {
		this.nameChauffeur = nameChauffeur;
	}

	public String getNameReceveur() {
		return nameReceveur;
	}

	public void setNameReceveur(String nameReceveur) {
		this.nameReceveur = nameReceveur;
	}

	public String getDescriptionDegat() {
		return descriptionDegat;
	}

	public void setDescriptionDegat(String descriptionDegat) {
		this.descriptionDegat = descriptionDegat;
	}

	
	public RapportDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RapportDto(Long id, String nameLine, String localisation, String numTransport,
			Date timeAccident, Date dateAccident, String nameChauffeur, String nameReceveur, String descriptionDegat) {
		super();
		this.id = id;
		this.nameLine = nameLine;
		this.localisation = localisation;
		this.numTransport = numTransport;
		this.timeAccident = timeAccident;
		this.dateAccident = dateAccident;
		this.nameChauffeur = nameChauffeur;
		this.nameReceveur = nameReceveur;
		this.descriptionDegat = descriptionDegat;
	}

	
	

	

	
	

	
	

	
	

	

	
	

	
	

	

	

	

	
	
}
  