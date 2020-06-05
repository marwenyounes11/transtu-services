package org.sid.dto;

public class LineDto {
	private Long id;
	private String nameLine ;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameLine() {
		return nameLine;
	}

	public void setNameLine(String nameLine) {
		this.nameLine = nameLine;
	}

	public LineDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LineDto(Long id, String nameLine) {
		super();
		this.id = id;
		this.nameLine = nameLine;
	}

	
	
}
