package org.sid.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.sid.dao.DegatRepository;
import org.sid.dao.DegatTransportRepository;
import org.sid.dao.DegatVictimeRepository;
import org.sid.dao.TransportRepository;
import org.sid.dao.VictimeRepository;
import org.sid.dto.DegatTransportDto;
import org.sid.dto.DegatVictimeDto;
import org.sid.entities.Degat;
import org.sid.entities.DegatTransport;
import org.sid.entities.DegatVictime;
import org.sid.entities.Transport;
import org.sid.entities.Victime;
import org.sid.exception.RestException;
import org.sid.exception.RestExceptionCode;
import org.sid.services.DegatTransportService;
import org.sid.services.DegatVictimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class DegatVictimeServiceImpl implements DegatVictimeService{
	@Autowired(required = true)
	DegatVictimeRepository degatVictimeRepository;
	@Autowired(required = true)
	DegatRepository degatRepository;
	@Autowired(required = true)
	VictimeRepository victimeRepository;
	@Override
	public DegatVictime saveDegatVictime(DegatVictimeDto d){
		
		DegatVictime degatVictime = new DegatVictime();
		Degat degatPhysique = degatRepository.findById(d.getIdDegatPhysique()).orElse(null);
		Victime victime = victimeRepository.findById(d.getIdVictime()).orElse(null);
		degatVictime.setDegatPhysique(degatPhysique);
		degatVictime.setVictime(victime);
			return degatVictimeRepository.save(degatVictime);
		}
	@Override
	public List<DegatVictime> fetchListDegatVictime() {
		// TODO Auto-generated method stub
		return degatVictimeRepository.findAll();
	}
	@Override
	public Optional<DegatVictime> findById(Long id) {
		// TODO Auto-generated method stub
		return degatVictimeRepository.findById(id);
	}
	
	@Override
	public void deleteById(Long id) {
		if(!degatVictimeRepository.existsById(id)) {
			RestExceptionCode code = RestExceptionCode.OBJECT_NOT_FOUND;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
        }
		degatVictimeRepository.findById(id)
        .map(degatVictime -> {
        	degatVictimeRepository.delete(degatVictime);
            return true;
        });

	}
	
	@Override
	public DegatVictime updateDegatVictime(Long id,DegatVictimeDto d) {
		DegatVictime degatVictime = degatVictimeRepository.findById(id).orElse(null);
		Degat degatPhysique = degatRepository.findById(d.getIdDegatPhysique()).orElse(null);
		Victime victime = victimeRepository.findById(d.getIdVictime()).orElse(null);
		degatVictime.setDegatPhysique(degatPhysique);
		degatVictime.setVictime(victime);
			return degatVictimeRepository.save(degatVictime);
	}
}
