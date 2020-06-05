package org.sid.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.sid.dao.AccidentRepository;
import org.sid.dao.AccidentSecuriteRepository;
import org.sid.dao.SecuriteRepository;
import org.sid.dto.AccidentSecuriteDto;
import org.sid.entities.Accident;
import org.sid.entities.AccidentResponsable;
import org.sid.entities.AccidentSecurite;
import org.sid.entities.Securite;
import org.sid.exception.RestException;
import org.sid.exception.RestExceptionCode;
import org.sid.services.AccidentSecuriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AccidentSecuriteServiceImpl implements AccidentSecuriteService{
	@Autowired(required = true)
	AccidentSecuriteRepository accidentSecuriteRepository;
	@Autowired(required = true)
	AccidentRepository accidentRepository;
	@Autowired(required = true)
	SecuriteRepository securiteRepository;
	@Override
	public AccidentSecurite saveAccidentSecurite(AccidentSecuriteDto a) {
		AccidentSecurite accidentSecurite = new AccidentSecurite();
		Accident accident = accidentRepository.findById(a.getIdAccident()).orElse(null);
		Securite securite = securiteRepository.findById(a.getIdSecurite()).orElse(null);
		accidentSecurite.setAccidentt(accident);
		accidentSecurite.setSecurite(securite);
		return accidentSecuriteRepository.save(accidentSecurite);
	}

	@Override
	public AccidentSecurite updateAccidentSecurite(Long id, AccidentSecuriteDto l) {
		AccidentSecurite accidentSecurite = accidentSecuriteRepository.findById(id).orElse(null);

		Accident accident = accidentRepository.findById(l.getIdAccident()).orElse(null);
		Securite securite = securiteRepository.findById(l.getIdSecurite()).orElse(null);
		accidentSecurite.setAccidentt(accident);
		accidentSecurite.setSecurite(securite);
		return accidentSecuriteRepository.save(accidentSecurite);
	}

	@Override
	public List<AccidentSecurite> fetchListAccidentSecurite() {
		return accidentSecuriteRepository.findAll();
	}

	@Override
	public Optional<AccidentSecurite> findById(Long id) {
		// TODO Auto-generated method stub
		return accidentSecuriteRepository.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		if(!accidentSecuriteRepository.existsById(id)) {
			RestExceptionCode code = RestExceptionCode.OBJECT_NOT_FOUND;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
        }
		accidentSecuriteRepository.findById(id)
        .map(accidentSecurite -> {
        	accidentSecuriteRepository.delete(accidentSecurite);
            return true;
        });
		
	}

}
