package org.sid.dao;


import java.util.List;

import org.sid.dto.DistrictDto;
import org.sid.dto.LineDto;
import org.sid.entities.Line;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface LineRepository extends JpaRepository<Line,Long> {
	@Query("select l from Line l where l.nameLine like :x")
	public Page<Line> chercherLine(@Param("x")String mc,Pageable pageable);
	@Query("SELECT new org.sid.dto.LineDto(l.id,l.nameLine) "
			  +
			  "FROM   Line l  "
			  ) List<LineDto> listLine();
	
}
