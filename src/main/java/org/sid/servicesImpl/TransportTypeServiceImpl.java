package org.sid.servicesImpl;

import java.util.List;
import java.util.Optional;


import org.sid.dao.TransportTypeRepository;
import org.sid.dto.TransportTypeDto;
import org.sid.entities.TransportType;
import org.sid.exception.RestException;
import org.sid.exception.RestExceptionCode;
import org.sid.services.TransportTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class TransportTypeServiceImpl implements TransportTypeService{
	@Autowired(required = true)
	TransportTypeRepository transporttypeRepository;
	@Override
	public TransportType saveTransportType(TransportTypeDto t ){
			
		TransportType transporttype = new TransportType();
			
		transporttype.setAlias(t.getAlias());
		transporttype.setLabel(t.getLabel());
		
		
			return transporttypeRepository.save(transporttype);
		}
	@Override
	public List<TransportType> fetchListTransportType() {
		// TODO Auto-generated method stub
		return transporttypeRepository.findAll();
	}
	@Override
	public Optional<TransportType> findById(Long id) {
		// TODO Auto-generated method stub
		return transporttypeRepository.findById(id);
	}
	@Override
	public Page<TransportType> chercherTransportType(String string, PageRequest of) {
		// TODO Auto-generated method stub
		
		return transporttypeRepository.chercherTransportType(string, of);
	}
	@Override
	public void deleteById(Long id) {
		if(!transporttypeRepository.existsById(id)) {
			RestExceptionCode code = RestExceptionCode.OBJECT_NOT_FOUND;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
        }
		transporttypeRepository.findById(id)
        .map(transporttype -> {
        	transporttypeRepository.delete(transporttype);
            return true;
        });

	}
	
	@Override
	public TransportType updateTransportType(Long id,TransportTypeDto t) {
		TransportType transporttype = transporttypeRepository.findById(id).orElse(null);
		
		transporttype.setLabel(t.getLabel());
		transporttype.setAlias(t.getAlias());
		
		
			return transporttypeRepository.save(transporttype);
	}
}
