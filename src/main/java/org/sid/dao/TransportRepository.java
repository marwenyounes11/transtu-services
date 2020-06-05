package org.sid.dao;

import java.util.List;

import org.sid.dto.TransportDto;
import org.sid.entities.Transport;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TransportRepository extends JpaRepository<Transport,Long>{
	@Query("select t from Transport t where t.marque like :x")
	public Page<Transport> chercherTransport(@Param("x")String mc,Pageable pageable);
	@Query("SELECT new org.sid.dto.TransportDto(t.id,t.numTransport,t.immatriculation,t.marque,t.model,t.gabarit,l.id) "
			  +
			  "FROM Line l , Transport t WHERE l.id=t.line   "
			  ) List<TransportDto> listTransport();
}
