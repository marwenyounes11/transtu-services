package org.sid.bi.entitie;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class NbrAccidentParDate {
	@Id
	private String id;
private int year;
private String month;
private Long nbrAccident;

public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public String getMonth() {
	return month;
}
public void setMonth(String month) {
	this.month = month;
}
public Long getNbrAccident() {
	return nbrAccident;
}
public void setNbrAccident(Long nbrAccident) {
	this.nbrAccident = nbrAccident;
}
public NbrAccidentParDate() {
	super();
	// TODO Auto-generated constructor stub
}
public NbrAccidentParDate(String id, int year, String month, Long nbrAccident) {
	super();
	this.id = id;
	this.year = year;
	this.month = month;
	this.nbrAccident = nbrAccident;
}

}
