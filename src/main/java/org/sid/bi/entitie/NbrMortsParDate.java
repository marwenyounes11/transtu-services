package org.sid.bi.entitie;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class NbrMortsParDate {
	@Id
	private String id;
	private int year;
	private String month;
	private Long nbrMorts;
	
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
	public Long getNbrMorts() {
		return nbrMorts;
	}
	public void setNbrMorts(Long nbrMorts) {
		this.nbrMorts = nbrMorts;
	}
	public NbrMortsParDate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NbrMortsParDate(String id, int year, String month, Long nbrMorts) {
		super();
		this.id = id;
		this.year = year;
		this.month = month;
		this.nbrMorts = nbrMorts;
	}
	
	
}
