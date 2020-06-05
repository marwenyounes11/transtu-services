package org.sid.dto;

public class DepartementDto {
	private Long id;
	private String nameDept ;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameDept() {
		return nameDept;
	}

	public void setNameDept(String nameDept) {
		this.nameDept = nameDept;
	}

	public DepartementDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DepartementDto(Long id, String nameDept) {
		super();
		this.id = id;
		this.nameDept = nameDept;
	}

	
	
}
