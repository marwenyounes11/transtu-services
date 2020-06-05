package org.sid.entities;

import java.io.Serializable;
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
public class Victime implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String corpBlesser ;
	private String niveauBlessure ;
	private String etatVictime;
	private String typeVictime;
	private String lastNameVictime ;
	private String nameVictime;
	
	@OneToMany(mappedBy = "victime", cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	@JsonBackReference
    Set<DegatVictime> degatVictime;
	
	 
	 @ManyToOne
	 @JsonManagedReference
	 
		private Accident accident;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCorpBlesser() {
		return corpBlesser;
	}
	public void setCorpBlesser(String corpBlesser) {
		this.corpBlesser = corpBlesser;
	}
	
	
	public String getNiveauBlessure() {
		return niveauBlessure;
	}
	public void setNiveauBlessure(String niveauBlessure) {
		this.niveauBlessure = niveauBlessure;
	}
	public String getEtatVictime() {
		return etatVictime;
	}
	public void setEtatVictime(String etatVictime) {
		this.etatVictime = etatVictime;
	}
	
	public String getTypeVictime() {
		return typeVictime;
	}
	public void setTypeVictime(String typeVictime) {
		this.typeVictime = typeVictime;
	}
	public String getLastNameVictime() {
		return lastNameVictime;
	}
	public void setLastNameVictime(String lastNameVictime) {
		this.lastNameVictime = lastNameVictime;
	}
	public String getNameVictime() {
		return nameVictime;
	}
	public void setNameVictime(String nameVictime) {
		this.nameVictime = nameVictime;
	}
	
	public Set<DegatVictime> getDegatVictime() {
		return degatVictime;
	}
	public void setDegatVictime(Set<DegatVictime> degatVictime) {
		this.degatVictime = degatVictime;
	}
	public Accident getAccident() {
		return accident;
	}
	public void setAccident(Accident accident) {
		this.accident = accident;
	}
	public Victime() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Victime(Long id, String corpBlesser, String niveauBlessure, String etatVictime, String typeVictime,
			String lastNameVictime, String nameVictime, Set<DegatVictime> degatVictime, Accident accident) {
		super();
		this.id = id;
		this.corpBlesser = corpBlesser;
		this.niveauBlessure = niveauBlessure;
		this.etatVictime = etatVictime;
		this.typeVictime = typeVictime;
		this.lastNameVictime = lastNameVictime;
		this.nameVictime = nameVictime;
		this.degatVictime = degatVictime;
		this.accident = accident;
	}
	
	
	
	 

}
