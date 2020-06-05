package org.sid.entities;

import java.io.Serializable;


import java.util.Date;

import java.util.Set;

import javax.persistence.CascadeType;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;





import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;




@Entity
public  class Accident implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	
	private String timeAccident;
	 
	private String dateAccident;
	 
	private String dateInfo;
	
	private String timeInfo;
	 
     private String dateSaisi;
	
	 private String timeSaisi;
	 
	private String description;
	@ManyToOne
	@JoinColumn(name = "emplacement_id")
	@JsonManagedReference
    private Emplacement emplacement;
	
	@ManyToOne
	@JoinColumn(name = "sourceInfo_id")
	@JsonManagedReference
	private SourceInfo sourceInfo;
	@ManyToOne
	@JoinColumn(name = "agentPcr_id")
	@JsonManagedReference
	private AgentPcr agentPcr;
	
	@ManyToOne
	@JoinColumn(name = "transport_id")
	@JsonManagedReference
	private Transport transport;
	@OneToMany(mappedBy = "accident",cascade = CascadeType.REMOVE,orphanRemoval = true,fetch=FetchType.EAGER)
	 @JsonBackReference
    Set<Degat> degat;	
	@OneToMany(mappedBy = "accident",cascade = CascadeType.REMOVE,orphanRemoval = true,fetch=FetchType.EAGER)
	 @JsonBackReference
    Set<Victime> victime;
	private String photo;
	
	@OneToMany(mappedBy = "accident",cascade = CascadeType.REMOVE,orphanRemoval = true,fetch=FetchType.EAGER)
	 @JsonBackReference
    Set<AccidentResponsable> accidentResponsable;
	@OneToMany(mappedBy = "accident",cascade = CascadeType.REMOVE,orphanRemoval = true,fetch=FetchType.EAGER)
	 @JsonBackReference
    Set<AccidentAmbulancier> accidentAmbulancier;
	@OneToMany(mappedBy = "accidentt",cascade = CascadeType.REMOVE,orphanRemoval = true,fetch=FetchType.EAGER)
	 @JsonBackReference
    Set<AccidentSecurite> accidentSecurite;
	@OneToOne(fetch=FetchType.EAGER,orphanRemoval = true)
    @JoinColumn(name = "record_id", nullable = true)
	 @JsonManagedReference
	 private Record record;
	
	@OneToMany(mappedBy = "accident",cascade = CascadeType.REMOVE,orphanRemoval = true,fetch=FetchType.EAGER)
	@JsonBackReference
    Set<AccidentType> accidentType;
	
	
	@OneToMany(mappedBy = "accidenttt",cascade = CascadeType.REMOVE,orphanRemoval = true,fetch=FetchType.EAGER)
	@JsonBackReference
    Set<DeclarationAcc> declarationAcc;
	
	@OneToMany(mappedBy = "accident",cascade = CascadeType.REMOVE,orphanRemoval = true,fetch=FetchType.EAGER)
	@JsonBackReference
    Set<DeclarationRes> declarationRes;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTimeAccident() {
		return timeAccident;
	}
	public void setTimeAccident(String timeAccident) {
		this.timeAccident = timeAccident;
	}
	public String getDateAccident() {
		return dateAccident;
	}
	public void setDateAccident(String dateAccident) {
		this.dateAccident = dateAccident;
	}
	public String getDateInfo() {
		return dateInfo;
	}
	public void setDateInfo(String dateInfo) {
		this.dateInfo = dateInfo;
	}
	public String getTimeInfo() {
		return timeInfo;
	}
	public void setTimeInfo(String timeInfo) {
		this.timeInfo = timeInfo;
	}
	public String getDateSaisi() {
		return dateSaisi;
	}
	public void setDateSaisi(String dateSaisi) {
		this.dateSaisi = dateSaisi;
	}
	public String getTimeSaisi() {
		return timeSaisi;
	}
	public void setTimeSaisi(String timeSaisi) {
		this.timeSaisi = timeSaisi;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Emplacement getEmplacement() {
		return emplacement;
	}
	public void setEmplacement(Emplacement emplacement) {
		this.emplacement = emplacement;
	}
	
	public SourceInfo getSourceInfo() {
		return sourceInfo;
	}
	public void setSourceInfo(SourceInfo sourceInfo) {
		this.sourceInfo = sourceInfo;
	}
	public AgentPcr getAgentPcr() {
		return agentPcr;
	}
	public void setAgentPcr(AgentPcr agentPcr) {
		this.agentPcr = agentPcr;
	}
	
	public Transport getTransport() {
		return transport;
	}
	public void setTransport(Transport transport) {
		this.transport = transport;
	}
	public Set<Degat> getDegat() {
		return degat;
	}
	public void setDegat(Set<Degat> degat) {
		this.degat = degat;
	}
	public Set<Victime> getVictime() {
		return victime;
	}
	public void setVictime(Set<Victime> victime) {
		this.victime = victime;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Set<AccidentResponsable> getAccidentResponsable() {
		return accidentResponsable;
	}
	public void setAccidentResponsable(Set<AccidentResponsable> accidentResponsable) {
		this.accidentResponsable = accidentResponsable;
	}
	public Set<AccidentAmbulancier> getAccidentAmbulancier() {
		return accidentAmbulancier;
	}
	public void setAccidentAmbulancier(Set<AccidentAmbulancier> accidentAmbulancier) {
		this.accidentAmbulancier = accidentAmbulancier;
	}
	public Set<AccidentSecurite> getAccidentSecurite() {
		return accidentSecurite;
	}
	public void setAccidentSecurite(Set<AccidentSecurite> accidentSecurite) {
		this.accidentSecurite = accidentSecurite;
	}
	public Record getRecord() {
		return record;
	}
	public void setRecord(Record record) {
		this.record = record;
	}
	public Set<AccidentType> getAccidentType() {
		return accidentType;
	}
	public void setAccidentType(Set<AccidentType> accidentType) {
		this.accidentType = accidentType;
	}
	public Set<DeclarationAcc> getDeclarationAcc() {
		return declarationAcc;
	}
	public void setDeclarationAcc(Set<DeclarationAcc> declarationAcc) {
		this.declarationAcc = declarationAcc;
	}
	
	
	public Set<DeclarationRes> getDeclarationRes() {
		return declarationRes;
	}
	public void setDeclarationRes(Set<DeclarationRes> declarationRes) {
		this.declarationRes = declarationRes;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Accident() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Accident(Long id, String timeAccident, String dateAccident, String dateInfo, String timeInfo,
			String dateSaisi, String timeSaisi, String description, Emplacement emplacement, SourceInfo sourceInfo,
			AgentPcr agentPcr, Transport transport, Set<Degat> degat, Set<Victime> victime, String photo,
			Set<AccidentResponsable> accidentResponsable, Set<AccidentAmbulancier> accidentAmbulancier,
			Set<AccidentSecurite> accidentSecurite, Record record, Set<AccidentType> accidentType,
			Set<DeclarationAcc> declarationAcc, Set<DeclarationRes> declarationRes) {
		super();
		this.id = id;
		this.timeAccident = timeAccident;
		this.dateAccident = dateAccident;
		this.dateInfo = dateInfo;
		this.timeInfo = timeInfo;
		this.dateSaisi = dateSaisi;
		this.timeSaisi = timeSaisi;
		this.description = description;
		this.emplacement = emplacement;
		this.sourceInfo = sourceInfo;
		this.agentPcr = agentPcr;
		this.transport = transport;
		this.degat = degat;
		this.victime = victime;
		this.photo = photo;
		this.accidentResponsable = accidentResponsable;
		this.accidentAmbulancier = accidentAmbulancier;
		this.accidentSecurite = accidentSecurite;
		this.record = record;
		this.accidentType = accidentType;
		this.declarationAcc = declarationAcc;
		this.declarationRes = declarationRes;
	}
	
	
	
	

	
	
	
	

	
	
	

	

	
	

	
	

}
