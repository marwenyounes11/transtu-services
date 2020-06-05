package org.sid.dto;

public class TransportChauffeursDto {
	private Long id;
	private Long idTransport; 
	private Long idChauffeur;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getIdTransport() {
		return idTransport;
	}
	public void setIdTransport(Long idTransport) {
		this.idTransport = idTransport;
	}
	public Long getIdChauffeur() {
		return idChauffeur;
	}
	public void setIdChauffeur(Long idChauffeur) {
		this.idChauffeur = idChauffeur;
	}
	public TransportChauffeursDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TransportChauffeursDto(Long id, Long idTransport, Long idChauffeur) {
		super();
		this.id = id;
		this.idTransport = idTransport;
		this.idChauffeur = idChauffeur;
	}
	
	
}
