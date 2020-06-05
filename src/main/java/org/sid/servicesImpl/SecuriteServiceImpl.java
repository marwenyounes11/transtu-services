package org.sid.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.sid.dao.SecuriteRepository;
import org.sid.entities.Securite;
import org.sid.exception.RestException;
import org.sid.exception.RestExceptionCode;
import org.sid.services.SecuriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SecuriteServiceImpl implements SecuriteService{
	@Autowired(required = true)
	SecuriteRepository securiteRepository;
	@Override
	public Securite saveSecurite(Securite s ){
		Securite securite= new Securite();
		 securite.setTypeSecurite(s.getTypeSecurite());
		return  securiteRepository.save(securite);	
	}
	
	@Override
	public List<Securite> fetchListSecurite() {
		// TODO Auto-generated method stub
		return securiteRepository.findAll();
	}
	@Override
	public Optional<Securite> findById(Long id) {
		// TODO Auto-generated method stub
		return securiteRepository.findById(id);
	}
	
	@Override
	public void deleteById(Long id) {
		if(!securiteRepository.existsById(id)) {
			RestExceptionCode code = RestExceptionCode.OBJECT_NOT_FOUND;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
        }
		securiteRepository.findById(id)
        .map(securite -> {
        	securiteRepository.delete(securite);
            return true;
        });

	}
	
	@Override
	public Securite updateSecurite(Long id,Securite s) {
		
		if(id <= 0) {
			RestExceptionCode code = RestExceptionCode.INVALID_ID;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
		}
		
		 
		Securite securite =securiteRepository.findById(id).orElse(null);;
		securite.setTypeSecurite(s.getTypeSecurite()); 
			return  securiteRepository.save(securite);
		
		
	}
}
