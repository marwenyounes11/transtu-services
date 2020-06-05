package org.sid.dto;

public class AccidentSubTypeDto {
	private Long id;
	private String alias;
	private String label;
	private Long idAccidentType;
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
	public Long getIdAccidentType() {
		return idAccidentType;
	}
	public void setIdAccidentType(Long idAccidentType) {
		this.idAccidentType = idAccidentType;
	}
	
	public AccidentSubTypeDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AccidentSubTypeDto(Long id, String alias, String label, Long idAccidentType) {
		super();
		this.id = id;
		this.alias = alias;
		this.label = label;
		this.idAccidentType = idAccidentType;
	}
	
}
