package org.sid.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.sid.dao.AccidentRepository;
import org.sid.dao.AccidentTypeRepository;
import org.sid.dto.AccidentTypeDto;
import org.sid.entities.Accident;
import org.sid.entities.AccidentType;
import org.sid.entities.SourceInfo;
import org.sid.exception.RestException;
import org.sid.exception.RestExceptionCode;
import org.sid.services.AccidentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class AccidentTypeServiceImpl implements AccidentTypeService{
	@Autowired(required = true)
	AccidentTypeRepository accidentTypeRepository;
	@Autowired(required = true)
	AccidentRepository accidentRepository;
	@Override
	public AccidentType saveAccidentType(AccidentTypeDto d ){
		Accident accident = accidentRepository.findById(d.getIdAccident()).orElse(null);	
		AccidentType accidentType = new AccidentType();
			if(d.getAlias()== ""){
				RestExceptionCode code = RestExceptionCode.ALIAS_EMPTY;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			
			if(d.getAlias()==null){
				RestExceptionCode code = RestExceptionCode.ALIAS_NOT_FOUND;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			if(d.getLabel()== ""){
				RestExceptionCode code = RestExceptionCode.LABEL_EMPTY;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			
			if(d.getLabel()==null){
				RestExceptionCode code = RestExceptionCode.LABEL_NOT_FOUND;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			accidentType.setAlias(d.getAlias());
			accidentType.setLabel(d.getLabel());
			accidentType.setAccident(accident);
			return accidentTypeRepository.save(accidentType);
		}
	@Override
	public List<AccidentType> fetchListAccidentType() {
		// TODO Auto-generated method stub
		return accidentTypeRepository.findAll();
	}
	@Override
	public Optional<AccidentType> findById(Long id) {
		// TODO Auto-generated method stub
		return accidentTypeRepository.findById(id);
	}
	@Override
	public Page<AccidentType> chercherAccidentType(String string, PageRequest of) {
		// TODO Auto-generated method stub
		
		return accidentTypeRepository.chercherAccidentType(string, of);
	}
	@Override
	public void deleteById(Long id) {
		if(!accidentTypeRepository.existsById(id)) {
			RestExceptionCode code = RestExceptionCode.OBJECT_NOT_FOUND;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
        }
		accidentTypeRepository.findById(id)
        .map(accidenttype -> {
        	accidentTypeRepository.delete(accidenttype);
            return true;
        });

	}
	
	@Override
	public AccidentType updateAccidentType(Long id, AccidentTypeDto d) {
		AccidentType accidentType = accidentTypeRepository.findById(id).orElse(null);
		Accident accident = accidentRepository.findById(d.getIdAccident()).orElse(null);
		if(d.getAlias()== ""){
			RestExceptionCode code = RestExceptionCode.ALIAS_EMPTY;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
		}
		
		if(d.getAlias()==null){
			RestExceptionCode code = RestExceptionCode.ALIAS_NOT_FOUND;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
		}
		if(d.getLabel()== ""){
			RestExceptionCode code = RestExceptionCode.LABEL_EMPTY;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
		}
		
		if(d.getLabel()==null){
			RestExceptionCode code = RestExceptionCode.LABEL_NOT_FOUND;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
		}
		accidentType.setAlias(d.getAlias());
		accidentType.setLabel(d.getLabel());
		accidentType.setAccident(accident);
		return accidentTypeRepository.save(accidentType);
		
	}
}
