package org.sid.dao;



import org.sid.entities.TransportType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TransportTypeRepository extends JpaRepository<TransportType,Long>{
	@Query("select t from TransportType t where t.label like :x")
	public Page<TransportType> chercherTransportType(@Param("x")String mc,Pageable pageable);
	
	
}
