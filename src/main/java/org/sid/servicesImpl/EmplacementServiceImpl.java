package org.sid.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.sid.dao.EmplacementRepository;
import org.sid.dto.EmplacementDto;
import org.sid.entities.Depot;
import org.sid.entities.Emplacement;
import org.sid.exception.RestException;
import org.sid.exception.RestExceptionCode;
import org.sid.services.EmplacementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
@Service
public class EmplacementServiceImpl implements EmplacementService {
	@Autowired(required = true)
	EmplacementRepository emplacementRepository;
	@Override
	public Emplacement saveEmplacement(EmplacementDto e ){
			
		Emplacement emplacement = new Emplacement();
			if(e.getDelegation()== ""){
				RestExceptionCode code = RestExceptionCode.DELEGATION_EMPTY;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			
			if(e.getDelegation()==null){
				RestExceptionCode code = RestExceptionCode.DELEGATION_NOT_FOUND;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			if(e.getGouvernorat()== ""){
				RestExceptionCode code = RestExceptionCode.GOUVERNORAT_EMPTY;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			
			if(e.getGouvernorat()==null){
				RestExceptionCode code = RestExceptionCode.GOUVERNORAT_NOT_FOUND;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			
			emplacement.setDelegation(e.getDelegation());
			emplacement.setGouvernorat(e.getGouvernorat());
			return emplacementRepository.save(emplacement);
		}
	@Override
	public List<Emplacement> fetchListEmplacement() {
		// TODO Auto-generated method stub
		return emplacementRepository.findAll();
	}
	@Override
	public Optional<Emplacement> findById(Long id) {
		// TODO Auto-generated method stub
		return emplacementRepository.findById(id);
	}
	@Override
	public Page<Emplacement> chercherEmplacement(String string, PageRequest of) {
		// TODO Auto-generated method stub
		
		return emplacementRepository.chercherEmplacement(string, of);
	}
	@Override
	public void deleteById(Long id) {
		if(!emplacementRepository.existsById(id)) {
			RestExceptionCode code = RestExceptionCode.OBJECT_NOT_FOUND;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
        }
		emplacementRepository.findById(id)
        .map(emplacement -> {
        	emplacementRepository.delete(emplacement);
            return true;
        });

	}
	
	@Override
	public Emplacement updateEmplacement(Long id, EmplacementDto e) {
		Emplacement emplacement = emplacementRepository.findById(id).orElse(null);
		if(e.getDelegation()== ""){
			RestExceptionCode code = RestExceptionCode.DELEGATION_EMPTY;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
		}
		
		if(e.getDelegation()==null){
			RestExceptionCode code = RestExceptionCode.DELEGATION_NOT_FOUND;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
		}
		if(e.getGouvernorat()== ""){
			RestExceptionCode code = RestExceptionCode.GOUVERNORAT_EMPTY;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
		}
		
		if(e.getGouvernorat()==null){
			RestExceptionCode code = RestExceptionCode.GOUVERNORAT_NOT_FOUND;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
		}
		
		emplacement.setDelegation(e.getDelegation());
		emplacement.setGouvernorat(e.getGouvernorat());
		return emplacementRepository.save(emplacement);
	}
}
