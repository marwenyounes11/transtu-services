package org.sid.bi.entitie;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class NbrAccidentParTypeAccident {
	@Id
	private String id;
	private String typeAccident;
	private Long nbrAccident;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getTypeAccident() {
		return typeAccident;
	}
	public void setTypeAccident(String typeAccident) {
		this.typeAccident = typeAccident;
	}
	public Long getNbrAccident() {
		return nbrAccident;
	}
	public void setNbrAccident(Long nbrAccident) {
		this.nbrAccident = nbrAccident;
	}
	public NbrAccidentParTypeAccident() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NbrAccidentParTypeAccident(String id, String typeAccident, Long nbrAccident) {
		super();
		this.id = id;
		this.typeAccident = typeAccident;
		this.nbrAccident = nbrAccident;
	}
	
	
	
}
