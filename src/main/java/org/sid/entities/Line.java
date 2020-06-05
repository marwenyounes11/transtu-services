package org.sid.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Line implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nameLine ;
	
	@OneToMany(mappedBy="line",cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	@JsonBackReference
	private Collection<Transport> transport ;
	
	@OneToMany(mappedBy = "line",cascade = CascadeType.REMOVE,orphanRemoval = true,fetch=FetchType.EAGER)
	@JsonBackReference
    Set<DeclarationAcc> declarationAcc;
	@OneToMany(mappedBy = "line",cascade = CascadeType.REMOVE,orphanRemoval = true,fetch=FetchType.EAGER)
	@JsonBackReference
    Set<DeclarationAccident> declarationAccident;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	
	
	
	
	
	public String getNameLine() {
		return nameLine;
	}
	public void setNameLine(String nameLine) {
		this.nameLine = nameLine;
	}
	
	
	public Collection<Transport> getTransport() {
		return transport;
	}
	public void setTransport(Collection<Transport> transport) {
		this.transport = transport;
	}
	
	
	
	
	public Set<DeclarationAcc> getDeclarationAcc() {
		return declarationAcc;
	}
	public void setDeclarationAcc(Set<DeclarationAcc> declarationAcc) {
		this.declarationAcc = declarationAcc;
	}
	
	public Set<DeclarationAccident> getDeclarationAccident() {
		return declarationAccident;
	}
	public void setDeclarationAccident(Set<DeclarationAccident> declarationAccident) {
		this.declarationAccident = declarationAccident;
	}
	public Line() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Line(Long id, String nameLine, Collection<Transport> transport, Set<DeclarationAcc> declarationAcc,
			Set<DeclarationAccident> declarationAccident) {
		super();
		this.id = id;
		this.nameLine = nameLine;
		this.transport = transport;
		this.declarationAcc = declarationAcc;
		this.declarationAccident = declarationAccident;
	}
	
	
	
	
	
	
	
	
	
	

}
