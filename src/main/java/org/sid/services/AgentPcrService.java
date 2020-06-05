package org.sid.services;

import java.util.List;
import java.util.Optional;

import org.sid.dto.AgentPcrDto;
import org.sid.entities.AgentPcr;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface AgentPcrService {
	AgentPcr saveAgentPcr(AgentPcrDto a);
	
	AgentPcr updateAgentPcr(Long id,AgentPcrDto a);
	
	List<AgentPcr> fetchListAgentPcr();

	Optional<AgentPcr> findById(Long id);

	Page<AgentPcr> chercherAgentPcr(String string, PageRequest of);

	void deleteById(Long id);
}
