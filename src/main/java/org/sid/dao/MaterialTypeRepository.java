package org.sid.dao;

import org.sid.entities.MaterialType;
import org.sid.entities.TransportType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MaterialTypeRepository extends JpaRepository<MaterialType,Long>{
	@Query("select t from MaterialType t where t.label like :x")
	public Page<MaterialType> chercherMaterialType(@Param("x")String mc,Pageable pageable);
	
}
