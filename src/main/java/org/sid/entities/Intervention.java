package org.sid.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Intervention implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id ;
		private String action;
		
		private String timeIntervention;
		 
		private String dateIntervention;
		
		 @ManyToOne
			@JoinColumn(name = "agentIntervention_id")
		 @JsonManagedReference
			private AgentIntervention agentIntervention;
		
		
		
		 @OneToMany(mappedBy = "intervention",cascade = CascadeType.ALL,orphanRemoval=true)
		    @JsonBackReference
		    Set<InterventionMateriel> interventionMateriels;
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		
	
		public String getAction() {
			return action;
		}
		public void setAction(String action) {
			this.action = action;
		}
		
		
		
		
		
		
		
		
	
		
		public String getTimeIntervention() {
			return timeIntervention;
		}
		public void setTimeIntervention(String timeIntervention) {
			this.timeIntervention = timeIntervention;
		}
		public String getDateIntervention() {
			return dateIntervention;
		}
		public void setDateIntervention(String dateIntervention) {
			this.dateIntervention = dateIntervention;
		}
		public Set<InterventionMateriel> getInterventionMateriels() {
			return interventionMateriels;
		}
		public void setInterventionMateriels(Set<InterventionMateriel> interventionMateriels) {
			this.interventionMateriels = interventionMateriels;
		}
		
		public AgentIntervention getAgentIntervention() {
			return agentIntervention;
		}
		public void setAgentIntervention(AgentIntervention agentIntervention) {
			this.agentIntervention = agentIntervention;
		}
		public Intervention() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Intervention(Long id, String action, String timeIntervention, String dateIntervention,
				AgentIntervention agentIntervention, Set<InterventionMateriel> interventionMateriels) {
			super();
			this.id = id;
			this.action = action;
			this.timeIntervention = timeIntervention;
			this.dateIntervention = dateIntervention;
			this.agentIntervention = agentIntervention;
			this.interventionMateriels = interventionMateriels;
		}
		
		
		
		
		
		
		
		
		
}
