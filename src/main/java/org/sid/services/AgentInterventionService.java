package org.sid.services;

import java.util.List;
import java.util.Optional;

import org.sid.dto.AgentInterventionDto;
import org.sid.entities.AgentIntervention;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface AgentInterventionService {
	AgentIntervention saveAgentIntervention(AgentInterventionDto a);
	
	AgentIntervention updateAgentIntervention(Long id,AgentInterventionDto a);
	
	List<AgentIntervention> fetchListAgentIntervention();

	Optional<AgentIntervention> findById(Long id);

	Page<AgentIntervention> chercherAgentIntervention(String string, PageRequest of);

	void deleteById(Long id);
}
