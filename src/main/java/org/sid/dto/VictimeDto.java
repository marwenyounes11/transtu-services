package org.sid.dto;

public class VictimeDto {
private Long id;
private String corpBlesser ;
private String etatVictime;
private String lastNameVictime ;
private String nameVictime;
private String niveauBlessure ;
private String typeVictime;
private Long idAccident;
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
public String getEtatVictime() {
	return etatVictime;
}
public void setEtatVictime(String etatVictime) {
	this.etatVictime = etatVictime;
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
public String getNiveauBlessure() {
	return niveauBlessure;
}
public void setNiveauBlessure(String niveauBlessure) {
	this.niveauBlessure = niveauBlessure;
}
public String getTypeVictime() {
	return typeVictime;
}
public void setTypeVictime(String typeVictime) {
	this.typeVictime = typeVictime;
}
public Long getIdAccident() {
	return idAccident;
}
public void setIdAccident(Long idAccident) {
	this.idAccident = idAccident;
}
public VictimeDto(Long id, String corpBlesser, String etatVictime, String lastNameVictime, String nameVictime,
		String niveauBlessure, String typeVictime, Long idAccident) {
	super();
	this.id = id;
	this.corpBlesser = corpBlesser;
	this.etatVictime = etatVictime;
	this.lastNameVictime = lastNameVictime;
	this.nameVictime = nameVictime;
	this.niveauBlessure = niveauBlessure;
	this.typeVictime = typeVictime;
	this.idAccident = idAccident;
}
public VictimeDto() {
	super();
	// TODO Auto-generated constructor stub
}


}
