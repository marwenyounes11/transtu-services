package org.sid.dto;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.sid.entities.Accident;
import org.sid.entities.Chauffeur;
import org.sid.entities.Degat;
import org.sid.entities.District;
import org.sid.entities.Emplacement;
import org.sid.entities.Line;
import org.sid.entities.Receveur;
import org.sid.entities.Record;
import org.sid.entities.Transport;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonManagedReference;

public class DeclarationAccidenttDto {
	private Long id;
	   private String accidenttype;	
		private String natureInfo;
		private String phoneInfo ;
		private String nameInfo;
		private String lastNameInfo;
		private String dateAccident;
	private Long idDistrict;
	private Long idLine;
	private Long idEmplacement;
	private Long idTransport;
	
	private Long idChauffeur;
	private Long idReceveur;
	private String accidentsubtype;
	private String degattype;	
	
	private int death;	
	private int wounded;
	
	private String record;
	private String description;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAccidenttype() {
		return accidenttype;
	}
	public void setAccidenttype(String accidenttype) {
		this.accidenttype = accidenttype;
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
	public String getDateAccident() {
		return dateAccident;
	}
	public void setDateAccident(String dateAccident) {
		this.dateAccident = dateAccident;
	}
	public Long getIdDistrict() {
		return idDistrict;
	}
	public void setIdDistrict(Long idDistrict) {
		this.idDistrict = idDistrict;
	}
	public Long getIdLine() {
		return idLine;
	}
	public void setIdLine(Long idLine) {
		this.idLine = idLine;
	}
	public Long getIdEmplacement() {
		return idEmplacement;
	}
	public void setIdEmplacement(Long idEmplacement) {
		this.idEmplacement = idEmplacement;
	}
	public Long getIdTransport() {
		return idTransport;
	}
	public void setIdTransport(Long idTransport) {
		this.idTransport = idTransport;
	}
	
	public Long getIdChauffeur() {
		return idChauffeur;
	}
	public void setIdChauffeur(Long idChauffeur) {
		this.idChauffeur = idChauffeur;
	}
	public Long getIdReceveur() {
		return idReceveur;
	}
	public void setIdReceveur(Long idReceveur) {
		this.idReceveur = idReceveur;
	}
	public String getAccidentsubtype() {
		return accidentsubtype;
	}
	public void setAccidentsubtype(String accidentsubtype) {
		this.accidentsubtype = accidentsubtype;
	}
	public String getDegattype() {
		return degattype;
	}
	public void setDegattype(String degattype) {
		this.degattype = degattype;
	}
	
	public int getDeath() {
		return death;
	}
	public void setDeath(int death) {
		this.death = death;
	}
	public int getWounded() {
		return wounded;
	}
	public void setWounded(int wounded) {
		this.wounded = wounded;
	}
	public String getRecord() {
		return record;
	}
	public void setRecord(String record) {
		this.record = record;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	public DeclarationAccidenttDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DeclarationAccidenttDto(Long id, String accidenttype, String natureInfo, String phoneInfo, String nameInfo,
			String lastNameInfo, String dateAccident, Long idDistrict, Long idLine, Long idEmplacement,
			Long idTransport, Long idChauffeur, Long idReceveur, String accidentsubtype, String degattype, int death,
			int wounded, String record, String description) {
		super();
		this.id = id;
		this.accidenttype = accidenttype;
		this.natureInfo = natureInfo;
		this.phoneInfo = phoneInfo;
		this.nameInfo = nameInfo;
		this.lastNameInfo = lastNameInfo;
		this.dateAccident = dateAccident;
		this.idDistrict = idDistrict;
		this.idLine = idLine;
		this.idEmplacement = idEmplacement;
		this.idTransport = idTransport;
		this.idChauffeur = idChauffeur;
		this.idReceveur = idReceveur;
		this.accidentsubtype = accidentsubtype;
		this.degattype = degattype;
		this.death = death;
		this.wounded = wounded;
		this.record = record;
		this.description = description;
	}
	
	
	
	
	
	
}
