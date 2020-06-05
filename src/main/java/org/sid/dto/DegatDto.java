package org.sid.dto;

public class DegatDto {
	private Long id;
	private String descriptionDegat;
	private String estimationPrixDegat ;
	private Long idAccident;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescriptionDegat() {
		return descriptionDegat;
	}
	public void setDescriptionDegat(String descriptionDegat) {
		this.descriptionDegat = descriptionDegat;
	}
	public String getEstimationPrixDegat() {
		return estimationPrixDegat;
	}
	public void setEstimationPrixDegat(String estimationPrixDegat) {
		this.estimationPrixDegat = estimationPrixDegat;
	}
	
	public Long getIdAccident() {
		return idAccident;
	}
	public void setIdAccident(Long idAccident) {
		this.idAccident = idAccident;
	}
	public DegatDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DegatDto(Long id, String descriptionDegat, String estimationPrixDegat, Long idAccident) {
		super();
		this.id = id;
		this.descriptionDegat = descriptionDegat;
		this.estimationPrixDegat = estimationPrixDegat;
		this.idAccident = idAccident;
	}
	
	

}
