package org.sid.servicesImpl;

import java.util.List;
import java.util.Optional;


import org.sid.dao.AccidentRepository;
import org.sid.dao.AccidentResponsableRepository;
import org.sid.dao.ResponsableRepository;
import org.sid.dto.AccidentResponsableDto;
import org.sid.entities.Accident;
import org.sid.entities.AccidentAmbulancier;
import org.sid.entities.AccidentResponsable;
import org.sid.entities.Responsable;
import org.sid.exception.RestException;
import org.sid.exception.RestExceptionCode;
import org.sid.services.AccidentResponsableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccidentResponsableServiceImpl implements AccidentResponsableService{
	@Autowired(required = true)
	AccidentResponsableRepository accidentResponsableRepository;
	@Autowired(required = true)
	AccidentRepository accidentRepository;
	@Autowired(required = true)
	ResponsableRepository responsableRepository;
	@Override
	public AccidentResponsable saveAccidentResponsable(AccidentResponsableDto a) {
		AccidentResponsable accidentResponsable = new AccidentResponsable();
		Accident accident = accidentRepository.findById(a.getIdAccident()).orElse(null);
		Responsable responsable = responsableRepository.findById(a.getIdResponsable()).orElse(null);
		accidentResponsable.setAccident(accident);
		accidentResponsable.setResponsable(responsable);
		return accidentResponsableRepository.save(accidentResponsable);
	}

	@Override
	public AccidentResponsable updateAccidentResponsable(Long id, AccidentResponsableDto l) {
		AccidentResponsable accidentResponsable = accidentResponsableRepository.findById(id).orElse(null);
		Accident accident = accidentRepository.findById(l.getIdAccident()).orElse(null);
		Responsable responsable = responsableRepository.findById(l.getIdResponsable()).orElse(null);
		accidentResponsable.setAccident(accident);
		accidentResponsable.setResponsable(responsable);
		return accidentResponsableRepository.save(accidentResponsable);
	}

	@Override
	public List<AccidentResponsable> fetchListAccidentResponsable() {
		// TODO Auto-generated method stub
		return accidentResponsableRepository.findAll();
	}

	@Override
	public Optional<AccidentResponsable> findById(Long id) {
		// TODO Auto-generated method stub
		return accidentResponsableRepository.findById(id);
	}

	

	@Override
	public void deleteById(Long id) {
		if(!accidentResponsableRepository.existsById(id)) {
			RestExceptionCode code = RestExceptionCode.OBJECT_NOT_FOUND;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
        }
		accidentResponsableRepository.findById(id)
        .map(accidentResponsable -> {
        	accidentResponsableRepository.delete(accidentResponsable);
            return true;
        });
		
	}

}
