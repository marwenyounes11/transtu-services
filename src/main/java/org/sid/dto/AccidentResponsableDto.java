package org.sid.dto;

public class AccidentResponsableDto {
	private Long id;
	private Long idAccident;
	private Long idResponsable;
	
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
	public Long getIdResponsable() {
		return idResponsable;
	}
	public void setIdResponsable(Long idResponsable) {
		this.idResponsable = idResponsable;
	}
	public AccidentResponsableDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AccidentResponsableDto(Long id, Long idAccident, Long idResponsable) {
		super();
		this.id = id;
		this.idAccident = idAccident;
		this.idResponsable = idResponsable;
	}
	
  	
}
