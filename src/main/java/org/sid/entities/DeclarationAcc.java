package org.sid.entities;

import java.io.Serializable;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity

public class DeclarationAcc implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String dateSaisi;	
	private String timeSaisi;
	
	private String nameAgent;
	private String lastNameAgent;
	private String natureInfo;
	private String phoneInfo ;
	private String nameInfo;
	private String lastNameInfo;
	
	private String nameChauffeur;
	private String lastNameChauffeur;
	private String phoneChauffeur;
	private String nameReceveur;
	private String lastNameReceveur;
	private String phoneReceveur ;
	private String localisation;
	private String timeAccident;
	private String dateAccident;
	private String numTransport;
	private String nameLine ;
	private String nameDistrict;
	private String description;
	private String typeAccident;
	private String subTypeAccident;
	private String descriptionDegat;
    private String dateRecord;
    private String timeRecord;
	
	@ManyToOne
	@JoinColumn(name = "accident_id")
	@JsonManagedReference
	private Accident accidenttt;
	
	@ManyToOne
	@JoinColumn(name = "emplacement_id")
	@JsonManagedReference
	private Emplacement emplacementt;
	
	@ManyToOne
	@JoinColumn(name = "accidenttype_id")
	@JsonManagedReference
	private AccidentType accidentType;
	@ManyToOne
	@JoinColumn(name = "accidentsubtype_id")
	@JsonManagedReference
	private AccidentSubType accidentSubType;
	@ManyToOne
	@JoinColumn(name = "agentPcr_id")
	@JsonManagedReference
	private AgentPcr agentPcr;
	@ManyToOne
	@JoinColumn(name = "sourceInfo_id")
	@JsonManagedReference
	private SourceInfo sourceInfo;
	@ManyToOne
	@JoinColumn(name = "chauffeur_id")
	@JsonManagedReference
	private Chauffeur chauffeur;
	@ManyToOne
	@JoinColumn(name = "receveur_id")
	@JsonManagedReference
	private Receveur receveur;
	@ManyToOne
	@JoinColumn(name = "transport_id")
	@JsonManagedReference
	private Transport transport;
	@ManyToOne
	@JoinColumn(name = "line_id")
	@JsonManagedReference
	private Line line;
	@ManyToOne
	@JoinColumn(name = "depot_id")
	@JsonManagedReference

	private Depot depot;
	@ManyToOne
	@JoinColumn(name = "degat_id")
	@JsonManagedReference

	private Degat degat;
	@ManyToOne
	@JoinColumn(name = "record_id")
	@JsonManagedReference
	private Record record;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getNameAgent() {
		return nameAgent;
	}
	public void setNameAgent(String nameAgent) {
		this.nameAgent = nameAgent;
	}
	public String getLastNameAgent() {
		return lastNameAgent;
	}
	public void setLastNameAgent(String lastNameAgent) {
		this.lastNameAgent = lastNameAgent;
	}
	public String getNatureInfo() {
		return natureInfo;
	}
	public void setNatureInfo(String natureInfo) {
		this.natureInfo = natureInfo;
	}
	public String getPhoneInfo() {
		return phoneInfo;
	}
	public void setPhoneInfo(String phoneInfo) {
		this.phoneInfo = phoneInfo;
	}
	public String getNameInfo() {
		return nameInfo;
	}
	public void setNameInfo(String nameInfo) {
		this.nameInfo = nameInfo;
	}
	public String getLastNameInfo() {
		return lastNameInfo;
	}
	public void setLastNameInfo(String lastNameInfo) {
		this.lastNameInfo = lastNameInfo;
	}
	public String getNameChauffeur() {
		return nameChauffeur;
	}
	public void setNameChauffeur(String nameChauffeur) {
		this.nameChauffeur = nameChauffeur;
	}
	public String getLastNameChauffeur() {
		return lastNameChauffeur;
	}
	public void setLastNameChauffeur(String lastNameChauffeur) {
		this.lastNameChauffeur = lastNameChauffeur;
	}
	public String getPhoneChauffeur() {
		return phoneChauffeur;
	}
	public void setPhoneChauffeur(String phoneChauffeur) {
		this.phoneChauffeur = phoneChauffeur;
	}
	public String getNameReceveur() {
		return nameReceveur;
	}
	public void setNameReceveur(String nameReceveur) {
		this.nameReceveur = nameReceveur;
	}
	public String getLastNameReceveur() {
		return lastNameReceveur;
	}
	public void setLastNameReceveur(String lastNameReceveur) {
		this.lastNameReceveur = lastNameReceveur;
	}
	public String getPhoneReceveur() {
		return phoneReceveur;
	}
	public void setPhoneReceveur(String phoneReceveur) {
		this.phoneReceveur = phoneReceveur;
	}
	public String getLocalisation() {
		return localisation;
	}
	public void setLocalisation(String localisation) {
		this.localisation = localisation;
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
	public String getNumTransport() {
		return numTransport;
	}
	public void setNumTransport(String numTransport) {
		this.numTransport = numTransport;
	}
	public String getNameLine() {
		return nameLine;
	}
	public void setNameLine(String nameLine) {
		this.nameLine = nameLine;
	}
	public String getNameDistrict() {
		return nameDistrict;
	}
	public void setNameDistrict(String nameDistrict) {
		this.nameDistrict = nameDistrict;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTypeAccident() {
		return typeAccident;
	}
	public void setTypeAccident(String typeAccident) {
		this.typeAccident = typeAccident;
	}
	
	public String getSubTypeAccident() {
		return subTypeAccident;
	}
	public void setSubTypeAccident(String subTypeAccident) {
		this.subTypeAccident = subTypeAccident;
	}
	public String getDescriptionDegat() {
		return descriptionDegat;
	}
	public void setDescriptionDegat(String descriptionDegat) {
		this.descriptionDegat = descriptionDegat;
	}
	public String getDateRecord() {
		return dateRecord;
	}
	public void setDateRecord(String dateRecord) {
		this.dateRecord = dateRecord;
	}
	public String getTimeRecord() {
		return timeRecord;
	}
	public void setTimeRecord(String timeRecord) {
		this.timeRecord = timeRecord;
	}
	
	public Accident getAccidenttt() {
		return accidenttt;
	}
	public void setAccidenttt(Accident accidenttt) {
		this.accidenttt = accidenttt;
	}
	public Emplacement getEmplacementt() {
		return emplacementt;
	}
	public void setEmplacementt(Emplacement emplacementt) {
		this.emplacementt = emplacementt;
	}
	public AccidentType getAccidentType() {
		return accidentType;
	}
	public void setAccidentType(AccidentType accidentType) {
		this.accidentType = accidentType;
	}
	public AgentPcr getAgentPcr() {
		return agentPcr;
	}
	public void setAgentPcr(AgentPcr agentPcr) {
		this.agentPcr = agentPcr;
	}
	public SourceInfo getSourceInfo() {
		return sourceInfo;
	}
	public void setSourceInfo(SourceInfo sourceInfo) {
		this.sourceInfo = sourceInfo;
	}
	public Chauffeur getChauffeur() {
		return chauffeur;
	}
	public void setChauffeur(Chauffeur chauffeur) {
		this.chauffeur = chauffeur;
	}
	public Receveur getReceveur() {
		return receveur;
	}
	public void setReceveur(Receveur receveur) {
		this.receveur = receveur;
	}
	public Transport getTransport() {
		return transport;
	}
	public void setTransport(Transport transport) {
		this.transport = transport;
	}
	public Line getLine() {
		return line;
	}
	public void setLine(Line line) {
		this.line = line;
	}
	public Depot getDepot() {
		return depot;
	}
	public void setDepot(Depot depot) {
		this.depot = depot;
	}
	public Degat getDegat() {
		return degat;
	}
	public void setDegat(Degat degat) {
		this.degat = degat;
	}
	public Record getRecord() {
		return record;
	}
	public void setRecord(Record record) {
		this.record = record;
	}
	
	public AccidentSubType getAccidentSubType() {
		return accidentSubType;
	}
	public void setAccidentSubType(AccidentSubType accidentSubType) {
		this.accidentSubType = accidentSubType;
	}
	public DeclarationAcc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DeclarationAcc(Long id, String dateSaisi, String timeSaisi, String nameAgent, String lastNameAgent,
			String natureInfo, String phoneInfo, String nameInfo, String lastNameInfo, String nameChauffeur,
			String lastNameChauffeur, String phoneChauffeur, String nameReceveur, String lastNameReceveur,
			String phoneReceveur, String localisation, String timeAccident, String dateAccident, String numTransport,
			String nameLine, String nameDistrict, String description, String typeAccident, String subTypeAccident,
			String descriptionDegat, String dateRecord, String timeRecord, Accident accidenttt,
			Emplacement emplacementt, AccidentType accidentType, AccidentSubType accidentSubType, AgentPcr agentPcr,
			SourceInfo sourceInfo, Chauffeur chauffeur, Receveur receveur, Transport transport, Line line, Depot depot,
			Degat degat, Record record) {
		super();
		this.id = id;
		this.dateSaisi = dateSaisi;
		this.timeSaisi = timeSaisi;
		this.nameAgent = nameAgent;
		this.lastNameAgent = lastNameAgent;
		this.natureInfo = natureInfo;
		this.phoneInfo = phoneInfo;
		this.nameInfo = nameInfo;
		this.lastNameInfo = lastNameInfo;
		this.nameChauffeur = nameChauffeur;
		this.lastNameChauffeur = lastNameChauffeur;
		this.phoneChauffeur = phoneChauffeur;
		this.nameReceveur = nameReceveur;
		this.lastNameReceveur = lastNameReceveur;
		this.phoneReceveur = phoneReceveur;
		this.localisation = localisation;
		this.timeAccident = timeAccident;
		this.dateAccident = dateAccident;
		this.numTransport = numTransport;
		this.nameLine = nameLine;
		this.nameDistrict = nameDistrict;
		this.description = description;
		this.typeAccident = typeAccident;
		this.subTypeAccident = subTypeAccident;
		this.descriptionDegat = descriptionDegat;
		this.dateRecord = dateRecord;
		this.timeRecord = timeRecord;
		this.accidenttt = accidenttt;
		this.emplacementt = emplacementt;
		this.accidentType = accidentType;
		this.accidentSubType = accidentSubType;
		this.agentPcr = agentPcr;
		this.sourceInfo = sourceInfo;
		this.chauffeur = chauffeur;
		this.receveur = receveur;
		this.transport = transport;
		this.line = line;
		this.depot = depot;
		this.degat = degat;
		this.record = record;
	}
	
	
	
	
	
	
	
	
	
	
}
