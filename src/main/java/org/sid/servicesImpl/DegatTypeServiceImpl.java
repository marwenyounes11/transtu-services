package org.sid.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.sid.dao.DegatTypeRepository;
import org.sid.dto.DegatTypeDto;
import org.sid.entities.DegatType;
import org.sid.exception.RestException;
import org.sid.exception.RestExceptionCode;
import org.sid.services.DegatTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
@Service
public class DegatTypeServiceImpl implements DegatTypeService{
	@Autowired(required = true)
	DegatTypeRepository degattypeRepository;
	@Override
	public DegatType saveDegatType(DegatTypeDto d ){
		
		DegatType degattype = new DegatType();
			
		degattype.setLabel(d.getLabel());
		degattype.setAlias(d.getAlias());
			return degattypeRepository.save(degattype);
		}
	@Override
	public List<DegatType> fetchListDegatType() {
		// TODO Auto-generated method stub
		return degattypeRepository.findAll();
	}
	@Override
	public Optional<DegatType> findById(Long id) {
		// TODO Auto-generated method stub
		return degattypeRepository.findById(id);
	}
	@Override
	public Page<DegatType> chercherDegatType(String string, PageRequest of) {
		// TODO Auto-generated method stub
		
		return degattypeRepository.chercherDegatType(string, of);
	}
	@Override
	public void deleteById(Long id) {
		if(!degattypeRepository.existsById(id)) {
			RestExceptionCode code = RestExceptionCode.OBJECT_NOT_FOUND;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
        }
		degattypeRepository.findById(id)
        .map(degattype -> {
        	degattypeRepository.delete(degattype);
            return true;
        });

	}
	
	@Override
	public DegatType updateDegatType(Long id,DegatTypeDto d) {
		DegatType degattype = degattypeRepository.findById(id).orElse(null);
		
			
		degattype.setLabel(d.getLabel());
		degattype.setAlias(d.getAlias());
			return degattypeRepository.save(degattype);
	}
}
