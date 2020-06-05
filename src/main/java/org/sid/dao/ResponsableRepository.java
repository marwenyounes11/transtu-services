package org.sid.dao;

import java.util.List;


import org.sid.dto.DeclarationResponsableDto;
import org.sid.entities.Responsable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ResponsableRepository extends JpaRepository<Responsable,Long>{
	
	 
	 
	 
	/* @Query("SELECT new org.sid.dto.DeclarationResponsableDto(a.id,a.dateInfo,a.timeInfo,r.natureResponsable,r.nameResponsable,r.lastNameResponsable,r.phoneResponsable,a.description,o.typeSecurite,am.nameAmbulancier,am.lastNameAmbulancier,am.phoneAmbulancier) "
			  +
			  "FROM Responsable r ,Securite o,Ambulancier am ,AccidentSecurite acs,AccidentAmbulancier aa ,AccidentResponsable ar,Accident a WHERE a.id=ar.accident and r.id=ar.responsable and a.id=acs.accidentt and o.id=acs.securite and a.id=aa.accident and am.id=aa.ambulancier "
					  ) List<DeclarationResponsableDto> listDeclarationResponsable();*/
	 
	 
	
	
}
