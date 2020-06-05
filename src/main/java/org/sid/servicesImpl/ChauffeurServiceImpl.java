package org.sid.servicesImpl;
import java.util.List;
import java.util.Optional;
import org.sid.dao.ChauffeurRepository;
import org.sid.dto.ChauffeurDto;
import org.sid.entities.AgentPcr;
import org.sid.entities.Chauffeur;
import org.sid.exception.RestException;
import org.sid.exception.RestExceptionCode;
import org.sid.services.ChauffeurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
@Service
public class ChauffeurServiceImpl implements ChauffeurService{
	@Autowired(required = true)
	ChauffeurRepository chauffeurRepository;
	@Override
	public Chauffeur saveChauffeur(ChauffeurDto c ){
		String nameChauffeur=c.getNameChauffeur();	
		String lastNameChauffeur=c.getLastNameChauffeur();	
		String emailChauffeur=c.getEmailChauffeur();	
		String phoneChauffeur=c.getPhoneChauffeur();	
		String regExpEmail ="^[\\w.-]+@[\\w.-]+\\.[a-z]{2.}$";
		String regExpPhone ="^\\d{8}$";	
		Chauffeur chauffeur = new Chauffeur();
			if(nameChauffeur== ""){
				RestExceptionCode code = RestExceptionCode.NAME_EMPTY;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			
			if(nameChauffeur==null){
				RestExceptionCode code = RestExceptionCode.NAME_NOT_FOUND;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			if(lastNameChauffeur== ""){
				RestExceptionCode code = RestExceptionCode.LASTNAME_EMPTY;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			
			if(lastNameChauffeur==null){
				RestExceptionCode code = RestExceptionCode.LASTNAME_NOT_FOUND;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			if(!(emailChauffeur).matches(regExpEmail)){
				RestExceptionCode code = RestExceptionCode.EMAIL_INCORRECT;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			if(!(phoneChauffeur).matches(regExpPhone)){
				RestExceptionCode code = RestExceptionCode.PHONE_INCORRECT;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			chauffeur.setEmailChauffeur(emailChauffeur);
			chauffeur.setNameChauffeur(nameChauffeur);
			chauffeur.setLastNameChauffeur(lastNameChauffeur);
			chauffeur.setPhoneChauffeur(phoneChauffeur);
			return chauffeurRepository.save(chauffeur);
		}
	@Override
	public List<Chauffeur> fetchListChauffeur() {
		// TODO Auto-generated method stub
		return chauffeurRepository.findAll();
	}
	@Override
	public Optional<Chauffeur> findById(Long id) {
		// TODO Auto-generated method stub
		return chauffeurRepository.findById(id);
	}
	@Override
	public Page<Chauffeur> chercherChauffeur(String string, PageRequest of) {
		// TODO Auto-generated method stub
		
		return chauffeurRepository.chercherChauffeur(string, of);
	}
	@Override
	public void deleteById(Long id) {
		if(!chauffeurRepository.existsById(id)) {
			RestExceptionCode code = RestExceptionCode.OBJECT_NOT_FOUND;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
        }
		chauffeurRepository.findById(id)
        .map(chauffeur -> {
        	chauffeurRepository.delete(chauffeur);
            return true;
        });

	}
	
	@Override
	public Chauffeur updateChauffeur(Long id, ChauffeurDto c) {
		Chauffeur chauffeur = chauffeurRepository.findById(id).orElse(null);
		String nameChauffeur=c.getNameChauffeur();	
		String lastNameChauffeur=c.getLastNameChauffeur();	
		String emailChauffeur=c.getEmailChauffeur();	
		String phoneChauffeur=c.getPhoneChauffeur();	
		String regExpEmail ="^[\\w.-]+@[\\w.-]+\\.[a-z]{2.}$";
		String regExpPhone ="^\\d{8}$";	
			if(nameChauffeur== ""){
				RestExceptionCode code = RestExceptionCode.NAME_EMPTY;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			
			if(nameChauffeur==null){
				RestExceptionCode code = RestExceptionCode.NAME_NOT_FOUND;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			if(lastNameChauffeur== ""){
				RestExceptionCode code = RestExceptionCode.LASTNAME_EMPTY;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			
			if(lastNameChauffeur==null){
				RestExceptionCode code = RestExceptionCode.LASTNAME_NOT_FOUND;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			if(!(emailChauffeur).matches(regExpEmail)){
				RestExceptionCode code = RestExceptionCode.EMAIL_INCORRECT;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			if(!(phoneChauffeur).matches(regExpPhone)){
				RestExceptionCode code = RestExceptionCode.PHONE_INCORRECT;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			chauffeur.setEmailChauffeur(emailChauffeur);
			chauffeur.setNameChauffeur(nameChauffeur);
			chauffeur.setLastNameChauffeur(lastNameChauffeur);
			chauffeur.setPhoneChauffeur(phoneChauffeur);
			return chauffeurRepository.save(chauffeur);
	}
}
