package org.sid.dto;

public class DepotDto {
	private Long id;
	private String name;
	private String nameDistrict;
	private Long idDistrict;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String nameDepot) {
		this.name = nameDepot;
	}
	
	
	public String getNameDistrict() {
		return nameDistrict;
	}
	public void setNameDistrict(String nameDistrict) {
		this.nameDistrict = nameDistrict;
	}
	
	public Long getIdDistrict() {
		return idDistrict;
	}
	public void setIdDistrict(Long idDistrict) {
		this.idDistrict = idDistrict;
	}
	public DepotDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DepotDto(Long id, String name, String nameDistrict, Long idDistrict) {
		super();
		this.id = id;
		this.name = name;
		this.nameDistrict = nameDistrict;
		this.idDistrict = idDistrict;
	}
	
	
	
	
	
	
}
