package org.sid.dto;

public class TransportDto {
	private Long id;
	private String numTransport;
	private String immatriculation;
	private String marque;
	private String model;
	private String gabarit;
	private Long idLine;
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
	
	public TransportDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TransportDto(Long id, String numTransport, String immatriculation, String marque, String model,
			String gabarit, Long idLine) {
		super();
		this.id = id;
		this.numTransport = numTransport;
		this.immatriculation = immatriculation;
		this.marque = marque;
		this.model = model;
		this.gabarit = gabarit;
		this.idLine = idLine;
	}
	
	
	
}
