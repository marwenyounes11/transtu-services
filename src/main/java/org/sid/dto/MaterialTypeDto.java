package org.sid.dto;

public class MaterialTypeDto {
	private Long id;
	private String label;
	private String alias;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public MaterialTypeDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MaterialTypeDto(Long id, String label, String alias) {
		super();
		this.id = id;
		this.label = label;
		this.alias = alias;
	}
	
}
