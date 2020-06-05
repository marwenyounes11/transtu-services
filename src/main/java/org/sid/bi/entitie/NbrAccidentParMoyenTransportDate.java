
package org.sid.bi.entitie;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class NbrAccidentParMoyenTransportDate {
	@Id
	private String id;
	private int year;
	private String month;
	private String type;
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
	public NbrAccidentParMoyenTransportDate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NbrAccidentParMoyenTransportDate(String id, int year, String month, String type, Long nbrAccident) {
		super();
		this.id = id;
		this.year = year;
		this.month = month;
		this.type = type;
		this.nbrAccident = nbrAccident;
	}
	
	
}
