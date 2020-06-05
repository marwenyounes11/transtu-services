package org.sid.servicesImpl;

import java.util.List;
import java.util.Optional;


import org.sid.dao.InterventionRepository;
import org.sid.dto.InterventionDto;
import org.sid.entities.Emplacement;
import org.sid.entities.Intervention;
import org.sid.exception.RestException;
import org.sid.exception.RestExceptionCode;
import org.sid.services.InterventionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
@Service

public class InterventionServiceImpl implements InterventionService{
	@Autowired(required = true)
	InterventionRepository interventionRepository;
	@Override
	public Intervention saveIntervention(InterventionDto e ){
			
		Intervention intervention = new Intervention();
			if(e.getAction()== ""){
				RestExceptionCode code = RestExceptionCode.ACTION_EMPTY;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			
			if(e.getAction()==null){
				RestExceptionCode code = RestExceptionCode.ACTION_NOT_FOUND;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			intervention.setAction(e.getAction());
			return interventionRepository.save(intervention);
		}
	@Override
	public List<Intervention> fetchListIntervention() {
		// TODO Auto-generated method stub
		return interventionRepository.findAll();
	}
	@Override
	public Optional<Intervention> findById(Long id) {
		// TODO Auto-generated method stub
		return interventionRepository.findById(id);
	}
	@Override
	public Page<Intervention> chercherIntervention(String string, PageRequest of) {
		// TODO Auto-generated method stub
		
		return interventionRepository.chercherIntervention(string, of);
	}
	@Override
	public void deleteById(Long id) {
		if(!interventionRepository.existsById(id)) {
			RestExceptionCode code = RestExceptionCode.OBJECT_NOT_FOUND;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
        }
		interventionRepository.findById(id)
        .map(intervention -> {
        	interventionRepository.delete(intervention);
            return true;
        });

	}
	
	@Override
	public Intervention updateIntervention(Long id, InterventionDto i) {
		Intervention intervention = interventionRepository.findById(id).orElse(null);
		if(i.getAction()== ""){
			RestExceptionCode code = RestExceptionCode.ACTION_EMPTY;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
		}
		
		if(i.getAction()==null){
			RestExceptionCode code = RestExceptionCode.ACTION_NOT_FOUND;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
		}
		intervention.setAction(i.getAction());
		return interventionRepository.save(intervention);
	}	

}
