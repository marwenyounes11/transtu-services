package org.sid.dto;

public class DistrictDto {
	private Long id;
	private String nameDistrict ;
	private String aliasDistrict ;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNameDistrict() {
		return nameDistrict;
	}
	public void setNameDistrict(String nameDistrict) {
		this.nameDistrict = nameDistrict;
	}
	
	
	public String getAliasDistrict() {
		return aliasDistrict;
	}
	public void setAliasDistrict(String aliasDistrict) {
		this.aliasDistrict = aliasDistrict;
	}
	public DistrictDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DistrictDto(Long id, String nameDistrict, String aliasDistrict) {
		super();
		this.id = id;
		this.nameDistrict = nameDistrict;
		this.aliasDistrict = aliasDistrict;
	}
	
	
	
}
