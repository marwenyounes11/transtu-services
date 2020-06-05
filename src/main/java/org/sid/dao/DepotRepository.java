package org.sid.dao;

import java.util.List;


import org.sid.dto.DepotDto;
import org.sid.entities.Depot;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DepotRepository extends JpaRepository<Depot, Long>{
	@Query("select d from Depot d where d.name like :x")
	public Page<Depot> chercherDepot(@Param("x") String mc, Pageable pageable);
}
