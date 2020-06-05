package org.sid.bi.entitie;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class EstimationPrixDegatParDate {
	@Id
	
	private String id;
	private int year;
	private String month;
	private Long nbrAccident;
	private Double estimationPrixDegat;
	
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
	public Double getEstimationPrixDegat() {
		return estimationPrixDegat;
	}
	public void setEstimationPrixDegat(Double estimationPrixDegat) {
		this.estimationPrixDegat = estimationPrixDegat;
	}
	public EstimationPrixDegatParDate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EstimationPrixDegatParDate(String id, int year, String month, Long nbrAccident, Double estimationPrixDegat) {
		super();
		this.id = id;
		this.year = year;
		this.month = month;
		this.nbrAccident = nbrAccident;
		this.estimationPrixDegat = estimationPrixDegat;
	}
	
	
}
