package org.sid.dao;

import java.util.List;

import org.sid.dto.AccidentSubTypeDto;
import org.sid.entities.AccidentSubType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AccidentSubTypeRepository extends JpaRepository<AccidentSubType,Long>{
	@Query("select a from AccidentSubType a where a.alias like :x")
	public Page<AccidentSubType> chercherAccidentSubType(@Param("x")String mc,Pageable pageable);
	@Query("SELECT new org.sid.dto.AccidentSubTypeDto(at.id,at.alias, at.label,a.id ) FROM AccidentSubType at,AccidentType a WHERE a.id=at.accidenttype") 
	 public List<AccidentSubTypeDto> fetchListAccidentSubType();
}
