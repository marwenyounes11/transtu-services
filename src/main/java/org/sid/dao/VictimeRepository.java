package org.sid.dao;


import java.util.List;


import org.sid.dto.VictimeDto;
import org.sid.entities.Victime;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface VictimeRepository extends JpaRepository<Victime,Long> {
	@Query("select v from Victime v where v.nameVictime like :x")
	public Page<Victime> chercherVictime(@Param("x")String mc,Pageable pageable);
	 @Query("SELECT new org.sid.dto.VictimeDto(v.id,v.corpBlesser,v.etatVictime,v.lastNameVictime,v.nameVictime,v.niveauBlessure,v.typeVictime,a.id) "
			  + "FROM Victime v , Accident a WHERE a.id= v.accident") 
			  List<VictimeDto> listVictime();
}
