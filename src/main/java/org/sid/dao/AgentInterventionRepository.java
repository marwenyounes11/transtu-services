package org.sid.dao;

import org.sid.entities.AgentIntervention;
import org.sid.entities.AgentPcr;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AgentInterventionRepository extends JpaRepository<AgentIntervention,Long>  {
	@Query("select ag from AgentIntervention ag where ag.nameAgentInt like :x")
	public Page<AgentIntervention> chercherAgentIntervention(@Param("x")String mc,Pageable pageable);
}
