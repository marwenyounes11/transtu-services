package org.sid.dto;

public class BusReceveurDto {
	private Long id;
	private Long idBus; 
	private Long idReceveur;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getIdBus() {
		return idBus;
	}
	public void setIdBus(Long idBus) {
		this.idBus = idBus;
	}
	public Long getIdReceveur() {
		return idReceveur;
	}
	public void setIdReceveur(Long idReceveur) {
		this.idReceveur = idReceveur;
	}
	
	public BusReceveurDto(Long id, Long idBus, Long idReceveur) {
		super();
		this.id = id;
		this.idBus = idBus;
		this.idReceveur = idReceveur;
	}
	public BusReceveurDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
