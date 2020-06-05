package org.sid.servicesImpl;


import java.util.List;
import java.util.Optional;

import org.sid.dao.AccidentRepository;
import org.sid.dao.AccidentSubTypeRepository;
import org.sid.dao.AccidentTypeRepository;
import org.sid.dao.AgentPcrRepository;
import org.sid.dao.ChauffeurRepository;
import org.sid.dao.DeclarationAccRepository;
import org.sid.dao.DegatRepository;
import org.sid.dao.DepotRepository;
import org.sid.dao.EmplacementRepository;
import org.sid.dao.LineRepository;
import org.sid.dao.ReceveurRepository;
import org.sid.dao.RecordRepository;
import org.sid.dao.SourceInfoRepository;
import org.sid.dao.TransportRepository;
import org.sid.dto.DeclarationAccidentDto;
import org.sid.entities.Accident;
import org.sid.entities.AccidentSubType;
import org.sid.entities.AccidentType;
import org.sid.entities.AgentPcr;
import org.sid.entities.Chauffeur;
import org.sid.entities.DeclarationAcc;
import org.sid.entities.Degat;
import org.sid.entities.Depot;
import org.sid.entities.Emplacement;
import org.sid.entities.Line;
import org.sid.entities.Receveur;
import org.sid.entities.Record;
import org.sid.entities.SourceInfo;
import org.sid.entities.Transport;
import org.sid.exception.RestException;
import org.sid.exception.RestExceptionCode;
import org.sid.services.DeclarationAccidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class DeclarationAccidentServiceImpl implements DeclarationAccidentService{
	@Autowired 
	  private DeclarationAccRepository  declarationAccRepository;
	@Autowired
	private AccidentRepository accidentRepository;
	@Autowired
	private EmplacementRepository emplacementRepository;
	@Autowired
	private AccidentTypeRepository accidentTypeRepository;
	@Autowired
	private AccidentSubTypeRepository accidentSubTypeRepository;
	@Autowired
	private AgentPcrRepository agentRepository;
	@Autowired
	private SourceInfoRepository sourceInfoRepository;
	@Autowired
	private ChauffeurRepository chauffeurRepository;
	@Autowired
	private ReceveurRepository receveurRepository;
	@Autowired
	private TransportRepository transportRepository;
	@Autowired
	private LineRepository lineRepository;
	@Autowired
	private DepotRepository depotRepository;
	@Autowired
	private DegatRepository degatRepository;
	@Autowired
	private RecordRepository recordRepository;
	 
	  
	  Accident  accident;
	  AccidentType  accidentType;
	  AccidentSubType  accidentSubType;
	  AgentPcr agentPcr ;
	  SourceInfo  sourceInfo;
	  Chauffeur chauffeur;
	  Receveur receveur;
	  Emplacement emplacement;
	  Transport transport;
	  Line line;
	  Depot depot ;
	  Degat degat ;
	  Record record ;
	@Override
	public Boolean saveDeclaration(DeclarationAccidentDto declarationDto) {
		DeclarationAcc  declarationAcc = new DeclarationAcc();
		Accident accident =accidentRepository.findById(declarationDto.getIdAccident()).orElse(null);
		Emplacement emplacement =emplacementRepository.findById(declarationDto.getIdEmplacement()).orElse(null);
		 AccidentType accidentType =accidentTypeRepository.findById(declarationDto.getIdAccidenttype()).orElse(null);
		 AccidentSubType accidentSubType =accidentSubTypeRepository.findById(declarationDto.getIdAccidentsubtype()).orElse(null);
		 AgentPcr agentPcr = agentRepository.findById(declarationDto.getIdAgent()).orElse(null);
		SourceInfo sourceInfo =sourceInfoRepository.findById(declarationDto.getIdSourceInfo()).orElse(null);
		Chauffeur chauffeur =chauffeurRepository.findById(declarationDto.getIdChauffeur()).orElse(null);
		Receveur receveur =receveurRepository.findById(declarationDto.getIdReceveur()).orElse(null);
		 Transport transport =transportRepository.findById(declarationDto.getIdTransport()).orElse(null);
		Line line =lineRepository.findById(declarationDto.getIdLine()).orElse(null);
		Depot depot =depotRepository.findById(declarationDto.getIdDepot()).orElse(null);
		Degat degat =degatRepository.findById(declarationDto.getIdDegat()).orElse(null);
	      Record record =recordRepository.findById(declarationDto.getIdRecord()).orElse(null);
		 String dateSaisi=declarationDto.getDateSaisi();
		 String dateAccident=declarationDto.getDateAccident();
		 String timeSaisi=declarationDto.getTimeSaisi();
		 String timeAccident=declarationDto.getTimeAccident();
		String descriptionAccident=declarationDto.getDescription();
		if(descriptionAccident== ""){
			RestExceptionCode code = RestExceptionCode.DESCRIPTION_EMPTY;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
		}
		
		if(descriptionAccident==null){
			RestExceptionCode code = RestExceptionCode.DESCRIPTION_NOT_FOUND;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
		}
		
		
		
		 
		
		
		String nameAgent=declarationDto.getNameAgent();
		String lastNameAgent=declarationDto.getLastNameAgent();
		  
		  if(nameAgent== ""){
				RestExceptionCode code = RestExceptionCode.NAME_EMPTY;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			
			if(nameAgent==null){
				RestExceptionCode code = RestExceptionCode.NAME_NOT_FOUND;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			if(lastNameAgent== ""){
				RestExceptionCode code = RestExceptionCode.LASTNAME_EMPTY;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			
			if(lastNameAgent==null){
				RestExceptionCode code = RestExceptionCode.LASTNAME_NOT_FOUND;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			
			
			
		 
		  String nameInfo=declarationDto.getNameInfo();
			String lastNameInfo=declarationDto.getLastNameInfo();
			 String phoneInfo=declarationDto.getPhoneInfo();
			 String regExpPhone ="^\\d{8}$";	
			if(nameInfo== ""){
				RestExceptionCode code = RestExceptionCode.NAME_EMPTY;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			
			if(nameInfo==null){
				RestExceptionCode code = RestExceptionCode.NAME_NOT_FOUND;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			if(lastNameInfo== ""){
				RestExceptionCode code = RestExceptionCode.LASTNAME_EMPTY;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			
			if(lastNameInfo==null){
				RestExceptionCode code = RestExceptionCode.LASTNAME_NOT_FOUND;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			if(!(phoneInfo).matches(regExpPhone)){
				RestExceptionCode code = RestExceptionCode.PHONE_INCORRECT;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			
		 
		  
		 
			String nameChauffeur=declarationDto.getNameChauffeur();
			String lastNameChauffeur=declarationDto.getLastNameChauffeur();
			String phoneChauffeur=declarationDto.getPhoneChauffeur();
			  
			  if(nameChauffeur== ""){
					RestExceptionCode code = RestExceptionCode.NAME_EMPTY;
					RestException ex = new RestException(code.getError(), code);
					throw ex;
				}
				
				if(nameChauffeur==null){
					RestExceptionCode code = RestExceptionCode.NAME_NOT_FOUND;
					RestException ex = new RestException(code.getError(), code);
					throw ex;
				}
				if(lastNameChauffeur== ""){
					RestExceptionCode code = RestExceptionCode.LASTNAME_EMPTY;
					RestException ex = new RestException(code.getError(), code);
					throw ex;
				}
				
				if(lastNameChauffeur==null){
					RestExceptionCode code = RestExceptionCode.LASTNAME_NOT_FOUND;
					RestException ex = new RestException(code.getError(), code);
					throw ex;
				}
				if(!(phoneChauffeur).matches(regExpPhone)){
					RestExceptionCode code = RestExceptionCode.PHONE_INCORRECT;
					RestException ex = new RestException(code.getError(), code);
					throw ex;
				}
				
				
			
			
				String nameReceveur=declarationDto.getNameReceveur();
				String lastNameReceveur=declarationDto.getLastNameReceveur();
				String phoneReceveur=declarationDto.getPhoneReceveur();
				  
				  if(nameReceveur== ""){
						RestExceptionCode code = RestExceptionCode.NAME_EMPTY;
						RestException ex = new RestException(code.getError(), code);
						throw ex;
					}
					
					if(nameReceveur==null){
						RestExceptionCode code = RestExceptionCode.NAME_NOT_FOUND;
						RestException ex = new RestException(code.getError(), code);
						throw ex;
					}
					if(lastNameReceveur== ""){
						RestExceptionCode code = RestExceptionCode.LASTNAME_EMPTY;
						RestException ex = new RestException(code.getError(), code);
						throw ex;
					}
					
					if(lastNameReceveur==null){
						RestExceptionCode code = RestExceptionCode.LASTNAME_NOT_FOUND;
						RestException ex = new RestException(code.getError(), code);
						throw ex;
					}
					if(!(phoneReceveur).matches(regExpPhone)){
						RestExceptionCode code = RestExceptionCode.PHONE_INCORRECT;
						RestException ex = new RestException(code.getError(), code);
						throw ex;
					}
					
					
				
				
				String nameLine=declarationDto.getNameLine();
				 if(nameLine== ""){
						RestExceptionCode code = RestExceptionCode.NAME_EMPTY;
						RestException ex = new RestException(code.getError(), code);
						throw ex;
					}
					
					if(nameLine==null){
						RestExceptionCode code = RestExceptionCode.NAME_NOT_FOUND;
						RestException ex = new RestException(code.getError(), code);
						throw ex;
					}
					
				
				
				String nameDistrict=declarationDto.getNameDistrict();
				 if(nameDistrict== ""){
						RestExceptionCode code = RestExceptionCode.NAME_EMPTY;
						RestException ex = new RestException(code.getError(), code);
						throw ex;
					}
					
					if(nameDistrict==null){
						RestExceptionCode code = RestExceptionCode.NAME_NOT_FOUND;
						RestException ex = new RestException(code.getError(), code);
						throw ex;
					}
					
				
				
				 String descriptionDegat=declarationDto.getDescriptionDegat();
				 if(descriptionDegat== ""){
						RestExceptionCode code = RestExceptionCode.DESCRIPTION_EMPTY;
						RestException ex = new RestException(code.getError(), code);
						throw ex;
					}
					
					if(descriptionDegat==null){
						RestExceptionCode code = RestExceptionCode.DESCRIPTION_NOT_FOUND;
						RestException ex = new RestException(code.getError(), code);
						throw ex;
					}
					
				
		 
		 
		  String dateRecord =declarationDto.getDateRecord();
		 String timeRecord =declarationDto.getTimeRecord();
			
			  
		 declarationAcc.setDateSaisi(dateSaisi );
		 declarationAcc.setTimeSaisi(timeSaisi );
		 declarationAcc.setNameAgent(nameAgent);
		 declarationAcc.setLastNameAgent(lastNameAgent);
		 declarationAcc.setNatureInfo(declarationDto.getNatureInfo());
			declarationAcc.setPhoneInfo(phoneInfo);
			declarationAcc.setNameInfo(nameInfo);
			declarationAcc.setLastNameInfo(lastNameInfo);
			declarationAcc.setNameChauffeur(nameChauffeur);
			declarationAcc.setLastNameChauffeur(lastNameChauffeur);
			declarationAcc.setPhoneChauffeur(phoneChauffeur);
			declarationAcc.setNameReceveur(nameReceveur);
			declarationAcc.setLastNameReceveur(lastNameReceveur);
			declarationAcc.setPhoneReceveur(phoneReceveur);
			declarationAcc.setLocalisation(declarationDto.getLocalisation());
			declarationAcc.setTimeAccident(timeAccident );
			declarationAcc.setDateAccident(dateAccident );
			declarationAcc.setNumTransport(declarationDto.getNumTransport());
			declarationAcc.setNameLine(nameLine);
			declarationAcc.setNameDistrict(declarationDto.getNameDistrict());
			declarationAcc.setDescription(descriptionAccident);
			declarationAcc.setTypeAccident(declarationDto.getTypeAccident()); 
			declarationAcc.setSubTypeAccident(declarationDto.getSubTypeAccident());
			declarationAcc.setDescriptionDegat(declarationDto.getDescriptionDegat());
			  
		   declarationAcc.setDateRecord(dateRecord);
		   declarationAcc.setTimeRecord(timeRecord);
		   declarationAcc.setAccidenttt(accident);
		   declarationAcc.setEmplacementt(emplacement);
		   declarationAcc.setAccidentType(accidentType);
		   declarationAcc.setAccidentSubType(accidentSubType);
		   declarationAcc.setAgentPcr(agentPcr);
		   declarationAcc.setSourceInfo(sourceInfo);
		   declarationAcc.setChauffeur(chauffeur);
		   declarationAcc.setReceveur(receveur);
		   declarationAcc.setTransport(transport);
		   declarationAcc.setLine(line);
		   declarationAcc.setDepot(depot);
		   declarationAcc.setDegat(degat);
		   declarationAcc.setRecord(record);
		   System.out.println("ajout declaration");
		   declarationAccRepository.save(declarationAcc);
		return true;
	}
	
	@Override
	public Boolean updateDeclaration(Long id, DeclarationAccidentDto declarationDto) {
		DeclarationAcc  declarationAcc = declarationAccRepository.findById(id).orElse(null);
		Accident accident =accidentRepository.findById(declarationDto.getIdAccident()).orElse(null);
		Emplacement emplacement =emplacementRepository.findById(declarationDto.getIdEmplacement()).orElse(null);
		 AccidentType accidentType =accidentTypeRepository.findById(declarationDto.getIdAccidenttype()).orElse(null);
		 AccidentSubType accidentSubType =accidentSubTypeRepository.findById(declarationDto.getIdAccidentsubtype()).orElse(null);
		 AgentPcr agentPcr = agentRepository.findById(declarationDto.getIdAgent()).orElse(null);
		SourceInfo sourceInfo =sourceInfoRepository.findById(declarationDto.getIdSourceInfo()).orElse(null);
		Chauffeur chauffeur =chauffeurRepository.findById(declarationDto.getIdChauffeur()).orElse(null);
		Receveur receveur =receveurRepository.findById(declarationDto.getIdReceveur()).orElse(null);
		 Transport transport =transportRepository.findById(declarationDto.getIdTransport()).orElse(null);
		Line line =lineRepository.findById(declarationDto.getIdLine()).orElse(null);
		Depot depot =depotRepository.findById(declarationDto.getIdDepot()).orElse(null);
		Degat degat =degatRepository.findById(declarationDto.getIdDegat()).orElse(null);
	      Record record =recordRepository.findById(declarationDto.getIdRecord()).orElse(null);
		 String dateSaisi=declarationDto.getDateSaisi();
		 String dateAccident=declarationDto.getDateAccident();
		 String timeSaisi=declarationDto.getTimeSaisi();
		 String timeAccident=declarationDto.getTimeAccident();
		String descriptionAccident=declarationDto.getDescription();
		if(descriptionAccident== ""){
			RestExceptionCode code = RestExceptionCode.DESCRIPTION_EMPTY;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
		}
		
		if(descriptionAccident==null){
			RestExceptionCode code = RestExceptionCode.DESCRIPTION_NOT_FOUND;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
		}
		
		
		
		 
		
		
		String nameAgent=declarationDto.getNameAgent();
		String lastNameAgent=declarationDto.getLastNameAgent();
		  
		  if(nameAgent== ""){
				RestExceptionCode code = RestExceptionCode.NAME_EMPTY;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			
			if(nameAgent==null){
				RestExceptionCode code = RestExceptionCode.NAME_NOT_FOUND;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			if(lastNameAgent== ""){
				RestExceptionCode code = RestExceptionCode.LASTNAME_EMPTY;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			
			if(lastNameAgent==null){
				RestExceptionCode code = RestExceptionCode.LASTNAME_NOT_FOUND;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			
			
			
		 
		  String nameInfo=declarationDto.getNameInfo();
			String lastNameInfo=declarationDto.getLastNameInfo();
			 String phoneInfo=declarationDto.getPhoneInfo();
			 String regExpPhone ="^\\d{8}$";	
			if(nameInfo== ""){
				RestExceptionCode code = RestExceptionCode.NAME_EMPTY;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			
			if(nameInfo==null){
				RestExceptionCode code = RestExceptionCode.NAME_NOT_FOUND;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			if(lastNameInfo== ""){
				RestExceptionCode code = RestExceptionCode.LASTNAME_EMPTY;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			
			if(lastNameInfo==null){
				RestExceptionCode code = RestExceptionCode.LASTNAME_NOT_FOUND;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			if(!(phoneInfo).matches(regExpPhone)){
				RestExceptionCode code = RestExceptionCode.PHONE_INCORRECT;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			
		 
		  
		 
			String nameChauffeur=declarationDto.getNameChauffeur();
			String lastNameChauffeur=declarationDto.getLastNameChauffeur();
			String phoneChauffeur=declarationDto.getPhoneChauffeur();
			  
			  if(nameChauffeur== ""){
					RestExceptionCode code = RestExceptionCode.NAME_EMPTY;
					RestException ex = new RestException(code.getError(), code);
					throw ex;
				}
				
				if(nameChauffeur==null){
					RestExceptionCode code = RestExceptionCode.NAME_NOT_FOUND;
					RestException ex = new RestException(code.getError(), code);
					throw ex;
				}
				if(lastNameChauffeur== ""){
					RestExceptionCode code = RestExceptionCode.LASTNAME_EMPTY;
					RestException ex = new RestException(code.getError(), code);
					throw ex;
				}
				
				if(lastNameChauffeur==null){
					RestExceptionCode code = RestExceptionCode.LASTNAME_NOT_FOUND;
					RestException ex = new RestException(code.getError(), code);
					throw ex;
				}
				if(!(phoneChauffeur).matches(regExpPhone)){
					RestExceptionCode code = RestExceptionCode.PHONE_INCORRECT;
					RestException ex = new RestException(code.getError(), code);
					throw ex;
				}
				
				
			
			
				String nameReceveur=declarationDto.getNameReceveur();
				String lastNameReceveur=declarationDto.getLastNameReceveur();
				String phoneReceveur=declarationDto.getPhoneReceveur();
				  
				  if(nameReceveur== ""){
						RestExceptionCode code = RestExceptionCode.NAME_EMPTY;
						RestException ex = new RestException(code.getError(), code);
						throw ex;
					}
					
					if(nameReceveur==null){
						RestExceptionCode code = RestExceptionCode.NAME_NOT_FOUND;
						RestException ex = new RestException(code.getError(), code);
						throw ex;
					}
					if(lastNameReceveur== ""){
						RestExceptionCode code = RestExceptionCode.LASTNAME_EMPTY;
						RestException ex = new RestException(code.getError(), code);
						throw ex;
					}
					
					if(lastNameReceveur==null){
						RestExceptionCode code = RestExceptionCode.LASTNAME_NOT_FOUND;
						RestException ex = new RestException(code.getError(), code);
						throw ex;
					}
					if(!(phoneReceveur).matches(regExpPhone)){
						RestExceptionCode code = RestExceptionCode.PHONE_INCORRECT;
						RestException ex = new RestException(code.getError(), code);
						throw ex;
					}
					
					
				
				
				String nameLine=declarationDto.getNameLine();
				 if(nameLine== ""){
						RestExceptionCode code = RestExceptionCode.NAME_EMPTY;
						RestException ex = new RestException(code.getError(), code);
						throw ex;
					}
					
					if(nameLine==null){
						RestExceptionCode code = RestExceptionCode.NAME_NOT_FOUND;
						RestException ex = new RestException(code.getError(), code);
						throw ex;
					}
					
				
				
				String nameDistrict=declarationDto.getNameDistrict();
				 if(nameDistrict== ""){
						RestExceptionCode code = RestExceptionCode.NAME_EMPTY;
						RestException ex = new RestException(code.getError(), code);
						throw ex;
					}
					
					if(nameDistrict==null){
						RestExceptionCode code = RestExceptionCode.NAME_NOT_FOUND;
						RestException ex = new RestException(code.getError(), code);
						throw ex;
					}
					
				
				
				 String descriptionDegat=declarationDto.getDescriptionDegat();
				 if(descriptionDegat== ""){
						RestExceptionCode code = RestExceptionCode.DESCRIPTION_EMPTY;
						RestException ex = new RestException(code.getError(), code);
						throw ex;
					}
					
					if(descriptionDegat==null){
						RestExceptionCode code = RestExceptionCode.DESCRIPTION_NOT_FOUND;
						RestException ex = new RestException(code.getError(), code);
						throw ex;
					}
					
				
		 
		 
		  String dateRecord =declarationDto.getDateRecord();
		 String timeRecord =declarationDto.getTimeRecord();
			
			  
		 declarationAcc.setDateSaisi(dateSaisi );
		 declarationAcc.setTimeSaisi(timeSaisi );
		 declarationAcc.setNameAgent(nameAgent);
		 declarationAcc.setLastNameAgent(lastNameAgent);
		 declarationAcc.setNatureInfo(declarationDto.getNatureInfo());
			declarationAcc.setPhoneInfo(phoneInfo);
			declarationAcc.setNameInfo(nameInfo);
			declarationAcc.setLastNameInfo(lastNameInfo);
			declarationAcc.setNameChauffeur(nameChauffeur);
			declarationAcc.setLastNameChauffeur(lastNameChauffeur);
			declarationAcc.setPhoneChauffeur(phoneChauffeur);
			declarationAcc.setNameReceveur(nameReceveur);
			declarationAcc.setLastNameReceveur(lastNameReceveur);
			declarationAcc.setPhoneReceveur(phoneReceveur);
			declarationAcc.setLocalisation(declarationDto.getLocalisation());
			declarationAcc.setTimeAccident(timeAccident );
			declarationAcc.setDateAccident(dateAccident );
			declarationAcc.setNumTransport(declarationDto.getNumTransport());
			declarationAcc.setNameLine(nameLine);
			declarationAcc.setNameDistrict(declarationDto.getNameDistrict());
			declarationAcc.setDescription(descriptionAccident);
			declarationAcc.setTypeAccident(declarationDto.getTypeAccident());
			declarationAcc.setSubTypeAccident(declarationDto.getSubTypeAccident());
			declarationAcc.setDescriptionDegat(declarationDto.getDescriptionDegat());			  
		   declarationAcc.setDateRecord(dateRecord);
		   declarationAcc.setTimeRecord(timeRecord);
		   declarationAcc.setAccidenttt(accident);
		   declarationAcc.setEmplacementt(emplacement);
		   declarationAcc.setAccidentType(accidentType);
		   declarationAcc.setAccidentSubType(accidentSubType);
		   declarationAcc.setAgentPcr(agentPcr);
		   declarationAcc.setSourceInfo(sourceInfo);
		   declarationAcc.setChauffeur(chauffeur);
		   declarationAcc.setReceveur(receveur);
		   declarationAcc.setTransport(transport);
		   declarationAcc.setLine(line);
		   declarationAcc.setDepot(depot);
		   declarationAcc.setDegat(degat);
		   declarationAcc.setRecord(record);
		   System.out.println("ajout declaration");
		   declarationAccRepository.save(declarationAcc);
		return true;
		
	}
	@Override
	public List<DeclarationAcc> fetchListDeclaration() {
		return declarationAccRepository.findAll();
	}
	@Override
	public void deleteById(Long id) {
		if(!declarationAccRepository.existsById(id)) {
			RestExceptionCode code = RestExceptionCode.OBJECT_NOT_FOUND;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
        }
		declarationAccRepository.findById(id)
        .map(declarationAcc -> {
        	declarationAccRepository.delete(declarationAcc);
            return true;
        });

	}
	@Override
	public Optional<DeclarationAcc> findById(Long id) {
		// TODO Auto-generated method stub
		return declarationAccRepository.findById(id);
	}
	  
}
