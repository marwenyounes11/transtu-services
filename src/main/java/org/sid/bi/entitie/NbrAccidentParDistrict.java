package org.sid.bi.entitie;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class NbrAccidentParDistrict {
	@Id
	private String id;
	private String nameDistrict;
	private Long nbrAccident;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNameDistrict() {
		return nameDistrict;
	}
	public void setNameDistrict(String nameDistrict) {
		this.nameDistrict = nameDistrict;
	}
	public Long getNbrAccident() {
		return nbrAccident;
	}
	public void setNbrAccident(Long nbrAccident) {
		this.nbrAccident = nbrAccident;
	}
	public NbrAccidentParDistrict() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NbrAccidentParDistrict(String id, String nameDistrict, Long nbrAccident) {
		super();
		this.id = id;
		this.nameDistrict = nameDistrict;
		this.nbrAccident = nbrAccident;
	}
	
}
