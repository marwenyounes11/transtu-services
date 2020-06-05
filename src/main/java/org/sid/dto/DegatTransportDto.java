package org.sid.dto;

public class DegatTransportDto {
	private Long id;
	private Long idTransport;
	private Long idDegatMateriel;
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
	public Long getIdDegatMateriel() {
		return idDegatMateriel;
	}
	public void setIdDegatMateriel(Long idDegatMateriel) {
		this.idDegatMateriel = idDegatMateriel;
	}
	public DegatTransportDto(Long id, Long idTransport, Long idDegatMateriel) {
		super();
		this.id = id;
		this.idTransport = idTransport;
		this.idDegatMateriel = idDegatMateriel;
	}
	public DegatTransportDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
