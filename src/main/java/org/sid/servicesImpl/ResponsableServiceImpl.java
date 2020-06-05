package org.sid.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.sid.dao.ResponsableRepository;
import org.sid.entities.Responsable;
import org.sid.exception.RestException;
import org.sid.exception.RestExceptionCode;
import org.sid.services.ResponsableService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
@Service
public class ResponsableServiceImpl implements ResponsableService{
	@Autowired(required = true)
	ResponsableRepository responsableRepository;
	@Override
	public Responsable saveResponsable(Responsable r ){
			
		Responsable responsable = new Responsable();
		  String nameResponsable=r.getNameResponsable();
			String lastNameResponsable=r.getLastNameResponsable();
			 String phoneResponsable=r.getPhoneResponsable();
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
				responsable.setNameResponsable(nameResponsable);
				  responsable.setLastNameResponsable(lastNameResponsable);
				  responsable.setNatureResponsable(r.getNatureResponsable());
				  responsable.setPhoneResponsable(phoneResponsable);
				return  responsableRepository.save(responsable);
			
		}
	@Override
	public List<Responsable> fetchListResponsable() {
		// TODO Auto-generated method stub
		return responsableRepository.findAll();
	}
	@Override
	public Optional<Responsable> findById(Long id) {
		// TODO Auto-generated method stub
		return responsableRepository.findById(id);
	}
	
	@Override
	public void deleteById(Long id) {
		if(!responsableRepository.existsById(id)) {
			RestExceptionCode code = RestExceptionCode.OBJECT_NOT_FOUND;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
        }
		responsableRepository.findById(id)
        .map(responsable -> {
        	responsableRepository.delete(responsable);
            return true;
        });

	}
	
	@Override
	public Responsable updateResponsable(Long id,Responsable r) {
		String nameResponsable=r.getNameResponsable();
		String lastNameResponsable=r.getLastNameResponsable();
		String phoneResponsable=r.getPhoneResponsable();
		 String regExpPhone ="^\\d{8}$";
		if(id <= 0) {
			RestExceptionCode code = RestExceptionCode.INVALID_ID;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
		}
		
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
			Responsable responsable =responsableRepository.findById(id).orElse(null);;
			responsable.setNameResponsable(nameResponsable);
			  responsable.setLastNameResponsable(lastNameResponsable);
			  responsable.setNatureResponsable(r.getNatureResponsable());
			  responsable.setPhoneResponsable(r.getPhoneResponsable());
			return  responsableRepository.save(responsable);
		
		
	}
}
