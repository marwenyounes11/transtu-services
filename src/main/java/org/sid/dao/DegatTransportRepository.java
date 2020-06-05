package org.sid.dao;

import java.util.List;

import org.sid.dto.DegatTransportDto;
import org.sid.entities.DegatTransport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DegatTransportRepository extends JpaRepository<DegatTransport,Long> {
	@Query("SELECT new org.sid.dto.DegatTransportDto(dt.id,t.id,d.id) "
			  +
			  "FROM DegatTransport dt,Transport t,Degat d WHERE t.id=dt.transport and d.id=dt.degatMateriel"
			  ) List<DegatTransportDto> listDegatTransport();
}
