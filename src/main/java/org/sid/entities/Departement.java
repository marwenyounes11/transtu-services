package org.sid.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
public class Departement implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nameDept ;
	@OneToMany(mappedBy="departement",cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	@JsonBackReference
	
	private Collection<Materiel> materiels ;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNameDept() {
		return nameDept;
	}
	public void setNameDept(String nameDept) {
		this.nameDept = nameDept;
	}
	
	
	
	
	
	
	public Collection<Materiel> getMateriels() {
		return materiels;
	}
	public void setMateriels(Collection<Materiel> materiels) {
		this.materiels = materiels;
	}
	public Departement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Departement(Long id, String nameDept, Collection<Materiel> materiels) {
		super();
		this.id = id;
		this.nameDept = nameDept;
		this.materiels = materiels;
	}
	
	
	
	
}
