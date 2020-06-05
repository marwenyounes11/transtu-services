package org.sid.dao;

import java.util.List;

import org.sid.dto.ChauffeurDto;
import org.sid.entities.Chauffeur;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ChauffeurRepository extends JpaRepository<Chauffeur,Long> {
	@Query("select c from Chauffeur c where c.nameChauffeur like :x")
	public Page<Chauffeur> chercherChauffeur(@Param("x")String mc,Pageable pageable);
	
}
