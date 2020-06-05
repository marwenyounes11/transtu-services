package org.sid.dto;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.sid.entities.SourceInfo;

import com.fasterxml.jackson.annotation.JsonFormat;

public class RapportRequest {
	private String nameAgent;
	private String lastNameAgent;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    @Temporal(TemporalType.DATE)
	private Date dateSaisi;

	private String nameInfo;
	private String lastNameInfo;
	private String natureInfo;
	private String phoneInfo ;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    @Temporal(TemporalType.DATE)
	private Date dateInfo;

	private String localisation;
	 @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	    @Temporal(TemporalType.DATE)
	private Date dateAccident;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="HH:mm:ss")
    @Temporal(TemporalType.TIME)
	private Date timeAccident;	
	private String descriptionAccident;
	

	private String nameLine;
	
	private String numTransport;

	private String nameDistrict;
	
	private String nameChauffeur ;
	
	private String nameReceveur;
	private String descriptionDegat;
	private String typedegat;
	private int	numberDeath;
	private int numberWounded;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    @Temporal(TemporalType.DATE)
	private Date dateRecord;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="HH:mm:ss")
    @Temporal(TemporalType.TIME)
	private Date timeRecord;
	private String descriptionRecord;
	
	
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
	public Date getDateSaisi() {
		return dateSaisi;
	}
	public void setDateSaisi(Date dateSaisi) {
		this.dateSaisi = dateSaisi;
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
	public Date getDateInfo() {
		return dateInfo;
	}
	public void setDateInfo(Date dateInfo) {
		this.dateInfo = dateInfo;
	}
	
	
	
	
	public String getLocalisation() {
		return localisation;
	}
	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}
	public Date getDateAccident() {
		return dateAccident;
	}
	public void setDateAccident(Date dateAccident) {
		this.dateAccident = dateAccident;
	}
	public Date getTimeAccident() {
		return timeAccident;
	}
	public void setTimeAccident(Date timeAccident) {
		this.timeAccident = timeAccident;
	}
	public String getDescriptionAccident() {
		return descriptionAccident;
	}
	public void setDescriptionAccident(String descriptionAccident) {
		this.descriptionAccident = descriptionAccident;
	}
	
	
	public String getNameLine() {
		return nameLine;
	}
	public void setNameLine(String nameLine) {
		this.nameLine = nameLine;
	}
	
	
	
	public String getNumTransport() {
		return numTransport;
	}
	public void setNumTransport(String numTransport) {
		this.numTransport = numTransport;
	}
	public String getNameDistrict() {
		return nameDistrict;
	}
	public void setNameDistrict(String nameDistrict) {
		this.nameDistrict = nameDistrict;
	}
	
	public String getNameChauffeur() {
		return nameChauffeur;
	}
	public void setNameChauffeur(String nameChauffeur) {
		this.nameChauffeur = nameChauffeur;
	}
	
	public String getNameReceveur() {
		return nameReceveur;
	}
	public void setNameReceveur(String nameReceveur) {
		this.nameReceveur = nameReceveur;
	}
	public String getDescriptionDegat() {
		return descriptionDegat;
	}
	public void setDescriptionDegat(String descriptionDegat) {
		this.descriptionDegat = descriptionDegat;
	}
	public String getTypedegat() {
		return typedegat;
	}
	public void setTypedegat(String typedegat) {
		this.typedegat = typedegat;
	}
	
	
	
	public int getNumberDeath() {
		return numberDeath;
	}
	public void setNumberDeath(int numberDeath) {
		this.numberDeath = numberDeath;
	}
	public int getNumberWounded() {
		return numberWounded;
	}
	public void setNumberWounded(int numberWounded) {
		this.numberWounded = numberWounded;
	}
	public Date getDateRecord() {
		return dateRecord;
	}
	public void setDateRecord(Date dateRecord) {
		this.dateRecord = dateRecord;
	}
	public Date getTimeRecord() {
		return timeRecord;
	}
	public void setTimeRecord(Date timeRecord) {
		this.timeRecord = timeRecord;
	}
	public String getDescriptionRecord() {
		return descriptionRecord;
	}
	public void setDescriptionRecord(String descriptionRecord) {
		this.descriptionRecord = descriptionRecord;
	}
	public RapportRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RapportRequest(String nameAgent, String lastNameAgent, Date dateSaisi, String nameInfo, String lastNameInfo,
			String natureInfo, String phoneInfo, Date dateInfo, String localisation, Date dateAccident,
			Date timeAccident, String descriptionAccident, String nameLine, String numTransport, String nameDistrict,
			String nameChauffeur, String nameReceveur, String descriptionDegat, String typedegat, int numberDeath,
			int numberWounded, Date dateRecord, Date timeRecord, String descriptionRecord) {
		super();
		this.nameAgent = nameAgent;
		this.lastNameAgent = lastNameAgent;
		this.dateSaisi = dateSaisi;
		this.nameInfo = nameInfo;
		this.lastNameInfo = lastNameInfo;
		this.natureInfo = natureInfo;
		this.phoneInfo = phoneInfo;
		this.dateInfo = dateInfo;
		this.localisation = localisation;
		this.dateAccident = dateAccident;
		this.timeAccident = timeAccident;
		this.descriptionAccident = descriptionAccident;
		this.nameLine = nameLine;
		this.numTransport = numTransport;
		this.nameDistrict = nameDistrict;
		this.nameChauffeur = nameChauffeur;
		this.nameReceveur = nameReceveur;
		this.descriptionDegat = descriptionDegat;
		this.typedegat = typedegat;
		this.numberDeath = numberDeath;
		this.numberWounded = numberWounded;
		this.dateRecord = dateRecord;
		this.timeRecord = timeRecord;
		this.descriptionRecord = descriptionRecord;
	}
	
	
	
	
	
	
	
	
	

		

}
