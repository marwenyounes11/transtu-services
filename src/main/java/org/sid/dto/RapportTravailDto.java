package org.sid.dto;

import java.util.Date;

public class RapportTravailDto {
	private Long id;
    private String nameLine;
	
	private String localisation;

	private String numTransport;
	
	
	private Date timeAccident;
	
	 private Date dateAccident;


	 
	 private String typeAccTravail ;
	
	
	
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



	


	public String getTypeAccTravail() {
		return typeAccTravail;
	}



	public void setTypeAccTravail(String typeAccTravail) {
		this.typeAccTravail = typeAccTravail;
	}



	public String getDescriptionDegat() {
		return descriptionDegat;
	}



	public void setDescriptionDegat(String descriptionDegat) {
		this.descriptionDegat = descriptionDegat;
	}



	public RapportTravailDto() {
		super();
		// TODO Auto-generated constructor stub
	}



	public RapportTravailDto(Long id, String nameLine, String localisation, String numTransport, Date timeAccident,
			Date dateAccident, String typeAccTravail, String descriptionDegat) {
		super();
		this.id = id;
		this.nameLine = nameLine;
		this.localisation = localisation;
		this.numTransport = numTransport;
		this.timeAccident = timeAccident;
		this.dateAccident = dateAccident;
		this.typeAccTravail = typeAccTravail;
		this.descriptionDegat = descriptionDegat;
	}



	


	


	



	
	
	
}
