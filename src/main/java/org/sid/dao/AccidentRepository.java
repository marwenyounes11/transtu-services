package org.sid.dao;







import java.util.List;

import org.sid.dto.AccidentDto;
import org.sid.dto.DeclarationAccidentDto;
import org.sid.entities.Accident;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AccidentRepository extends JpaRepository<Accident,Long>  {

	@Query("select a from Accident a where a.description like :x")
	public Page<Accident> chercherAccident(@Param("x")String mc,Pageable pageable);
	
	

	
	
	
	 @Query("SELECT new org.sid.dto.AccidentDto(a.id,a.timeAccident,a.dateAccident,a.dateSaisi,a.timeSaisi,a.dateInfo,a.timeInfo,a.description,a.photo,e.id,p.id,r.id,s.id) "
			  +
			  "FROM SourceInfo s ,AgentPcr p,Emplacement e,Record r,Accident a WHERE s.id=a.sourceInfo and p.id=a.agentPcr and e.id=a.emplacement and r.id=a.record  "
			  ) List<AccidentDto> listAccident();
	  
	 /*@Query("SELECT new org.sid.dto.DeclarationAccidentDto(a.id,a.dateSaisi,a.timeSaisi,p.id,p.nameAgent,p.lastNameAgent,s.natureInfo,s.phoneInfo,s.nameInfo,s.lastNameInfo,c.id,c.nameChauffeur,c.lastNameChauffeur,c.phoneChauffeur,r.id,r.nameReceveur,r.lastNameReceveur,r.phoneReceveur,e.localisation,a.timeAccident,a.dateAccident,t.numTransport,l.nameLine,dp.nameDistrict,a.description,at.label,d.descriptionDegat,rc.id,rc.dateRecord,rc.timeRecord) "
	  +
	  "FROM SourceInfo s ,AgentPcr p,Emplacement e,Line l ,Depot dp,AccidentType at,Chauffeur c, Receveur r,Record rc,Accident a,Degat d,AccidentTransport att , Transport t,TransportChauffeurs tc,TransportReceveurs tr WHERE s.id=a.sourceInfo and p.id=a.agentPcr and e.id=a.emplacement and l.id=t.line and dp.id=t.depot and r.id=a.record and a.id=at.accident and a.id=att.accident and c.id=tc.chauffeur and t.id=tc.transport and r.id=tr.receveur and t.id=tr.transport and t.id=att.transport and a.id=d.accident "
			  ) List<DeclarationAccidentDto> listDeclaration();*/
	 
	 
	/* @Query("SELECT new org.sid.dto.AccidentRouteDto(a.id,a.timeAccident,a.dateAccident,a.dateSaisi,a.timeSaisi,a.dateInfo,a.timeInfo,a.description,a.photo,a.typeAccRoute,e.id,p.id,r.id,s.id,d.id,t.id) "
			  +
			  "FROM SourceInfo s ,AgentPcr p,Emplacement e,Record r,AccidentRoute a,Degat d,AccidentTransport at , Transport t WHERE s.id=a.sourceInfo and p.id=a.agentPcr and e.id=a.emplacement and r.id=a.record  and a.id=at.accident and t.id=at.transport and a.id=d.accident "
			  ) List<AccidentRouteDto> fetchAccidentRoute();*/
	
			 
	/* "FROM SourceInfo s ,AgentPcr p,Line l ,Depot d,Record r,AccidentType at, Bus b,BusChauffeurs bc ,Chauffeur c, BusReceveurs br,Receveur r,Emplacement e,Transport t ,AccidentBus ab , Accident a , Degat g WHERE l.id=b.line and d.id=b.district and c.id=bc.chauffeur and b.id=bc.bus and r.id=br.receveur and b.id=br.bus and a.id=ab.accident and b.id=ab.bus and a.id=g.accident "
 ) List<DeclarationDto> listDeclaration();*/
}
