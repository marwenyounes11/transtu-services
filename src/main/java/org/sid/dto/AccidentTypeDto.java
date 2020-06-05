package org.sid.dto;

public class AccidentTypeDto {
	private Long id;
	private String alias;
	private String label;
	private Long idAccident;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public Long getIdAccident() {
		return idAccident;
	}
	public void setIdAccident(Long idAccident) {
		this.idAccident = idAccident;
	}
	
	public AccidentTypeDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AccidentTypeDto(Long id, String alias, String label, Long idAccident) {
		super();
		this.id = id;
		this.alias = alias;
		this.label = label;
		this.idAccident = idAccident;
	}
	
}
