package org.sid.dao;


import org.sid.entities.DegatType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DegatTypeRepository extends JpaRepository<DegatType,Long>{
	@Query("select dt from DegatType dt where dt.label like :x")
	public Page<DegatType> chercherDegatType(@Param("x")String mc,Pageable pageable);
}
