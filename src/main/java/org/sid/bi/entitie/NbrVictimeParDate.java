package org.sid.bi.entitie;
import javax.persistence.Entity;

import javax.persistence.Id;
@Entity
public class NbrVictimeParDate {
@Id

private String id;
private String month;
private String niveauBlesser;
private Long nbrVictime;

public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getMonth() {
	return month;
}
public void setMonth(String month) {
	this.month = month;
}
public String getNiveauBlesser() {
	return niveauBlesser;
}
public void setNiveauBlesser(String niveauBlesser) {
	this.niveauBlesser = niveauBlesser;
}
public Long getNbrVictime() {
	return nbrVictime;
}
public void setNbrVictime(Long nbrVictime) {
	this.nbrVictime = nbrVictime;
}
public NbrVictimeParDate() {
	super();
	// TODO Auto-generated constructor stub
}
public NbrVictimeParDate(String id, String month, String niveauBlesser, Long nbrVictime) {
	super();
	this.id = id;
	this.month = month;
	this.niveauBlesser = niveauBlesser;
	this.nbrVictime = nbrVictime;
}

}
