package org.sid.dao;

import java.util.List;

import org.sid.dto.DegatTransportDto;
import org.sid.dto.DegatVictimeDto;
import org.sid.entities.DegatVictime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DegatVictimeRepository extends JpaRepository<DegatVictime,Long> {
	@Query("SELECT new org.sid.dto.DegatVictimeDto(dv.id,v.id,d.id) "
			  +
			  "FROM DegatVictime dv,Victime v,Degat d WHERE v.id=dv.victime and d.id=dv.degatPhysique"
			  ) List<DegatVictimeDto> listDegatVictime();
}
