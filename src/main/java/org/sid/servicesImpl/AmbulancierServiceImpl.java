package org.sid.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.sid.dao.AmbulancierRepository;
import org.sid.entities.Ambulancier;
import org.sid.exception.RestException;
import org.sid.exception.RestExceptionCode;
import org.sid.services.AmbulancierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AmbulancierServiceImpl implements AmbulancierService{

	@Autowired(required = true)
	AmbulancierRepository ambulancierRepository;
	@Override
	public Ambulancier saveAmbulancier(Ambulancier a ){
			
		Ambulancier ambulancier = new Ambulancier();
		 String nameAmbulancier=a.getNameAmbulancier();
			String lastNameAmbulancier=a.getLastNameAmbulancier();
			String phoneAmbulancier=a.getPhoneAmbulancier();
			 String regExpPhone ="^\\d{8}$";
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
			ambulancier.setNameAmbulancier(nameAmbulancier);
			  ambulancier.setLastNameAmbulancier(lastNameAmbulancier);
			  ambulancier.setPhoneAmbulancier(phoneAmbulancier);
				return  ambulancierRepository.save(ambulancier);
			
		}
	@Override
	public List<Ambulancier> fetchListAmbulancier() {
		// TODO Auto-generated method stub
		return ambulancierRepository.findAll();
	}
	@Override
	public Optional<Ambulancier> findById(Long id) {
		// TODO Auto-generated method stub
		return ambulancierRepository.findById(id);
	}
	
	@Override
	public void deleteById(Long id) {
		if(!ambulancierRepository.existsById(id)) {
			RestExceptionCode code = RestExceptionCode.OBJECT_NOT_FOUND;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
        }
		ambulancierRepository.findById(id)
        .map(ambulancier -> {
        	ambulancierRepository.delete(ambulancier);
            return true;
        });

	}
	
	@Override
	public Ambulancier updateAmbulancier(Long id,Ambulancier a) {
		String nameAmbulancier=a.getNameAmbulancier();
		String lastNameAmbulancier=a.getLastNameAmbulancier();
		String phoneAmbulancier=a.getPhoneAmbulancier();
		 String regExpPhone ="^\\d{8}$";
		if(id <= 0) {
			RestExceptionCode code = RestExceptionCode.INVALID_ID;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
		}
		
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
			Ambulancier ambulancier =ambulancierRepository.findById(id).orElse(null);;
			ambulancier.setNameAmbulancier(nameAmbulancier);
			ambulancier.setLastNameAmbulancier(lastNameAmbulancier);
			ambulancier.setPhoneAmbulancier(a.getPhoneAmbulancier());
			return  ambulancierRepository.save(ambulancier);
		
		
	}

}
