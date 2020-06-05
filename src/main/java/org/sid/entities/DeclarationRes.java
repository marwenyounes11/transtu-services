package org.sid.entities;

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

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class DeclarationRes {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	
private String dateInfo;
	
	private String timeInfo;
	private String natureResponsable;
	private String nameResponsable;
	private String lastNameResponsable;
	private String phoneResponsable;
	private String description;
	private String typeSecurite;
	private String nameAmbulancier;
	private String lastNameAmbulancier;
	private String phoneAmbulancier;

	
	@ManyToOne
	@JoinColumn(name = "accident_id")
	@JsonManagedReference
	private Accident accident;
	@ManyToOne
	@JoinColumn(name = "sourceInfo_id")
	@JsonManagedReference
	private SourceInfo sourceInfo;
	@ManyToOne
	@JoinColumn(name = "responsable_id")
	@JsonManagedReference
	private Responsable responsable;
	@ManyToOne
	@JoinColumn(name = "securite_id")
	@JsonManagedReference
	private Securite securite;
	@ManyToOne
	@JoinColumn(name = "ambulancier_id")
	@JsonManagedReference
	private Ambulancier ambulancier;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getNatureResponsable() {
		return natureResponsable;
	}
	public void setNatureResponsable(String natureResponsable) {
		this.natureResponsable = natureResponsable;
	}
	public String getNameResponsable() {
		return nameResponsable;
	}
	public void setNameResponsable(String nameResponsable) {
		this.nameResponsable = nameResponsable;
	}
	public String getLastNameResponsable() {
		return lastNameResponsable;
	}
	public void setLastNameResponsable(String lastNameResponsable) {
		this.lastNameResponsable = lastNameResponsable;
	}
	public String getPhoneResponsable() {
		return phoneResponsable;
	}
	public void setPhoneResponsable(String phoneResponsable) {
		this.phoneResponsable = phoneResponsable;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTypeSecurite() {
		return typeSecurite;
	}
	public void setTypeSecurite(String typeSecurite) {
		this.typeSecurite = typeSecurite;
	}
	public String getNameAmbulancier() {
		return nameAmbulancier;
	}
	public void setNameAmbulancier(String nameAmbulancier) {
		this.nameAmbulancier = nameAmbulancier;
	}
	public String getLastNameAmbulancier() {
		return lastNameAmbulancier;
	}
	public void setLastNameAmbulancier(String lastNameAmbulancier) {
		this.lastNameAmbulancier = lastNameAmbulancier;
	}
	public String getPhoneAmbulancier() {
		return phoneAmbulancier;
	}
	public void setPhoneAmbulancier(String phoneAmbulancier) {
		this.phoneAmbulancier = phoneAmbulancier;
	}
	public Accident getAccident() {
		return accident;
	}
	public void setAccident(Accident accident) {
		this.accident = accident;
	}
	public SourceInfo getSourceInfo() {
		return sourceInfo;
	}
	public void setSourceInfo(SourceInfo sourceInfo) {
		this.sourceInfo = sourceInfo;
	}
	public Responsable getResponsable() {
		return responsable;
	}
	public void setResponsable(Responsable responsable) {
		this.responsable = responsable;
	}
	public Securite getSecurite() {
		return securite;
	}
	public void setSecurite(Securite securite) {
		this.securite = securite;
	}
	public Ambulancier getAmbulancier() {
		return ambulancier;
	}
	public void setAmbulancier(Ambulancier ambulancier) {
		this.ambulancier = ambulancier;
	}
	public DeclarationRes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DeclarationRes(Long id, String dateInfo, String timeInfo, String natureResponsable, String nameResponsable,
			String lastNameResponsable, String phoneResponsable, String description, String typeSecurite,
			String nameAmbulancier, String lastNameAmbulancier, String phoneAmbulancier, Accident accident,
			SourceInfo sourceInfo, Responsable responsable, Securite securite, Ambulancier ambulancier) {
		super();
		this.id = id;
		this.dateInfo = dateInfo;
		this.timeInfo = timeInfo;
		this.natureResponsable = natureResponsable;
		this.nameResponsable = nameResponsable;
		this.lastNameResponsable = lastNameResponsable;
		this.phoneResponsable = phoneResponsable;
		this.description = description;
		this.typeSecurite = typeSecurite;
		this.nameAmbulancier = nameAmbulancier;
		this.lastNameAmbulancier = lastNameAmbulancier;
		this.phoneAmbulancier = phoneAmbulancier;
		this.accident = accident;
		this.sourceInfo = sourceInfo;
		this.responsable = responsable;
		this.securite = securite;
		this.ambulancier = ambulancier;
	}
	
	
	 
}
