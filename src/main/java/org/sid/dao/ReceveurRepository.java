package org.sid.dao;

import java.util.List;

import org.sid.dto.ChauffeurDto;
import org.sid.dto.ReceveurDto;
import org.sid.entities.Receveur;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ReceveurRepository extends JpaRepository<Receveur,Long> {
	@Query("select r from Receveur r where r.nameReceveur like :x")
	public Page<Receveur> chercherReceveur(@Param("x")String mc,Pageable pageable);
	
}