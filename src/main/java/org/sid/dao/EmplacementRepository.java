package org.sid.dao;


import org.sid.entities.Emplacement;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EmplacementRepository extends JpaRepository<Emplacement, Long>  {
	@Query("select e from Emplacement e where e.delegation like :x")
	public Page<Emplacement> chercherEmplacement(@Param("x")String mc,Pageable pageable);

}
