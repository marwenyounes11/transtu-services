package org.sid.dto;

public class EmplacementDto {
	private Long id;
	private  String delegation;
	private  String gouvernorat;
	private String localisation;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getDelegation() {
		return delegation;
	}
	public void setDelegation(String delegation) {
		this.delegation = delegation;
	}
	public String getGouvernorat() {
		return gouvernorat;
	}
	public void setGouvernorat(String gouvernorat) {
		this.gouvernorat = gouvernorat;
	}
	public String getLocalisation() {
		return localisation;
	}
	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}
	public EmplacementDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmplacementDto(Long id, String delegation, String gouvernorat, String localisation) {
		super();
		this.id = id;
		this.delegation = delegation;
		this.gouvernorat = gouvernorat;
		this.localisation = localisation;
	}
	
	

}
