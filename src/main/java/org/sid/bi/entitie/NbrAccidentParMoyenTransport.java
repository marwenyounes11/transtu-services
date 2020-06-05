package org.sid.bi.entitie;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class NbrAccidentParMoyenTransport {
	@Id
	private String id;
private String type;
private Long nbrAccident;

public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public Long getNbrAccident() {
	return nbrAccident;
}
public void setNbrAccident(Long nbrAccident) {
	this.nbrAccident = nbrAccident;
}
public NbrAccidentParMoyenTransport() {
	super();
	// TODO Auto-generated constructor stub
}
public NbrAccidentParMoyenTransport(String id, String type, Long nbrAccident) {
	super();
	this.id = id;
	this.type = type;
	this.nbrAccident = nbrAccident;
}


}
