package org.sid.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.sid.dao.TransportRepository;
import org.sid.dto.TransportDto;
import org.sid.entities.SourceInfo;
import org.sid.entities.Transport;
import org.sid.exception.RestException;
import org.sid.exception.RestExceptionCode;
import org.sid.services.TransportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
@Service
public class TransportServiceImpl implements TransportService{
	@Autowired(required = true)
	TransportRepository transportRepository;
	@Override
	public Transport saveTransport(TransportDto t ){
			
		Transport transport = new Transport();
			
		transport.setNumTransport(t.getNumTransport());
		transport.setImmatriculation(t.getImmatriculation());
		transport.setMarque(t.getMarque());
		transport.setModel(t.getModel());
		transport.setGabarit(t.getGabarit());
		
			return transportRepository.save(transport);
		}
	@Override
	public List<Transport> fetchListTransport() {
		// TODO Auto-generated method stub
		return transportRepository.findAll();
	}
	@Override
	public Optional<Transport> findById(Long id) {
		// TODO Auto-generated method stub
		return transportRepository.findById(id);
	}
	@Override
	public Page<Transport> chercherTransport(String string, PageRequest of) {
		// TODO Auto-generated method stub
		
		return transportRepository.chercherTransport(string, of);
	}
	@Override
	public void deleteById(Long id) {
		if(!transportRepository.existsById(id)) {
			RestExceptionCode code = RestExceptionCode.OBJECT_NOT_FOUND;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
        }
		transportRepository.findById(id)
        .map(transport -> {
        	transportRepository.delete(transport);
            return true;
        });

	}
	
	@Override
	public Transport updateTransport(Long id,TransportDto t) {
		Transport transport = transportRepository.findById(id).orElse(null);
		
		transport.setNumTransport(t.getNumTransport());
		transport.setImmatriculation(t.getImmatriculation());
		transport.setMarque(t.getMarque());
		transport.setModel(t.getModel());
		transport.setGabarit(t.getGabarit());
		
			return transportRepository.save(transport);
	}
}
