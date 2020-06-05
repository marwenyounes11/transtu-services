package org.sid.servicesImpl;


import java.util.List;
import java.util.Optional;

import org.sid.dao.AccidentRepository;
import org.sid.dao.AmbulancierRepository;
import org.sid.dao.DeclarationResRepository;
import org.sid.dao.SecuriteRepository;
import org.sid.dao.SourceInfoRepository;
import org.sid.dao.ResponsableRepository;
import org.sid.dto.DeclarationResponsableDto;
import org.sid.entities.Accident;
import org.sid.entities.Ambulancier;
import org.sid.entities.DeclarationRes;
import org.sid.entities.Securite;
import org.sid.entities.SourceInfo;
import org.sid.entities.Responsable;
import org.sid.exception.RestException;
import org.sid.exception.RestExceptionCode;
import org.sid.services.DeclarationResponsableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class DeclarationResponsableServiceImpl implements DeclarationResponsableService{
	@Autowired 
	  private DeclarationResRepository  declarationResRepository;
	@Autowired 
	  private AmbulancierRepository  ambulancierRepository;
	@Autowired 
	  private SecuriteRepository  securiteRepository;
	@Autowired 
	  private ResponsableRepository  responsableRepository;
	@Autowired 
	  private AccidentRepository  accidentRepository;
	@Autowired
	private SourceInfoRepository sourceInfoRepository;
	 Accident  accident;
	 Ambulancier ambulancier;
	 Securite organeSecurite;
	 Responsable responsable;
	 
	 
	@Override
	public Boolean saveDeclarationResponsable(DeclarationResponsableDto d) {
		DeclarationRes declarationRes = new DeclarationRes();
		String descriptionAccident=d.getDescription();
		SourceInfo sourceInfo = sourceInfoRepository.findById(d.getIdSourceInfo()).orElse(null);
		Accident accident = accidentRepository.findById(d.getIdAccident()).orElse(null);
		Ambulancier ambulancier = ambulancierRepository.findById(d.getIdAmbulancier()).orElse(null);
		Securite securite = securiteRepository.findById(d.getIdSecurite()).orElse(null);
		Responsable responsable = responsableRepository.findById(d.getIdResponsable()).orElse(null);
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
		
		
		  
		  String nameResponsable=d.getNameResponsable();
			String lastNameResponsable=d.getLastNameResponsable();
			 String phoneResponsable=d.getPhoneResponsable();
			 String regExpPhone ="^\\d{8}$";	
			 if(nameResponsable== ""){
					RestExceptionCode code = RestExceptionCode.NAME_EMPTY;
					RestException ex = new RestException(code.getError(), code);
					throw ex;
				}
				
				if(nameResponsable==null){
					RestExceptionCode code = RestExceptionCode.NAME_NOT_FOUND;
					RestException ex = new RestException(code.getError(), code);
					throw ex;
				}
				if(lastNameResponsable== ""){
					RestExceptionCode code = RestExceptionCode.LASTNAME_EMPTY;
					RestException ex = new RestException(code.getError(), code);
					throw ex;
				}
				
				if(lastNameResponsable==null){
					RestExceptionCode code = RestExceptionCode.LASTNAME_NOT_FOUND;
					RestException ex = new RestException(code.getError(), code);
					throw ex;
				}
				if(!(phoneResponsable).matches(regExpPhone)){
					RestExceptionCode code = RestExceptionCode.PHONE_INCORRECT;
					RestException ex = new RestException(code.getError(), code);
					throw ex;
				}
				
				  
				 
				
				  
				  String nameAmbulancier=d.getNameAmbulancier();
					String lastNameAmbulancier=d.getLastNameAmbulancier();
					String phoneAmbulancier=d.getPhoneAmbulancier();
				  if(nameAmbulancier== ""){
						RestExceptionCode code = RestExceptionCode.NAME_EMPTY;
						RestException ex = new RestException(code.getError(), code);
						throw ex;
					}
					
					if(nameAmbulancier==null){
						RestExceptionCode code = RestExceptionCode.NAME_NOT_FOUND;
						RestException ex = new RestException(code.getError(), code);
						throw ex;
					}
					if(lastNameAmbulancier== ""){
						RestExceptionCode code = RestExceptionCode.LASTNAME_EMPTY;
						RestException ex = new RestException(code.getError(), code);
						throw ex;
					}
					
					if(lastNameAmbulancier==null){
						RestExceptionCode code = RestExceptionCode.LASTNAME_NOT_FOUND;
						RestException ex = new RestException(code.getError(), code);
						throw ex;
					}
					if(!(phoneAmbulancier).matches(regExpPhone)){
						RestExceptionCode code = RestExceptionCode.PHONE_INCORRECT;
						RestException ex = new RestException(code.getError(), code);
						throw ex;
					}
					declarationRes.setDateInfo(d.getDateInfo());
					declarationRes.setTimeInfo(d.getTimeInfo());
					declarationRes.setDescription(descriptionAccident);
					declarationRes.setNameResponsable(nameResponsable);
					declarationRes.setLastNameResponsable(lastNameResponsable);
					declarationRes.setNatureResponsable(d.getNatureResponsable());
					declarationRes.setPhoneResponsable(phoneResponsable);
					declarationRes.setTypeSecurite(d.getTypeSecurite());
					declarationRes.setNameAmbulancier(nameAmbulancier);
					declarationRes.setLastNameAmbulancier(lastNameAmbulancier);
					declarationRes.setPhoneAmbulancier(phoneAmbulancier);
					declarationRes.setAccident(accident);
					declarationRes.setSourceInfo(sourceInfo);
					declarationRes.setAmbulancier(ambulancier);
					declarationRes.setResponsable(responsable);
					declarationRes.setSecurite(securite);
					declarationResRepository.save(declarationRes);
		return true;
	}

	@Override
	public Boolean updateDeclarationResponsable(Long id, DeclarationResponsableDto d) {
		DeclarationRes declarationRes = declarationResRepository.findById(id).orElse(null);
		String descriptionAccident=d.getDescription();
		SourceInfo sourceInfo = sourceInfoRepository.findById(d.getIdSourceInfo()).orElse(null);
		Accident accident = accidentRepository.findById(d.getIdAccident()).orElse(null);
		Ambulancier ambulancier = ambulancierRepository.findById(d.getIdAmbulancier()).orElse(null);
		Securite securite = securiteRepository.findById(d.getIdSecurite()).orElse(null);
		Responsable responsable = responsableRepository.findById(d.getIdResponsable()).orElse(null);
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
		
		
		  
		  String nameResponsable=d.getNameResponsable();
			String lastNameResponsable=d.getLastNameResponsable();
			 String phoneResponsable=d.getPhoneResponsable();
			 String regExpPhone ="^\\d{8}$";	
			 if(nameResponsable== ""){
					RestExceptionCode code = RestExceptionCode.NAME_EMPTY;
					RestException ex = new RestException(code.getError(), code);
					throw ex;
				}
				
				if(nameResponsable==null){
					RestExceptionCode code = RestExceptionCode.NAME_NOT_FOUND;
					RestException ex = new RestException(code.getError(), code);
					throw ex;
				}
				if(lastNameResponsable== ""){
					RestExceptionCode code = RestExceptionCode.LASTNAME_EMPTY;
					RestException ex = new RestException(code.getError(), code);
					throw ex;
				}
				
				if(lastNameResponsable==null){
					RestExceptionCode code = RestExceptionCode.LASTNAME_NOT_FOUND;
					RestException ex = new RestException(code.getError(), code);
					throw ex;
				}
				if(!(phoneResponsable).matches(regExpPhone)){
					RestExceptionCode code = RestExceptionCode.PHONE_INCORRECT;
					RestException ex = new RestException(code.getError(), code);
					throw ex;
				}
				
				  
				 
				
				  
				  String nameAmbulancier=d.getNameAmbulancier();
					String lastNameAmbulancier=d.getLastNameAmbulancier();
					String phoneAmbulancier=d.getPhoneAmbulancier();
				  if(nameAmbulancier== ""){
						RestExceptionCode code = RestExceptionCode.NAME_EMPTY;
						RestException ex = new RestException(code.getError(), code);
						throw ex;
					}
					
					if(nameAmbulancier==null){
						RestExceptionCode code = RestExceptionCode.NAME_NOT_FOUND;
						RestException ex = new RestException(code.getError(), code);
						throw ex;
					}
					if(lastNameAmbulancier== ""){
						RestExceptionCode code = RestExceptionCode.LASTNAME_EMPTY;
						RestException ex = new RestException(code.getError(), code);
						throw ex;
					}
					
					if(lastNameAmbulancier==null){
						RestExceptionCode code = RestExceptionCode.LASTNAME_NOT_FOUND;
						RestException ex = new RestException(code.getError(), code);
						throw ex;
					}
					if(!(phoneAmbulancier).matches(regExpPhone)){
						RestExceptionCode code = RestExceptionCode.PHONE_INCORRECT;
						RestException ex = new RestException(code.getError(), code);
						throw ex;
					}
					declarationRes.setDateInfo(d.getDateInfo());
					declarationRes.setTimeInfo(d.getTimeInfo());
					declarationRes.setDescription(descriptionAccident);
					declarationRes.setNameResponsable(nameResponsable);
					declarationRes.setLastNameResponsable(lastNameResponsable);
					declarationRes.setNatureResponsable(d.getNatureResponsable());
					declarationRes.setPhoneResponsable(phoneResponsable);
					declarationRes.setTypeSecurite(d.getTypeSecurite());
					declarationRes.setNameAmbulancier(nameAmbulancier);
					declarationRes.setLastNameAmbulancier(lastNameAmbulancier);
					declarationRes.setPhoneAmbulancier(phoneAmbulancier);
					declarationRes.setAccident(accident);
					declarationRes.setSourceInfo(sourceInfo);
					declarationRes.setAmbulancier(ambulancier);
					declarationRes.setResponsable(responsable);
					declarationRes.setSecurite(securite);
					declarationResRepository.save(declarationRes);
		return true;
	}

	@Override
	public List<DeclarationRes> fetchListDeclarationResponsable() {
		
		return declarationResRepository.findAll();
	}
	
	@Override
	public void deleteById(Long id) {
		if(!declarationResRepository.existsById(id)) {
			RestExceptionCode code = RestExceptionCode.OBJECT_NOT_FOUND;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
        }
		declarationResRepository.findById(id)
        .map(declarationRes -> {
        	declarationResRepository.delete(declarationRes);
            return true;
        });

	}
	@Override
	public Optional<DeclarationRes> findById(Long id) {
		// TODO Auto-generated method stub
		return declarationResRepository.findById(id);
	}

}
