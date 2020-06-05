package org.sid.dto;

public class AccidentAmbulancierDto {
	private Long id;
	private Long idAccident;
	private Long idAmbulancier;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getIdAccident() {
		return idAccident;
	}
	public void setIdAccident(Long idAccident) {
		this.idAccident = idAccident;
	}
	public Long getIdAmbulancier() {
		return idAmbulancier;
	}
	public void setIdAmbulancier(Long idAmbulancier) {
		this.idAmbulancier = idAmbulancier;
	}
	
	public AccidentAmbulancierDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AccidentAmbulancierDto(Long id, Long idAccident, Long idAmbulancier) {
		super();
		this.id = id;
		this.idAccident = idAccident;
		this.idAmbulancier = idAmbulancier;
	}
	
	
	
}
