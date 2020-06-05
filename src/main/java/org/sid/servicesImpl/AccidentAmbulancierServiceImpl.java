package org.sid.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.sid.dao.AccidentAmbulancierRepository;
import org.sid.dao.AccidentRepository;
import org.sid.dao.AmbulancierRepository;
import org.sid.dto.AccidentAmbulancierDto;
import org.sid.entities.Accident;
import org.sid.entities.AccidentAmbulancier;
import org.sid.entities.Ambulancier;
import org.sid.exception.RestException;
import org.sid.exception.RestExceptionCode;
import org.sid.services.AccidentAmbulancierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccidentAmbulancierServiceImpl implements AccidentAmbulancierService{
	@Autowired(required = true)
	AccidentAmbulancierRepository accidentAmbulancierRepository;
	@Autowired(required = true)
	AccidentRepository accidentRepository;
	@Autowired(required = true)
	AmbulancierRepository ambulancierRepository;
	@Override
	public AccidentAmbulancier saveAccidentAmbulancier(AccidentAmbulancierDto a) {
		AccidentAmbulancier accidentAmbulancier = new AccidentAmbulancier();
		Accident accident = accidentRepository.findById(a.getIdAccident()).orElse(null);
		Ambulancier ambulancier = ambulancierRepository.findById(a.getIdAmbulancier()).orElse(null);
		accidentAmbulancier.setAccident(accident);
		accidentAmbulancier.setAmbulancier(ambulancier);
		return accidentAmbulancierRepository.save(accidentAmbulancier);
	}

	@Override
	public AccidentAmbulancier updateAccidentAmbulancier(Long id, AccidentAmbulancierDto l) {
		AccidentAmbulancier accidentAmbulancier = accidentAmbulancierRepository.findById(id).orElse(null);
		Accident accident = accidentRepository.findById(l.getIdAccident()).orElse(null);
		Ambulancier ambulancier = ambulancierRepository.findById(l.getIdAmbulancier()).orElse(null);
		accidentAmbulancier.setAccident(accident);
		accidentAmbulancier.setAmbulancier(ambulancier);
		return accidentAmbulancierRepository.save(accidentAmbulancier);
		
	}

	@Override
	public List<AccidentAmbulancier> fetchListAccidentAmbulancier() {
		// TODO Auto-generated method stub
		return accidentAmbulancierRepository.findAll();
	}

	@Override
	public Optional<AccidentAmbulancier> findById(Long id) {
		// TODO Auto-generated method stub
		return accidentAmbulancierRepository.findById(id);
	}

	

	@Override
	public void deleteById(Long id) {
		if(!accidentAmbulancierRepository.existsById(id)) {
			RestExceptionCode code = RestExceptionCode.OBJECT_NOT_FOUND;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
        }
		accidentAmbulancierRepository.findById(id)
        .map(accidentAmbulancier -> {
        	accidentAmbulancierRepository.delete(accidentAmbulancier);
            return true;
        });
		
	}

}
