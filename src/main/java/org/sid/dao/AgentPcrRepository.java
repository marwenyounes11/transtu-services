package org.sid.dao;
import java.util.List;
import org.sid.entities.AgentPcr;
import org.sid.dto.AgentPcrDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



public interface AgentPcrRepository extends JpaRepository<AgentPcr,Long> {
	@Query("select ag from AgentPcr ag where ag.nameAgent like :x")
	public Page<AgentPcr> chercherAgentPcr(@Param("x")String mc,Pageable pageable);
	 @Query("SELECT new org.sid.dto.AgentPcrDto(a.id,a.nameAgent,a.lastNameAgent,a.phoneAgent) "
	  +
	  "FROM AgentPcr a"
	  ) List<AgentPcrDto> listAgent();
}
