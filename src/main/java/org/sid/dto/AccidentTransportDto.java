package org.sid.dto;

public class AccidentTransportDto {
	private Long id;
	private Long idAccident;
	private Long idTransport;
	
	
	
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
	public Long getIdTransport() {
		return idTransport;
	}
	public void setIdTransport(Long idTransport) {
		this.idTransport = idTransport;
	}
	public AccidentTransportDto(Long id, Long idAccident, Long idTransport) {
		super();
		this.id = id;
		this.idAccident = idAccident;
		this.idTransport = idTransport;
	}
	public AccidentTransportDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
