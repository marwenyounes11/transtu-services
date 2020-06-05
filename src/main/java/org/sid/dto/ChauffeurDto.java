package org.sid.dto;

public class ChauffeurDto {
	private Long id;
	private String nameChauffeur;
	private String lastNameChauffeur;
	private String addressChauffeur;
	private String cityChauffeur;
	private String emailChauffeur;
	private String phoneChauffeur;
	private Long transportId;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNameChauffeur() {
		return nameChauffeur;
	}
	public void setNameChauffeur(String nameChauffeur) {
		this.nameChauffeur = nameChauffeur;
	}
	public String getLastNameChauffeur() {
		return lastNameChauffeur;
	}
	public void setLastNameChauffeur(String lastNameChauffeur) {
		this.lastNameChauffeur = lastNameChauffeur;
	}
	public String getAddressChauffeur() {
		return addressChauffeur;
	}
	public void setAddressChauffeur(String addressChauffeur) {
		this.addressChauffeur = addressChauffeur;
	}
	public String getCityChauffeur() {
		return cityChauffeur;
	}
	public void setCityChauffeur(String cityChauffeur) {
		this.cityChauffeur = cityChauffeur;
	}
	public String getEmailChauffeur() {
		return emailChauffeur;
	}
	public void setEmailChauffeur(String emailChauffeur) {
		this.emailChauffeur = emailChauffeur;
	}
	public String getPhoneChauffeur() {
		return phoneChauffeur;
	}
	public void setPhoneChauffeur(String phoneChauffeur) {
		this.phoneChauffeur = phoneChauffeur;
	}
	
	public Long getTransportId() {
		return transportId;
	}
	public void setTransportId(Long transportId) {
		this.transportId = transportId;
	}
	public ChauffeurDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChauffeurDto(Long id, String nameChauffeur, String lastNameChauffeur, String addressChauffeur,
			String cityChauffeur, String emailChauffeur, String phoneChauffeur, Long transportId) {
		super();
		this.id = id;
		this.nameChauffeur = nameChauffeur;
		this.lastNameChauffeur = lastNameChauffeur;
		this.addressChauffeur = addressChauffeur;
		this.cityChauffeur = cityChauffeur;
		this.emailChauffeur = emailChauffeur;
		this.phoneChauffeur = phoneChauffeur;
		this.transportId = transportId;
	}
	
	
	
}
