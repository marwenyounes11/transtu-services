package org.sid.dao;

import java.util.List;

import org.sid.dto.InterventionDto;
import org.sid.entities.Chauffeur;
import org.sid.entities.Intervention;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface InterventionRepository extends JpaRepository<Intervention,Long> {
	@Query("select i from Intervention i where i.action like :x")
	public Page<Intervention> chercherIntervention(@Param("x")String mc,Pageable pageable);
	 

	
}
