package org.sid.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
public class Transport implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private String gabarit;
    private String immatriculation ;
    private String marque ; 
    private String model ;
    private String numTransport ;
    @ManyToOne
	@JoinColumn(name = "line_id")
    @JsonManagedReference
	private Line line;
    
    @ManyToOne
	@JoinColumn(name = "depot_id")
    @JsonManagedReference
	private Depot depot;
    
    @OneToMany(mappedBy = "transport", cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	 @JsonBackReference
   Set<Accident> accident;
    
    @ManyToOne
	@JoinColumn(name = "chauffeur_id")
    @JsonManagedReference
	private Chauffeur chauffeur;

    @ManyToOne
	@JoinColumn(name = "receveur_id")
    @JsonManagedReference
	private Receveur receveur; 
    
	@OneToMany(mappedBy = "transport",cascade = CascadeType.REMOVE,orphanRemoval = true,fetch=FetchType.EAGER)
	 @JsonBackReference
    Set<DegatTransport> degatTransport;
	@OneToMany(mappedBy = "transport",cascade = CascadeType.REMOVE,orphanRemoval = true,fetch=FetchType.EAGER)
	 @JsonBackReference
    Set<DeclarationAcc> declarationAcc;
	@OneToMany(mappedBy = "transport",cascade = CascadeType.REMOVE,orphanRemoval = true,fetch=FetchType.EAGER)
	 @JsonBackReference  
   Set<DeclarationAccident> declarationAccident;
public Set<Accident> getAccident() {
		return accident;
	}
	public void setAccident(Set<Accident> accident) {
		this.accident = accident;
	}
	public Chauffeur getChauffeur() {
		return chauffeur;
	}
	public void setChauffeur(Chauffeur chauffeur) {
		this.chauffeur = chauffeur;
	}
	public Receveur getReceveur() {
		return receveur;
	}
	public void setReceveur(Receveur receveur) {
		this.receveur = receveur;
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
	//	@OneToMany(mappedBy = "transport")
//	@JsonManagedReference
//    Set<Materiel> materiel;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
		public String getGabarit() {
		return gabarit;
	}
	public void setGabarit(String gabarit) {
		this.gabarit = gabarit;
	}
	public String getImmatriculation() {
		return immatriculation;
	}
	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getNumTransport() {
		return numTransport;
	}
	public void setNumTransport(String numTransport) {
		this.numTransport = numTransport;
	}
	public Line getLine() {
		return line;
	}
	public void setLine(Line line) {
		this.line = line;
	}
	public Depot getDepot() {
		return depot;
	}
	public void setDistrict(Depot depot) {
		this.depot = depot;
	}
	
	
	
//	public Set<Materiel> getExtincteur() {
//		return materiel;
//	}
//	public void setExtincteur(Set<Materiel> extincteur) {
//		this.materiel = extincteur;
//	}
	
	
	
	public void setDepot(Depot depot) {
		this.depot = depot;
	}
	
	public Set<DegatTransport> getDegatTransport() {
		return degatTransport;
	}
	public void setDegatTransport(Set<DegatTransport> degatTransport) {
		this.degatTransport = degatTransport;
	}
	public Transport() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Transport(Long id, String gabarit, String immatriculation, String marque, String model, String numTransport,
			Line line, Depot depot, Set<Accident> accident, Chauffeur chauffeur, Receveur receveur,
			Set<DegatTransport> degatTransport, Set<DeclarationAcc> declarationAcc,
			Set<DeclarationAccident> declarationAccident) {
		super();
		this.id = id;
		this.gabarit = gabarit;
		this.immatriculation = immatriculation;
		this.marque = marque;
		this.model = model;
		this.numTransport = numTransport;
		this.line = line;
		this.depot = depot;
		this.accident = accident;
		this.chauffeur = chauffeur;
		this.receveur = receveur;
		this.degatTransport = degatTransport;
		this.declarationAcc = declarationAcc;
		this.declarationAccident = declarationAccident;
	}
	
	
	
	

	
	

	

	
    
    
    

}
