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
public class DeclarationAccident implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
   private String accidenttype;	
	private String natureInfo;
	private String phoneInfo ;
	private String nameInfo;
	private String lastNameInfo;
	private String dateAccident;
	@ManyToOne
	@JoinColumn(name = "district_id")
	@JsonManagedReference
	private District district;
	@ManyToOne
	@JoinColumn(name = "line_id")
	@JsonManagedReference
	private Line line;
	@ManyToOne
	@JoinColumn(name = "emplacement_id")
	@JsonManagedReference
	private Emplacement emplacement;
	@ManyToOne
	@JoinColumn(name = "transport_id")
	@JsonManagedReference
	private Transport transport;	
	@ManyToOne
	@JoinColumn(name = "chauffeur_id")
	@JsonManagedReference
	private Chauffeur chauffeur;
	@ManyToOne
	@JoinColumn(name = "receveur_id")
	@JsonManagedReference
	private Receveur receveur;
	private String accidentsubtype;
	private String degattype;	
	private int death;	
	private int wounded;	
	
	private String record;
	private String description;
	private String photo;
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
	public District getDistrict() {
		return district;
	}
	public void setDistrict(District district) {
		this.district = district;
	}
	public Line getLine() {
		return line;
	}
	public void setLine(Line line) {
		this.line = line;
	}
	public Emplacement getEmplacement() {
		return emplacement;
	}
	public void setEmplacement(Emplacement emplacement) {
		this.emplacement = emplacement;
	}
	public Transport getTransport() {
		return transport;
	}
	public void setTransport(Transport transport) {
		this.transport = transport;
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
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public DeclarationAccident() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DeclarationAccident(Long id, String accidenttype, String natureInfo, String phoneInfo, String nameInfo,
			String lastNameInfo, String dateAccident, District district, Line line, Emplacement emplacement,
			Transport transport, Chauffeur chauffeur, Receveur receveur, String accidentsubtype, String degattype,
			int death, int wounded, String record, String description, String photo) {
		super();
		this.id = id;
		this.accidenttype = accidenttype;
		this.natureInfo = natureInfo;
		this.phoneInfo = phoneInfo;
		this.nameInfo = nameInfo;
		this.lastNameInfo = lastNameInfo;
		this.dateAccident = dateAccident;
		this.district = district;
		this.line = line;
		this.emplacement = emplacement;
		this.transport = transport;
		this.chauffeur = chauffeur;
		this.receveur = receveur;
		this.accidentsubtype = accidentsubtype;
		this.degattype = degattype;
		this.death = death;
		this.wounded = wounded;
		this.record = record;
		this.description = description;
		this.photo = photo;
	}
	
	
	
}