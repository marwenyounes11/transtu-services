package org.sid.dao;


import java.util.List;



import org.sid.entities.Materiel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MaterielRepository  extends JpaRepository<Materiel,Long>{
	@Query("select m from Materiel m where m.description like :x")
	public Page<Materiel> chercherMateriel(@Param("x")String mc,Pageable pageable);
	
	
	
	  
	/*
	 * @Query("SELECT new org.sid.dto.MaterielDto(m.description,dp.nameDept) " +
	 * "FROM Departement dp Left JOIN dp.materiel m  ") List<MaterielDto>
	 * fetchMatDataLeftJoin();
	 */
	 
	
	
}
