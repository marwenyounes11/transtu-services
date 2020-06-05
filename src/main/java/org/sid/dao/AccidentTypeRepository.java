package org.sid.dao;
import java.util.List;

import org.sid.dto.AccidentTypeDto;

import org.sid.entities.AccidentType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AccidentTypeRepository extends JpaRepository<AccidentType,Long>{
	@Query("select a from AccidentType a where a.alias like :x")
	public Page<AccidentType> chercherAccidentType(@Param("x")String mc,Pageable pageable);
	@Query("SELECT new org.sid.dto.AccidentTypeDto(at.id,at.alias, at.label,a.id ) FROM AccidentType at,Accident a WHERE a.id=at.accident") 
	 public List<AccidentTypeDto> fetchListAccidentType();
}
