package org.sid.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class SourceInfo implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id ;
	private String nameInfo;
	private String lastNameInfo;
	private String natureInfo;
	private String phoneInfo ;
	@OneToMany(mappedBy="sourceInfo",cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	 @JsonBackReference
	private Collection<Accident> accidents ;
	@OneToMany(mappedBy = "sourceInfo",cascade = CascadeType.REMOVE,orphanRemoval = true,fetch=FetchType.EAGER)
	@JsonBackReference
    Set<DeclarationRes> declarationRes;
	@OneToMany(mappedBy = "sourceInfo",cascade = CascadeType.REMOVE,orphanRemoval = true,fetch=FetchType.EAGER)
	@JsonBackReference
    Set<DeclarationAcc> declarationAcc;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	
	public Collection<Accident> getAccidents() {
		return accidents;
	}

	public void setAccidents(Collection<Accident> accidents) {
		this.accidents = accidents;
	}

	public Set<DeclarationRes> getDeclarationRes() {
		return declarationRes;
	}

	public void setDeclarationRes(Set<DeclarationRes> declarationRes) {
		this.declarationRes = declarationRes;
	}

	public Set<DeclarationAcc> getDeclarationAcc() {
		return declarationAcc;
	}

	public void setDeclarationAcc(Set<DeclarationAcc> declarationAcc) {
		this.declarationAcc = declarationAcc;
	}

	public SourceInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SourceInfo(Long id, String nameInfo, String lastNameInfo, String natureInfo, String phoneInfo,
			Collection<Accident> accidents, Set<DeclarationRes> declarationRes, Set<DeclarationAcc> declarationAcc) {
		super();
		this.id = id;
		this.nameInfo = nameInfo;
		this.lastNameInfo = lastNameInfo;
		this.natureInfo = natureInfo;
		this.phoneInfo = phoneInfo;
		this.accidents = accidents;
		this.declarationRes = declarationRes;
		this.declarationAcc = declarationAcc;
	}

	
	
	
}
