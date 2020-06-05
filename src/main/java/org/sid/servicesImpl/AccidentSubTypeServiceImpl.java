package org.sid.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.sid.dao.AccidentTypeRepository;
import org.sid.dao.AccidentSubTypeRepository;
import org.sid.dto.AccidentSubTypeDto;
import org.sid.entities.AccidentType;
import org.sid.entities.AccidentSubType;
import org.sid.exception.RestException;
import org.sid.exception.RestExceptionCode;
import org.sid.services.AccidentSubTypeService;
import org.sid.services.AccidentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class AccidentSubTypeServiceImpl implements AccidentSubTypeService{
	@Autowired(required = true)
	AccidentSubTypeRepository accidentSubTypeRepository;
	@Autowired(required = true)
	AccidentTypeRepository accidentTypeRepository;
	@Override
	public AccidentSubType saveAccidentSubType(AccidentSubTypeDto d ){
		AccidentType accidenttype = accidentTypeRepository.findById(d.getIdAccidentType()).orElse(null);	
		AccidentSubType accidentSubType = new AccidentSubType();
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
			accidentSubType.setAlias(d.getAlias());
			accidentSubType.setLabel(d.getLabel());
			accidentSubType.setAccidenttype(accidenttype);
			return accidentSubTypeRepository.save(accidentSubType);
		}
	@Override
	public List<AccidentSubType> fetchListAccidentSubType() {
		// TODO Auto-generated method stub
		return accidentSubTypeRepository.findAll();
	}
	@Override
	public Optional<AccidentSubType> findById(Long id) {
		// TODO Auto-generated method stub
		return accidentSubTypeRepository.findById(id);
	}
	@Override
	public Page<AccidentSubType> chercherAccidentSubType(String string, PageRequest of) {
		// TODO Auto-generated method stub
		
		return accidentSubTypeRepository.chercherAccidentSubType(string, of);
	}
	@Override
	public void deleteById(Long id) {
		if(!accidentSubTypeRepository.existsById(id)) {
			RestExceptionCode code = RestExceptionCode.OBJECT_NOT_FOUND;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
        }
		accidentSubTypeRepository.findById(id)
        .map(accidentsubtype -> {
        	accidentSubTypeRepository.delete(accidentsubtype);
            return true;
        });

	}
	
	@Override
	public AccidentSubType updateAccidentSubType(Long id, AccidentSubTypeDto d) {
		AccidentSubType accidentSubType = accidentSubTypeRepository.findById(id).orElse(null);
		AccidentType accidenttype = accidentTypeRepository.findById(d.getIdAccidentType()).orElse(null);	
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
		accidentSubType.setAlias(d.getAlias());
		accidentSubType.setLabel(d.getLabel());
		accidentSubType.setAccidenttype(accidenttype);		return accidentSubTypeRepository.save(accidentSubType);
		
	}
}
