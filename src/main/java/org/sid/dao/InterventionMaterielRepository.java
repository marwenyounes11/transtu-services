package org.sid.dao;

import java.util.List;


import org.sid.dto.InterventionMaterielDto;
import org.sid.entities.InterventionMateriel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface InterventionMaterielRepository extends JpaRepository<InterventionMateriel,Long>  {
	@Query("SELECT new org.sid.dto.InterventionMaterielDto(im.id,i.id,m.id) "
			  +
			  "FROM InterventionMateriel im,Intervention i,Materiel m WHERE i.id=im.intervention and m.id=im.materiel"
			  ) List<InterventionMaterielDto> listInterventionMateriel();
}
