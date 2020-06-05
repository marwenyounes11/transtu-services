package org.sid.servicesImpl;

import java.util.List;
import java.util.Optional;


import org.sid.dao.ReceveurRepository;
import org.sid.dto.ReceveurDto;
import org.sid.entities.Materiel;
import org.sid.entities.Receveur;
import org.sid.exception.RestException;
import org.sid.exception.RestExceptionCode;
import org.sid.services.ReceveurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
@Service
public class ReceveurServiceImpl implements ReceveurService {
	@Autowired(required = true)
	ReceveurRepository receveurRepository;
	@Override
	public Receveur saveReceveur(ReceveurDto r ){
			
		Receveur receveur = new Receveur();
			if(r.getNameReceveur()== ""){
				RestExceptionCode code = RestExceptionCode.NAME_EMPTY;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			
			if(r.getNameReceveur()==null){
				RestExceptionCode code = RestExceptionCode.NAME_NOT_FOUND;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			receveur.setNameReceveur(r.getNameReceveur());
			return receveurRepository.save(receveur);
		}
	@Override
	public List<Receveur> fetchListReceveur() {
		// TODO Auto-generated method stub
		return receveurRepository.findAll();
	}
	@Override
	public Optional<Receveur> findById(Long id) {
		// TODO Auto-generated method stub
		return receveurRepository.findById(id);
	}
	@Override
	public Page<Receveur> chercherReceveur(String string, PageRequest of) {
		// TODO Auto-generated method stub
		
		return receveurRepository.chercherReceveur(string, of);
	}
	@Override
	public void deleteById(Long id) {
		if(!receveurRepository.existsById(id)) {
			RestExceptionCode code = RestExceptionCode.OBJECT_NOT_FOUND;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
        }
		receveurRepository.findById(id)
        .map(receveur -> {
        	receveurRepository.delete(receveur);
            return true;
        });

	}
	
	@Override
	public Receveur updateReceveur(Long id,ReceveurDto r) {
		Receveur receveur = receveurRepository.findById(id).orElse(null);
		if(r.getNameReceveur()== ""){
			RestExceptionCode code = RestExceptionCode.NAME_EMPTY;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
		}
		
		if(r.getNameReceveur()==null){
			RestExceptionCode code = RestExceptionCode.NAME_NOT_FOUND;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
		}
		receveur.setNameReceveur(r.getNameReceveur());
		return receveurRepository.save(receveur);
	}
	

}
