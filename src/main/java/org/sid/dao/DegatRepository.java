package org.sid.dao;



import java.util.List;

import org.sid.dto.DegatDto;
import org.sid.entities.Degat;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DegatRepository extends JpaRepository<Degat,Long> {
	@Query("select d from Degat d where d.descriptionDegat like :x")
	public Page<Degat> chercherDegat(@Param("x")String mc,Pageable pageable);
	
	@Query("SELECT new org.sid.dto.DegatDto(d.id,d.descriptionDegat,d.estimationPrixDegat,a.id) "
			  +
			  "FROM Degat d ,Accident a WHERE a.id=d.accident "
			  ) List<DegatDto> listDegat();
}