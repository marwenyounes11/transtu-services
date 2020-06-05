package org.sid.dto;

public class ReceveurDto {
	private Long id;
	private String nameReceveur;
	private String lastNameReceveur;
	private String adressReceveur;
	private String cityReceveur;

	private String emailReceveur ;
	private String phoneReceveur ;
	private Long busId;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNameReceveur() {
		return nameReceveur;
	}
	public void setNameReceveur(String nameReceveur) {
		this.nameReceveur = nameReceveur;
	}
	public String getLastNameReceveur() {
		return lastNameReceveur;
	}
	public void setLastNameReceveur(String lastNameReceveur) {
		this.lastNameReceveur = lastNameReceveur;
	}
	public String getAdressReceveur() {
		return adressReceveur;
	}
	public void setAdressReceveur(String adressReceveur) {
		this.adressReceveur = adressReceveur;
	}
	public String getCityReceveur() {
		return cityReceveur;
	}
	public void setCityReceveur(String cityReceveur) {
		this.cityReceveur = cityReceveur;
	}
	public String getEmailReceveur() {
		return emailReceveur;
	}
	public void setEmailReceveur(String emailReceveur) {
		this.emailReceveur = emailReceveur;
	}
	public String getPhoneReceveur() {
		return phoneReceveur;
	}
	public void setPhoneReceveur(String phoneReceveur) {
		this.phoneReceveur = phoneReceveur;
	}
	
	
	public Long getBusId() {
		return busId;
	}
	public void setBusId(Long busId) {
		this.busId = busId;
	}
	public ReceveurDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReceveurDto(Long id, String nameReceveur, String lastNameReceveur, String adressReceveur,
			String cityReceveur, String emailReceveur, String phoneReceveur, Long busId) {
		super();
		this.id = id;
		this.nameReceveur = nameReceveur;
		this.lastNameReceveur = lastNameReceveur;
		this.adressReceveur = adressReceveur;
		this.cityReceveur = cityReceveur;
		this.emailReceveur = emailReceveur;
		this.phoneReceveur = phoneReceveur;
		this.busId = busId;
	}
	
	
}
