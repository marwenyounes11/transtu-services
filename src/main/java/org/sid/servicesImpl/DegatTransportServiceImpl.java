package org.sid.servicesImpl;


import java.util.List;
import java.util.Optional;


import org.sid.dao.DegatRepository;
import org.sid.dao.DegatTransportRepository;
import org.sid.dao.TransportRepository;
import org.sid.dto.DegatTransportDto;
import org.sid.entities.Degat;
import org.sid.entities.DegatTransport;
import org.sid.entities.Transport;
import org.sid.exception.RestException;
import org.sid.exception.RestExceptionCode;
import org.sid.services.DegatTransportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class DegatTransportServiceImpl implements DegatTransportService{
	@Autowired(required = true)
	DegatTransportRepository degatTransportRepository;
	@Autowired(required = true)
	DegatRepository degatRepository;
	@Autowired(required = true)
	TransportRepository transportRepository;
	@Override
	public DegatTransport saveDegatTransport(DegatTransportDto d ){
		
		DegatTransport degatTransport = new DegatTransport();
		Degat degatMateriel = degatRepository.findById(d.getIdDegatMateriel()).orElse(null);
		Transport transport = transportRepository.findById(d.getIdTransport()).orElse(null);
		degatTransport.setDegatMateriel(degatMateriel);
		degatTransport.setTransport(transport);
			return degatTransportRepository.save(degatTransport);
		}
	@Override
	public List<DegatTransport> fetchListDegatTransport() {
		// TODO Auto-generated method stub
		return degatTransportRepository.findAll();
	}
	@Override
	public Optional<DegatTransport> findById(Long id) {
		// TODO Auto-generated method stub
		return degatTransportRepository.findById(id);
	}
	
	@Override
	public void deleteById(Long id) {
		if(!degatTransportRepository.existsById(id)) {
			RestExceptionCode code = RestExceptionCode.OBJECT_NOT_FOUND;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
        }
		degatTransportRepository.findById(id)
        .map(degatTransport -> {
        	degatTransportRepository.delete(degatTransport);
            return true;
        });

	}
	
	@Override
	public DegatTransport updateDegatTransport(Long id,DegatTransportDto d) {
		DegatTransport degatTransport = degatTransportRepository.findById(id).orElse(null);
		Degat degatMateriel = degatRepository.findById(d.getIdDegatMateriel()).orElse(null);
		Transport transport = transportRepository.findById(d.getIdTransport()).orElse(null);
		degatTransport.setDegatMateriel(degatMateriel);
		degatTransport.setTransport(transport);
			return degatTransportRepository.save(degatTransport);
}
}