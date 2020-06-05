package org.sid.servicesImpl;
import java.util.List;

import java.util.Optional;

import org.sid.dao.DegatRepository;
import org.sid.dto.DegatDto;
import org.sid.entities.Chauffeur;
import org.sid.entities.Degat;
import org.sid.exception.RestException;
import org.sid.exception.RestExceptionCode;
import org.sid.services.DegatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
@Service
public class DegatServiceImpl implements DegatService{
	@Autowired(required = true)
	DegatRepository degatRepository;
	@Override
	public Degat saveDegat(DegatDto d ){
		if(d.getDescriptionDegat()== ""){
			RestExceptionCode code = RestExceptionCode.DESCRIPTION_EMPTY;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
		}	
		Degat degat = new Degat();
			
		degat.setDescriptionDegat(d.getDescriptionDegat());
		degat.setEstimationPrixDegat(d.getEstimationPrixDegat());
			return degatRepository.save(degat);
		}
	@Override
	public List<Degat> fetchListDegat() {
		// TODO Auto-generated method stub
		return degatRepository.findAll();
	}
	@Override
	public Optional<Degat> findById(Long id) {
		// TODO Auto-generated method stub
		return degatRepository.findById(id);
	}
	@Override
	public Page<Degat> chercherDegat(String string, PageRequest of) {
		// TODO Auto-generated method stub
		
		return degatRepository.chercherDegat(string, of);
	}
	@Override
	public void deleteById(Long id) {
		if(!degatRepository.existsById(id)) {
			RestExceptionCode code = RestExceptionCode.OBJECT_NOT_FOUND;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
        }
		degatRepository.findById(id)
        .map(degat -> {
        	degatRepository.delete(degat);
            return true;
        });

	}
	
	@Override
	public Degat updateDegat(Long id,DegatDto d) {
		Degat degat = degatRepository.findById(id).orElse(null);
		if(d.getDescriptionDegat()== ""){
			RestExceptionCode code = RestExceptionCode.DESCRIPTION_EMPTY;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
		}	
			
		degat.setDescriptionDegat(d.getDescriptionDegat());
		degat.setEstimationPrixDegat(d.getEstimationPrixDegat());
			return degatRepository.save(degat);
	}

}
