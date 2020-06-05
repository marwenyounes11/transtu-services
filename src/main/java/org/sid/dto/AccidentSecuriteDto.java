package org.sid.dto;

public class AccidentSecuriteDto {
	private Long id;
	private Long idAccident;
	private Long idSecurite;
	
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
	public Long getIdSecurite() {
		return idSecurite;
	}
	public void setIdSecurite(Long idSecurite) {
		this.idSecurite = idSecurite;
	}
	public AccidentSecuriteDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AccidentSecuriteDto(Long id, Long idAccident, Long idSecurite) {
		super();
		this.id = id;
		this.idAccident = idAccident;
		this.idSecurite = idSecurite;
	}
	
	
}
