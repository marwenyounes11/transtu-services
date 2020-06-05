package org.sid.dto;

public class MetroDto {
	private Long id;
	private String numTransport;
	private String immatriculation;
	private String marque;
	private String model;
	private String gabarit;
	private Long idLine;
	private Long idAccident;
	private Long idChauffeur;
	private Long idDegatMateriel;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNumTransport() {
		return numTransport;
	}
	public void setNumTransport(String numTransport) {
		this.numTransport = numTransport;
	}
	public String getImmatriculation() {
		return immatriculation;
	}
	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getGabarit() {
		return gabarit;
	}
	public void setGabarit(String gabarit) {
		this.gabarit = gabarit;
	}

	public Long getIdLine() {
		return idLine;
	}
	public void setIdLine(Long idLine) {
		this.idLine = idLine;
	}
	public Long getIdAccident() {
		return idAccident;
	}
	public void setIdAccident(Long idAccident) {
		this.idAccident = idAccident;
	}
	public Long getIdChauffeur() {
		return idChauffeur;
	}
	public void setIdChauffeur(Long idChauffeur) {
		this.idChauffeur = idChauffeur;
	}
	
	public Long getIdDegatMateriel() {
		return idDegatMateriel;
	}
	public void setIdDegatMateriel(Long idDegatMateriel) {
		this.idDegatMateriel = idDegatMateriel;
	}
	public MetroDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MetroDto(Long id, String numTransport, String immatriculation, String marque, String model, String gabarit,
			 Long idLine, Long idAccident, Long idChauffeur, Long idDegatMateriel) {
		super();
		this.id = id;
		this.numTransport = numTransport;
		this.immatriculation = immatriculation;
		this.marque = marque;
		this.model = model;
		this.gabarit = gabarit;
		this.idLine = idLine;
		this.idAccident = idAccident;
		this.idChauffeur = idChauffeur;
		this.idDegatMateriel = idDegatMateriel;
	}
	
	
}
