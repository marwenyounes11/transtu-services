package org.sid.servicesImpl;

import java.util.List;


import org.sid.dao.AccidentRepository;
import org.sid.dao.DegatVictimeRepository;
import org.sid.dao.VictimeRepository;
import org.sid.dto.VictimeDto;
import org.sid.entities.Accident;
import org.sid.entities.DegatVictime;
import org.sid.entities.Transport;
import org.sid.entities.Victime;
import org.sid.exception.RestException;
import org.sid.exception.RestExceptionCode;
import org.sid.services.VictimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
@Service
public class VictimeServiceImpl implements VictimeService{
	@Autowired(required = true)
	VictimeRepository victimeRepository;
	
	@Autowired
	private DegatVictimeRepository degatVictimeRepository;
	@Autowired
	private AccidentRepository accidentRepository;
	private DegatVictime degatVictime;
	@Override
	public Boolean saveVictime(VictimeDto v ){
			
		Victime victime = new Victime();
			if(v.getNameVictime()== ""){
				RestExceptionCode code = RestExceptionCode.NAME_EMPTY;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			
			if(v.getNameVictime()==null){
				RestExceptionCode code = RestExceptionCode.NAME_NOT_FOUND;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			if(v.getLastNameVictime()== ""){
				RestExceptionCode code = RestExceptionCode.LASTNAME_EMPTY;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			
			if(v.getLastNameVictime()==null){
				RestExceptionCode code = RestExceptionCode.LASTNAME_NOT_FOUND;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			Accident accident = accidentRepository.findById(v.getIdAccident()).orElse(null);
			 victime.setCorpBlesser(v.getCorpBlesser());
			 victime.setNiveauBlessure(v.getNiveauBlessure());
			 victime.setEtatVictime(v.getEtatVictime());
			 victime.setTypeVictime(v.getTypeVictime());
			 victime.setLastNameVictime(v.getLastNameVictime());
			 victime.setNameVictime(v.getNameVictime());
			 victime.setAccident(accident);
			 victimeRepository.save(victime);
			 
			 return true;
		}
	@Override
	public List<Victime> fetchListVictime() {
		// TODO Auto-generated method stub
		return victimeRepository.findAll();
	}
	@Override
	public VictimeDto findById(Long id) {
		// TODO Auto-generated method stub
		Victime victime	=victimeRepository.findById(id).orElse(null);
		 String corpBlesser = victime.getCorpBlesser() ;
		 String etatVictime =victime.getEtatVictime() ;
		 String lastNameVictime = victime.getLastNameVictime() ;
		 String nameVictime = victime.getNameVictime() ;
		 String niveauBlessure = victime.getNiveauBlessure();
		 String typeVictime = victime.getTypeVictime();
		 Long idAccident = victime.getAccident().getId();
	VictimeDto victimedto = new VictimeDto(id,corpBlesser,etatVictime,lastNameVictime,nameVictime,niveauBlessure,typeVictime,idAccident);
		return victimedto;
	}
	@Override
	public Page<Victime> chercherVictime(String string, PageRequest of) {
		// TODO Auto-generated method stub
		
		return victimeRepository.chercherVictime(string, of);
	}
	@Override
	public void deleteById(Long id) {
		if(!victimeRepository.existsById(id)) {
			RestExceptionCode code = RestExceptionCode.OBJECT_NOT_FOUND;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
        }
		victimeRepository.findById(id)
        .map(victime -> {
        	victimeRepository.delete(victime);
            return true;
        });

	}
	
	@Override
	public Victime updateVictime(Long id,VictimeDto v) {
		Victime victime = victimeRepository.findById(id).orElse(null);
		if(v.getNameVictime()== ""){
			RestExceptionCode code = RestExceptionCode.NAME_EMPTY;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
		}
		
		if(v.getNameVictime()==null){
			RestExceptionCode code = RestExceptionCode.NAME_NOT_FOUND;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
		}
		if(v.getLastNameVictime()== ""){
			RestExceptionCode code = RestExceptionCode.LASTNAME_EMPTY;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
		}
		
		if(v.getLastNameVictime()==null){
			RestExceptionCode code = RestExceptionCode.LASTNAME_NOT_FOUND;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
		}
		Accident accident = accidentRepository.findById(v.getIdAccident()).orElse(null);
		 victime.setCorpBlesser(v.getCorpBlesser());
		 victime.setNiveauBlessure(v.getNiveauBlessure());
		 victime.setEtatVictime(v.getEtatVictime());
		 victime.setTypeVictime(v.getTypeVictime());
		 victime.setLastNameVictime(v.getLastNameVictime());
		 victime.setNameVictime(v.getNameVictime());
		 victime.setAccident(accident);
		return victimeRepository.save(victime);
		  
	}


}
