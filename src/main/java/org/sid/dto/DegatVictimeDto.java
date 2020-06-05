package org.sid.dto;

public class DegatVictimeDto {
	private Long id;
	private Long idVictime;
	private Long idDegatPhysique;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getIdVictime() {
		return idVictime;
	}
	public void setIdVictime(Long idVictime) {
		this.idVictime = idVictime;
	}
	public Long getIdDegatPhysique() {
		return idDegatPhysique;
	}
	public void setIdDegatPhysique(Long idDegatPhysique) {
		this.idDegatPhysique = idDegatPhysique;
	}
	public DegatVictimeDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DegatVictimeDto(Long id, Long idVictime, Long idDegatPhysique) {
		super();
		this.id = id;
		this.idVictime = idVictime;
		this.idDegatPhysique = idDegatPhysique;
	}
	
	
}
