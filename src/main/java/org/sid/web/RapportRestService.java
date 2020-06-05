/*package org.sid.web;
  
  
import java.util.ArrayList;
import java.util.List;


import org.sid.dao.AccidentRepository;
import org.sid.dao.AccidentTransportRepository;
import org.sid.dao.AgentPcrRepository;
import org.sid.dao.BusReceveursRepository;
import org.sid.dao.ChauffeurRepository;
import org.sid.dao.DegatRepository;
import org.sid.dao.EmplacementRepository;
import org.sid.dao.LineRepository;
import org.sid.dao.ReceveurRepository;
import org.sid.dao.RecordRepository;
import org.sid.dao.SourceInfoRepository;
import org.sid.dao.TransportChauffeursRepository;
import org.sid.dao.TransportRepository;
import org.sid.dto.RapportAccidentRouteRequest;
import org.sid.dto.RapportAccidentTravailRequest;
import org.sid.dto.RapportDto;
import org.sid.dto.RapportRequest;
import org.sid.dto.RapportTravailDto;
import org.sid.entities.Accident;
import org.sid.entities.AccidentCollision;
import org.sid.entities.AccidentRoute;
import org.sid.entities.AccidentTransport;
import org.sid.entities.AccidentTravail;
import org.sid.entities.AgentPcr;
import org.sid.entities.Bus;
import org.sid.entities.BusReceveurs;
import org.sid.entities.Chauffeur;
import org.sid.entities.Degat;
import org.sid.entities.Emplacement;
import org.sid.entities.Line;
import org.sid.entities.Receveur;
import org.sid.entities.Record;
import org.sid.entities.SourceInfo;
import org.sid.entities.Transport;
import org.sid.entities.TransportChauffeurs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
  
  @RestController
  
  @CrossOrigin(origins = "*") public class RapportRestService {
  @Autowired 
  private SourceInfoRepository  sourceInfoRepository;
  @Autowired 
  private AgentPcrRepository  agentPcrRepository;
  @Autowired 
  private LineRepository  lineRepository;
  @Autowired  
  private ChauffeurRepository  chauffeurRepository;
  @Autowired  
  private ReceveurRepository  receveurRepository;

  @Autowired 
  private AccidentRepository  accidentRepository;
 
  @Autowired 
  private AccidentTransportRepository  accidentTransportRepository;
 
  @Autowired 
  private TransportChauffeursRepository  transportChauffeursRepository;
  @Autowired 
  private BusReceveursRepository  busReceveursRepository;
  @Autowired 
  private DegatRepository  degatRepository;
  @Autowired 
  private RecordRepository  recordRepository;
  @Autowired 
  private EmplacementRepository  emplacementRepository;
  @Autowired 
  private TransportRepository  transportRepository;
  RapportRequest  rapportRequest;
  Accident  accident;
  Line line;
  Bus bus;
  Chauffeur chauffeur;
  Receveur receveur;
  Degat degat ;
  Record record ;
  Emplacement emplacement;
  AccidentTransport accidentTransport;
  TransportChauffeurs transportChauffeurs;
  BusReceveurs busReceveurs;
  List<Accident> accidents =  new ArrayList<Accident>();
  List<Line> lines =  new ArrayList<Line>();
  List<Bus> buss =  new ArrayList<Bus>();
  List<Chauffeur> chauffeurs =  new ArrayList<Chauffeur>();
  List<Receveur> receveurs =  new ArrayList<Receveur>();
  List<Degat> degats =  new ArrayList<Degat>();
  
	
  @RequestMapping(value="/add-rapport-accident-travail",method=RequestMethod.POST)
 public  Boolean addRapportTravail (@RequestBody RapportAccidentTravailRequest  rapportRequest ){
	  AgentPcr agentPcr = new AgentPcr();
	  agentPcr.setNameAgent(rapportRequest.getNameAgent());
	  agentPcr.setLastNameAgent(rapportRequest.getLastNameAgent());
	 
	  agentPcrRepository.save(agentPcr);
	  SourceInfo sourceInfo = new SourceInfo();
	  sourceInfo.setNameInfo(rapportRequest.getNameInfo());
	  sourceInfo.setLastNameInfo(rapportRequest.getLastNameInfo());
	  sourceInfoRepository.save(sourceInfo);
	 
	  Record record1 = new Record(); 
	   record1.setDescriptionRecord(rapportRequest.getDescriptionRecord());
	   record1.setDateRecord(rapportRequest.getDateRecord());
	   record1.setTimeRecord(rapportRequest.getTimeRecord());
	   recordRepository.save(record1);
	   emplacement = new Emplacement();
	   emplacement.setLocalisation(rapportRequest.getLocalisation());
	   emplacementRepository.save(emplacement);
	   AccidentTravail accident = new AccidentTravail();
		accident.setSourceInfo(sourceInfo);
		accident.setAgentPcr(agentPcr);
		accident.setRecord(record1);
	 accident.setEmplacement(emplacement);
	 accident.setTimeAccident(rapportRequest.getTimeAccident());
	 accident.setDateAccident(rapportRequest.getDateAccident());
	 accident.setDescription(rapportRequest.getDescriptionAccident());
	 accidentTravailRepository.save(accident);
	 degat = new Degat();
		degat.setDescriptionDegat(rapportRequest.getDescriptionDegat());
		degat.setAccident(accident);
		degatRepository.save(degat);
         line = new Line();
	 line.setNameLine(rapportRequest.getNameLine());
	lineRepository.save(line);
	chauffeur = new Chauffeur();
	chauffeur.setNameChauffeur(rapportRequest.getNameChauffeur());
	chauffeurRepository.save(chauffeur);
	receveur = new Receveur();
	receveur.setNameReceveur(rapportRequest.getNameReceveur());
	receveurRepository.save(receveur);
	Transport transport = new Transport();
	transport.setNumTransport(rapportRequest.getNumTransport());
	transport.setLine(line);
	transportRepository.save(transport);
	transportChauffeurs = new TransportChauffeurs();
	transportChauffeurs.setTransport(transport);
	transportChauffeurs.setChauffeur(chauffeur);
	transportChauffeursRepository.save(transportChauffeurs);
	busReceveurs = new BusReceveurs();
	busReceveurs.setBus(bus);
	busReceveurs.setReceveur(receveur);
	busReceveursRepository.save(busReceveurs);
	accidentTransport = new AccidentTransport();
	accidentTransport.setAccident(accident);
	accidentTransport.setTransport(transport);
	accidentTransportRepository.save(accidentTransport);
	return true;
		
  }
  
  @RequestMapping(value="/add-rapport-accident-collision",method=RequestMethod.POST)
  public  Boolean addRapportCollision (@RequestBody RapportRequest  rapportRequest ){
 	  AgentPcr agentPcr = new AgentPcr();
 	  agentPcr.setNameAgent(rapportRequest.getNameAgent());
 	  agentPcr.setLastNameAgent(rapportRequest.getLastNameAgent());
 	  agentPcrRepository.save(agentPcr);
 	  SourceInfo sourceInfo = new SourceInfo();
 	  sourceInfo.setNameInfo(rapportRequest.getNameInfo());
 	  sourceInfo.setLastNameInfo(rapportRequest.getLastNameInfo());
 
 	  sourceInfoRepository.save(sourceInfo);
 	 
 	   record = new Record(); 
 	   record.setDescriptionRecord(rapportRequest.getDescriptionRecord());
 	   record.setDateRecord(rapportRequest.getDateRecord());
 	   record.setTimeRecord(rapportRequest.getTimeRecord());
 	   recordRepository.save(record);
 	  emplacement = new Emplacement();
	   emplacement.setLocalisation(rapportRequest.getLocalisation());
	   emplacementRepository.save(emplacement);
 	   AccidentCollision accident = new AccidentCollision();
 		accident.setSourceInfo(sourceInfo);
 		accident.setAgentPcr(agentPcr);
 		accident.setRecord(record);
 	 accident.setEmplacement(emplacement);
 	 accident.setTimeAccident(rapportRequest.getTimeAccident());
 	 accident.setDateAccident(rapportRequest.getDateAccident());
 	 accident.setDescription(rapportRequest.getDescriptionAccident());
 	 accidentCollisionRepository.save(accident);
 	degat = new Degat();
	degat.setDescriptionDegat(rapportRequest.getDescriptionDegat());
	degat.setAccident(accident);
	degatRepository.save(degat);
          line = new Line();
 	 line.setNameLine(rapportRequest.getNameLine());
 	lineRepository.save(line);

 	chauffeur = new Chauffeur();
 	chauffeur.setNameChauffeur(rapportRequest.getNameChauffeur());
 	chauffeurRepository.save(chauffeur);
 	receveur = new Receveur();
 	receveur.setNameReceveur(rapportRequest.getNameReceveur());
 	receveurRepository.save(receveur);
 	Transport transport = new Transport();
	transport.setNumTransport(rapportRequest.getNumTransport());
	transport.setLine(line);
	transportRepository.save(transport);
	transportChauffeurs = new TransportChauffeurs();
	transportChauffeurs.setTransport(transport);
	transportChauffeurs.setChauffeur(chauffeur);
	transportChauffeursRepository.save(transportChauffeurs);
 	busReceveurs = new BusReceveurs();
 	busReceveurs.setBus(bus);
 	busReceveurs.setReceveur(receveur);
 	busReceveursRepository.save(busReceveurs);
 	accidentTransport = new AccidentTransport();
	accidentTransport.setAccident(accident);
	accidentTransport.setTransport(transport);
	accidentTransportRepository.save(accidentTransport);
 	return true;
 		
   }
  @RequestMapping(value="/add-rapport-accident-route",method=RequestMethod.POST)
  public  Boolean addRapportRoute (@RequestBody RapportAccidentRouteRequest  rapportRequest ){
 	  AgentPcr agentPcr = new AgentPcr();
 	  agentPcr.setNameAgent(rapportRequest.getNameAgent());
 	  agentPcr.setLastNameAgent(rapportRequest.getLastNameAgent());
 	  agentPcrRepository.save(agentPcr);
 	  SourceInfo sourceInfo = new SourceInfo();
 	  sourceInfo.setNameInfo(rapportRequest.getNameInfo());
 	  sourceInfo.setLastNameInfo(rapportRequest.getLastNameInfo());
 	  sourceInfoRepository.save(sourceInfo);
 	 
 	   record = new Record(); 
 	   record.setDescriptionRecord(rapportRequest.getDescriptionRecord());
 	   record.setDateRecord(rapportRequest.getDateRecord());
 	   record.setTimeRecord(rapportRequest.getTimeRecord());
 	   recordRepository.save(record);
 	  emplacement = new Emplacement();
	   emplacement.setLocalisation(rapportRequest.getLocalisation());
	   emplacementRepository.save(emplacement);
 	   AccidentRoute accident = new AccidentRoute();
 		accident.setSourceInfo(sourceInfo);
 		accident.setAgentPcr(agentPcr);
 		accident.setRecord(record);
 	 accident.setEmplacement(emplacement);
 	 accident.setTimeAccident(rapportRequest.getTimeAccident());
 	 accident.setDateAccident(rapportRequest.getDateAccident());
 	 accident.setDescription(rapportRequest.getDescriptionAccident());
 	
 	 accidentRouteRepository.save(accident);
 	degat = new Degat();
	degat.setDescriptionDegat(rapportRequest.getDescriptionDegat());
	degat.setAccident(accident);
	degatRepository.save(degat);
      accidentRepository.save(accident);
          line = new Line();
 	 line.setNameLine(rapportRequest.getNameLine());
 	lineRepository.save(line);
 	chauffeur = new Chauffeur();
 	chauffeur.setNameChauffeur(rapportRequest.getNameChauffeur());
 	chauffeurRepository.save(chauffeur);
 	receveur = new Receveur();
 	receveur.setNameReceveur(rapportRequest.getNameReceveur());
 	receveurRepository.save(receveur);
 	Transport transport = new Transport();
	transport.setNumTransport(rapportRequest.getNumTransport());
	transport.setLine(line);
	transportRepository.save(transport);
	transportChauffeurs = new TransportChauffeurs();
	transportChauffeurs.setTransport(transport);
	transportChauffeurs.setChauffeur(chauffeur);
	transportChauffeursRepository.save(transportChauffeurs);
 	busReceveurs = new BusReceveurs();
 	busReceveurs.setBus(bus);
 	busReceveurs.setReceveur(receveur);
 	busReceveursRepository.save(busReceveurs);
 	accidentTransport = new AccidentTransport();
	accidentTransport.setAccident(accident);
	accidentTransport.setTransport(transport);
 	return true;
 		
   }
   
  
  @RequestMapping(value="/update-rapport-accident-travail/{id}",method=RequestMethod.PUT)
  public  Boolean updateRapportAccidentTravail (@PathVariable Long id,@RequestBody RapportAccidentTravailRequest  rapportRequest ){
 	  AgentPcr agentPcr = new AgentPcr();
 	  agentPcr.setNameAgent(rapportRequest.getNameAgent());
 	  agentPcr.setLastNameAgent(rapportRequest.getLastNameAgent());
 	  agentPcrRepository.save(agentPcr);
 	  SourceInfo sourceInfo = new SourceInfo();
 	  sourceInfo.setNameInfo(rapportRequest.getNameInfo());
 	  sourceInfo.setLastNameInfo(rapportRequest.getLastNameInfo());
 	  sourceInfoRepository.save(sourceInfo);
 	  
 	   record = new Record(); 
 	   record.setDescriptionRecord(rapportRequest.getDescriptionRecord());
 	   record.setDateRecord(rapportRequest.getDateRecord());
 	   record.setTimeRecord(rapportRequest.getTimeRecord());
 	   recordRepository.save(record);
	   emplacement = new Emplacement();
	   emplacement.setLocalisation(rapportRequest.getLocalisation());
	   emplacementRepository.save(emplacement);
 	  AccidentTravail accident = (AccidentTravail) accidentTravailRepository.findById(id).orElse(null);
 		accident.setSourceInfo(sourceInfo);
 		accident.setAgentPcr(agentPcr);
 		accident.setRecord(record);
 	 accident.setEmplacement(emplacement);
 	 accident.setTimeAccident(rapportRequest.getTimeAccident());
 	 accident.setDateAccident(rapportRequest.getDateAccident());
 	 accident.setDescription(rapportRequest.getDescriptionAccident());
 	accidentTravailRepository.save(accident);
 	degat = new Degat();
	degat.setDescriptionDegat(rapportRequest.getDescriptionDegat());
	degat.setAccident(accident);
	degatRepository.save(degat);
      line = new Line();
 	 line.setNameLine(rapportRequest.getNameLine());
 	lineRepository.save(line);
 	chauffeur = new Chauffeur();
 	chauffeur.setNameChauffeur(rapportRequest.getNameChauffeur());
 	chauffeurRepository.save(chauffeur);
 	receveur = new Receveur();
 	receveur.setNameReceveur(rapportRequest.getNameReceveur());
 	receveurRepository.save(receveur);
 	Transport transport = new Transport();
	transport.setNumTransport(rapportRequest.getNumTransport());
	transport.setLine(line);
	transportRepository.save(transport);
	transportChauffeurs = new TransportChauffeurs();
	transportChauffeurs.setTransport(transport);
	transportChauffeurs.setChauffeur(chauffeur);
	transportChauffeursRepository.save(transportChauffeurs);
 	busReceveurs = new BusReceveurs();
 	busReceveurs.setBus(bus);
 	busReceveurs.setReceveur(receveur);
 	busReceveursRepository.save(busReceveurs);
 	accidentTransport = new AccidentTransport();
	accidentTransport.setAccident(accident);
	accidentTransport.setTransport(transport);
 	return true;
 		
   }
  
  @RequestMapping(value="/update-rapport-accident-collision/{id}",method=RequestMethod.PUT)
  public  Boolean updateRapportAccidentCollision (@PathVariable Long id,@RequestBody RapportRequest  rapportRequest ){
 	  AgentPcr agentPcr = new AgentPcr();
 	  agentPcr.setNameAgent(rapportRequest.getNameAgent());
 	  agentPcr.setLastNameAgent(rapportRequest.getLastNameAgent());
 	  agentPcrRepository.save(agentPcr);
 	  SourceInfo sourceInfo = new SourceInfo();
 	  sourceInfo.setNameInfo(rapportRequest.getNameInfo());
 	  sourceInfo.setLastNameInfo(rapportRequest.getLastNameInfo());
 	  sourceInfoRepository.save(sourceInfo);
 	  
 	   record = new Record(); 
 	   record.setDescriptionRecord(rapportRequest.getDescriptionRecord());
 	   record.setDateRecord(rapportRequest.getDateRecord());
 	   record.setTimeRecord(rapportRequest.getTimeRecord());
 	   recordRepository.save(record);
 	  emplacement = new Emplacement();
	   emplacement.setLocalisation(rapportRequest.getLocalisation());
	   emplacementRepository.save(emplacement);
 	  AccidentCollision accident = (AccidentCollision) accidentCollisionRepository.findById(id).orElse(null);
 		accident.setSourceInfo(sourceInfo);
 		accident.setAgentPcr(agentPcr);
 		accident.setRecord(record);
 	 accident.setEmplacement(emplacement);
 	 accident.setTimeAccident(rapportRequest.getTimeAccident());
 	 accident.setDateAccident(rapportRequest.getDateAccident());
 	 accident.setDescription(rapportRequest.getDescriptionAccident());
 	accidentCollisionRepository.save(accident);
 	degat = new Degat();
	degat.setDescriptionDegat(rapportRequest.getDescriptionDegat());
	degat.setAccident(accident);
	degatRepository.save(degat);
      line = new Line();
 	 line.setNameLine(rapportRequest.getNameLine());
 	lineRepository.save(line);
 	chauffeur = new Chauffeur();
 	chauffeur.setNameChauffeur(rapportRequest.getNameChauffeur());
 	chauffeurRepository.save(chauffeur);
 	receveur = new Receveur();
 	receveur.setNameReceveur(rapportRequest.getNameReceveur());
 	receveurRepository.save(receveur);
 	Transport transport = new Transport();
	transport.setNumTransport(rapportRequest.getNumTransport());
	transport.setLine(line);
	transportRepository.save(transport);
	transportChauffeurs = new TransportChauffeurs();
	transportChauffeurs.setTransport(transport);
	transportChauffeurs.setChauffeur(chauffeur);
	transportChauffeursRepository.save(transportChauffeurs);
 	busReceveurs = new BusReceveurs();
 	busReceveurs.setBus(bus);
 	busReceveurs.setReceveur(receveur);
 	busReceveursRepository.save(busReceveurs);
 	accidentTransport = new AccidentTransport();
	accidentTransport.setAccident(accident);
	accidentTransport.setTransport(transport);
 	return true;
 		
   }
  
  @RequestMapping(value="/update-rapport-accident-route/{id}",method=RequestMethod.PUT)
  public  Boolean updateRapportAccidentRoute (@PathVariable Long id,@RequestBody RapportAccidentRouteRequest  rapportRequest ){
 	  AgentPcr agentPcr = new AgentPcr();
 	  agentPcr.setNameAgent(rapportRequest.getNameAgent());
 	  agentPcr.setLastNameAgent(rapportRequest.getLastNameAgent());
 	  agentPcrRepository.save(agentPcr);
 	  SourceInfo sourceInfo = new SourceInfo();
 	  sourceInfo.setNameInfo(rapportRequest.getNameInfo());
 	  sourceInfo.setLastNameInfo(rapportRequest.getLastNameInfo());
 	  sourceInfoRepository.save(sourceInfo);
 	   record = new Record(); 
 	   record.setDescriptionRecord(rapportRequest.getDescriptionRecord());
 	   record.setDateRecord(rapportRequest.getDateRecord());
 	   record.setTimeRecord(rapportRequest.getTimeRecord());
 	   recordRepository.save(record);
 	  emplacement = new Emplacement();
	   emplacement.setLocalisation(rapportRequest.getLocalisation());
	   emplacementRepository.save(emplacement);
 	  AccidentRoute accident = (AccidentRoute) accidentRouteRepository.findById(id).orElse(null);
 		accident.setSourceInfo(sourceInfo);
 		accident.setAgentPcr(agentPcr);
 		accident.setRecord(record);
 	 accident.setEmplacement(emplacement);
 	 accident.setTimeAccident(rapportRequest.getTimeAccident());
 	 accident.setDateAccident(rapportRequest.getDateAccident());
 	 accident.setDescription(rapportRequest.getDescriptionAccident());
 	accidentRouteRepository.save(accident);
 	degat = new Degat();
	degat.setDescriptionDegat(rapportRequest.getDescriptionDegat());
	degat.setAccident(accident);
	degatRepository.save(degat);
      line = new Line();
 	 line.setNameLine(rapportRequest.getNameLine());
 	lineRepository.save(line);

 	chauffeur = new Chauffeur();
 	chauffeur.setNameChauffeur(rapportRequest.getNameChauffeur());
 	chauffeurRepository.save(chauffeur);
 	receveur = new Receveur();
 	receveur.setNameReceveur(rapportRequest.getNameReceveur());
 	receveurRepository.save(receveur);
 	Transport transport = new Transport();
	transport.setNumTransport(rapportRequest.getNumTransport());
	transport.setLine(line);
	transportRepository.save(transport);
	transportChauffeurs = new TransportChauffeurs();
	transportChauffeurs.setTransport(transport);
	transportChauffeurs.setChauffeur(chauffeur);
	transportChauffeursRepository.save(transportChauffeurs);
 	busReceveurs = new BusReceveurs();
 	busReceveurs.setBus(bus);
 	busReceveurs.setReceveur(receveur);
 	busReceveursRepository.save(busReceveurs);
 	accidentTransport = new AccidentTransport();
	accidentTransport.setAccident(accident);
	accidentTransport.setTransport(transport);
 	return true;
 		
   }
  @RequestMapping(value="/delete-rapport/{id}",method=RequestMethod.DELETE)
  public  Boolean deleteRapport (@PathVariable Long id ){
	 accident= accidentRepository.findById(id).orElse(null);
	 accidentRepository.deleteById(id);
	  return true;  
  }
  @RequestMapping(value="/listRapportAccidentTravail",method=RequestMethod.GET)
  public List <RapportTravailDto> fetchRapportAccidentTravail() {
	  
	  
	 return accidentTravailRepository.fetchRapportAccidentTravail();
	 
	 
  }
  
  @RequestMapping(value="/listRapportAccidentCollision",method=RequestMethod.GET)
  public List <RapportDto> fetchRapportAccidentCollision() {
	  
	  
	 return accidentCollisionRepository.fetchRapportAccidentCollision();
	 
	 
  }
  
  @RequestMapping(value="/listRapportAccidentRoute",method=RequestMethod.GET)
  public List <RapportDto> fetchRapportAccident() {
	  
	  
	 return accidentRouteRepository.fetchRapportAccidentRoute();
	 
	 
  }
  
 
  
  @RequestMapping(value="/add-rapport-collision",method=RequestMethod.POST)
  public  Boolean addRapportAccidentCollision (@RequestBody RapportDto  r ){
	    line = new Line();
	    line.setNameLine(r.getNameLine());
	    lineRepository.save(line);
	    emplacement = new Emplacement();
		emplacement.setLocalisation(r.getLocalisation());
		emplacementRepository.save(emplacement);
	 	Transport transport = new Transport();
		transport.setNumTransport(r.getNumTransport());
		transport.setLine(line);
		transportRepository.save(transport);
		chauffeur = new Chauffeur();
	 	chauffeur.setNameChauffeur(r.getNameChauffeur());
	 	chauffeurRepository.save(chauffeur);
	 	receveur = new Receveur();
	 	receveur.setNameReceveur(r.getNameReceveur());
	 	receveurRepository.save(receveur);
	 	degat = new Degat();
		degat.setDescriptionDegat(r.getDescriptionDegat());
		degat.setAccident(accident);
		degatRepository.save(degat);
 	  AccidentCollision accident = new AccidentCollision();
 	 accident.setTimeAccident(r.getTimeAccident());
 	 accident.setDateAccident(r.getDateAccident());
 	accident.setEmplacement(emplacement);
 	 accidentCollisionRepository.save(accident);
 	
    
 	
 	
 	
 	
	transportChauffeurs = new TransportChauffeurs();
	transportChauffeurs.setTransport(transport);
	transportChauffeurs.setChauffeur(chauffeur);
	transportChauffeursRepository.save(transportChauffeurs);
 	busReceveurs = new BusReceveurs();
 	busReceveurs.setBus((Bus) transport);
 	busReceveurs.setReceveur(receveur);
 	busReceveursRepository.save(busReceveurs);
 	accidentTransport = new AccidentTransport();
	accidentTransport.setAccident(accident);
	accidentTransport.setTransport(transport);
	accidentTransportRepository.save(accidentTransport);
 	return true;
 		
   }
  
  @RequestMapping(value="/add-rapport-route",method=RequestMethod.POST)
  public  Boolean addRapportAccidentRoute (@RequestBody RapportDto  r ){
	    line = new Line();
	    line.setNameLine(r.getNameLine());
	    lineRepository.save(line);
	    emplacement = new Emplacement();
		emplacement.setLocalisation(r.getLocalisation());
		emplacementRepository.save(emplacement);
	 	Transport transport = new Transport();
		transport.setNumTransport(r.getNumTransport());
		transport.setLine(line);
		transportRepository.save(transport);
		chauffeur = new Chauffeur();
	 	chauffeur.setNameChauffeur(r.getNameChauffeur());
	 	chauffeurRepository.save(chauffeur);
	 	receveur = new Receveur();
	 	receveur.setNameReceveur(r.getNameReceveur());
	 	receveurRepository.save(receveur);
	 	degat = new Degat();
		degat.setDescriptionDegat(r.getDescriptionDegat());
		degat.setAccident(accident);
		degatRepository.save(degat);
 	  AccidentRoute accident = new AccidentRoute();
 	 accident.setTimeAccident(r.getTimeAccident());
 	 accident.setDateAccident(r.getDateAccident());
 	accident.setEmplacement(emplacement);
 	 accidentRouteRepository.save(accident);
	transportChauffeurs = new TransportChauffeurs();
	transportChauffeurs.setTransport(transport);
	transportChauffeurs.setChauffeur(chauffeur);
	transportChauffeursRepository.save(transportChauffeurs);
 	busReceveurs = new BusReceveurs();
 	busReceveurs.setBus((Bus) transport);
 	busReceveurs.setReceveur(receveur);
 	busReceveursRepository.save(busReceveurs);
 	accidentTransport = new AccidentTransport();
	accidentTransport.setAccident(accident);
	accidentTransport.setTransport(transport);
	accidentTransportRepository.save(accidentTransport);
 	return true;
 		
   }
  
  
  @RequestMapping(value="/add-rapport-travail",method=RequestMethod.POST)
  public  Boolean addRapportAccidentTravail (@RequestBody RapportTravailDto  rt ){
	    line = new Line();
	    line.setNameLine(rt.getNameLine());
	    lineRepository.save(line);
	    emplacement = new Emplacement();
		emplacement.setLocalisation(rt.getLocalisation());
		emplacementRepository.save(emplacement);
	 	Transport transport = new Transport();
		transport.setNumTransport(rt.getNumTransport());
		transport.setLine(line);
		transportRepository.save(transport);
		
	 	
	 	degat = new Degat();
		degat.setDescriptionDegat(rt.getDescriptionDegat());
		degat.setAccident(accident);
		degatRepository.save(degat);
 	  AccidentTravail accident = new AccidentTravail();
 	 accident.setTimeAccident(rt.getTimeAccident());
 	 accident.setDateAccident(rt.getDateAccident());
 	accident.setTypeAccTravail(rt.getTypeAccTravail());
 	accident.setEmplacement(emplacement);
 
 	 accidentTravailRepository.save(accident);
 	accidentTransport = new AccidentTransport();
	accidentTransport.setAccident(accident);
	accidentTransport.setTransport(transport);
	accidentTransportRepository.save(accidentTransport);
 	return true;
 		
   }
  
  @RequestMapping(value="/update-rapport-travail/{id}",method=RequestMethod.PUT)
  public  Boolean updateRapportTravail (@PathVariable Long id,@RequestBody RapportTravailDto  rt ){
	  line = new Line();
	    line.setNameLine(rt.getNameLine());
	    lineRepository.save(line);
	    emplacement = new Emplacement();
		emplacement.setLocalisation(rt.getLocalisation());
		emplacementRepository.save(emplacement);
	 	Transport transport = new Transport();
		transport.setNumTransport(rt.getNumTransport());
		transport.setLine(line);
		transportRepository.save(transport);
		
	 	
	 	degat = new Degat();
		degat.setDescriptionDegat(rt.getDescriptionDegat());
		degat.setAccident(accident);
		degatRepository.save(degat);
	 AccidentTravail accident = (AccidentTravail) accidentTravailRepository.findById(id).orElse(null);;
	 accident.setDateAccident(rt.getDateAccident());
	accident.setTypeAccTravail(rt.getTypeAccTravail());
	accident.setEmplacement(emplacement);

	 accidentTravailRepository.save(accident);
	accidentTransport = new AccidentTransport();
	accidentTransport.setAccident(accident);
	accidentTransport.setTransport(transport);
	accidentTransportRepository.save(accidentTransport);
	return true;
  }
  @RequestMapping(value="/update-rapport-collision/{id}",method=RequestMethod.PUT)
  public  Boolean updateRapportCollision (@PathVariable Long id,@RequestBody RapportDto  r ){
	  line = new Line();
	    line.setNameLine(r.getNameLine());
	    lineRepository.save(line);
	    emplacement = new Emplacement();
		emplacement.setLocalisation(r.getLocalisation());
		emplacementRepository.save(emplacement);
	 	Transport transport = new Transport();
		transport.setNumTransport(r.getNumTransport());
		transport.setLine(line);
		transportRepository.save(transport);
		chauffeur = new Chauffeur();
	 	chauffeur.setNameChauffeur(r.getNameChauffeur());
	 	chauffeurRepository.save(chauffeur);
	 	receveur = new Receveur();
	 	receveur.setNameReceveur(r.getNameReceveur());
	 	receveurRepository.save(receveur);
	 	degat = new Degat();
		degat.setDescriptionDegat(r.getDescriptionDegat());
		degat.setAccident(accident);
		degatRepository.save(degat);
	  AccidentCollision accident = (AccidentCollision) accidentCollisionRepository.findById(id).orElse(null);
	 accident.setTimeAccident(r.getTimeAccident());
	 accident.setDateAccident(r.getDateAccident());
	accident.setEmplacement(emplacement);
	 accidentCollisionRepository.save(accident);	
	transportChauffeurs = new TransportChauffeurs();
	transportChauffeurs.setTransport(transport);
	transportChauffeurs.setChauffeur(chauffeur);
	transportChauffeursRepository.save(transportChauffeurs);
	busReceveurs = new BusReceveurs();
	busReceveurs.setBus((Bus) transport);
	busReceveurs.setReceveur(receveur);
	busReceveursRepository.save(busReceveurs);
	accidentTransport = new AccidentTransport();
	accidentTransport.setAccident(accident);
	accidentTransport.setTransport(transport);
	accidentTransportRepository.save(accidentTransport);
	return true;
  }
  @RequestMapping(value="/update-rapport-route/{id}",method=RequestMethod.PUT)
  public  Boolean updateRapportRoute (@PathVariable Long id,@RequestBody RapportDto  r ){
	  line = new Line();
	    line.setNameLine(r.getNameLine());
	    lineRepository.save(line);
	    emplacement = new Emplacement();
		emplacement.setLocalisation(r.getLocalisation());
		emplacementRepository.save(emplacement);
	 	Transport transport = new Transport();
		transport.setNumTransport(r.getNumTransport());
		transport.setLine(line);
		transportRepository.save(transport);
		chauffeur = new Chauffeur();
	 	chauffeur.setNameChauffeur(r.getNameChauffeur());
	 	chauffeurRepository.save(chauffeur);
	 	receveur = new Receveur();
	 	receveur.setNameReceveur(r.getNameReceveur());
	 	receveurRepository.save(receveur);
	 	degat = new Degat();
		degat.setDescriptionDegat(r.getDescriptionDegat());
		degat.setAccident(accident);
		degatRepository.save(degat);
		 AccidentRoute accident = (AccidentRoute) accidentRouteRepository.findById(id).orElse(null);
	 accident.setTimeAccident(r.getTimeAccident());
	 accident.setDateAccident(r.getDateAccident());
	accident.setEmplacement(emplacement);
	 accidentRouteRepository.save(accident);
	transportChauffeurs = new TransportChauffeurs();
	transportChauffeurs.setTransport(transport);
	transportChauffeurs.setChauffeur(chauffeur);
	transportChauffeursRepository.save(transportChauffeurs);
	busReceveurs = new BusReceveurs();
	busReceveurs.setBus((Bus) transport);
	busReceveurs.setReceveur(receveur);
	busReceveursRepository.save(busReceveurs);
	accidentTransport = new AccidentTransport();
	accidentTransport.setAccident(accident);
	accidentTransport.setTransport(transport);
	accidentTransportRepository.save(accidentTransport);
	return true; 
  }
  }
*/