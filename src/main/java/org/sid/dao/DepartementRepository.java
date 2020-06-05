package org.sid.dao;



import java.util.List;

import org.sid.dto.DepartementDto;
import org.sid.entities.Departement;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DepartementRepository extends JpaRepository<Departement,Long> {
	
	Departement findByNameDept(String nameDept);
	
	@Query("select d from Departement d where d.nameDept like :x")
	public Page<Departement> chercherDepartement(@Param("x")String mc,Pageable pageable);
	
	 @Query("SELECT new org.sid.dto.DepartementDto(d.id,d.nameDept) "
			  +
			  "FROM Departement d"
			  ) List<DepartementDto> listDepartement();
}
