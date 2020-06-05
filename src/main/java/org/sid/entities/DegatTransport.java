package org.sid.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
public class DegatTransport {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
    @JoinColumn(name = "degat_id")
	@JsonManagedReference
  Degat degatMateriel;
 
    @ManyToOne
    @JoinColumn(name = "transport_id")
    @JsonManagedReference
    Transport transport;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public Degat getDegatMateriel() {
		return degatMateriel;
	}

	public void setDegatMateriel(Degat degatMateriel) {
		this.degatMateriel = degatMateriel;
	}

	public Transport getTransport() {
		return transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}

	public DegatTransport() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DegatTransport(Long id, Degat degatMateriel, Transport transport) {
		this.id = id;
		this.degatMateriel = degatMateriel;
		this.transport = transport;
	}

	
    
    
    
}
