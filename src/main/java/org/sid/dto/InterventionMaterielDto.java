package org.sid.dto;


public class InterventionMaterielDto {
	private Long id;
	private Long idMateriel;
	private Long idIntervention;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getIdMateriel() {
		return idMateriel;
	}
	public void setIdMateriel(Long idMateriel) {
		this.idMateriel = idMateriel;
	}
	
	public Long getIdIntervention() {
		return idIntervention;
	}
	public void setIdIntervention(Long idIntervention) {
		this.idIntervention = idIntervention;
	}
	
	public InterventionMaterielDto(Long id, Long idMateriel, Long idIntervention) {
		super();
		this.id = id;
		this.idMateriel = idMateriel;
		this.idIntervention = idIntervention;
	}
	public InterventionMaterielDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
