package org.sid.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.sid.dao.InterventionMaterielRepository;
import org.sid.dao.InterventionRepository;
import org.sid.dao.MaterielRepository;
import org.sid.dto.InterventionMaterielDto;
import org.sid.entities.Intervention;
import org.sid.entities.InterventionMateriel;
import org.sid.entities.Materiel;
import org.sid.exception.RestException;
import org.sid.exception.RestExceptionCode;
import org.sid.services.InterventionMaterielService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class InterventionMaterielServiceImpl implements InterventionMaterielService{
	@Autowired(required = true)
	InterventionMaterielRepository interventionmaterielRepository;
	@Autowired(required = true)
	InterventionRepository interventionRepository;
	@Autowired(required = true)
	MaterielRepository materielRepository;
	@Override
	public InterventionMateriel saveInterventionMateriel(InterventionMaterielDto i ){
			
		InterventionMateriel interventionmateriel = new InterventionMateriel();
		Intervention intervention =	interventionRepository.findById(i.getIdIntervention()).orElse(null);
		Materiel materiel =	materielRepository.findById(i.getIdMateriel()).orElse(null);
			interventionmateriel.setIntervention(intervention);
			interventionmateriel.setMateriel(materiel);
			return interventionmaterielRepository.save(interventionmateriel);
		}
	@Override
	public List<InterventionMateriel> fetchListInterventionMateriel() {
		// TODO Auto-generated method stub
		return interventionmaterielRepository.findAll();
	}
	@Override
	public Optional<InterventionMateriel> findById(Long id) {
		// TODO Auto-generated method stub
		return interventionmaterielRepository.findById(id);
	}
	
	@Override
	public void deleteById(Long id) {
		if(!interventionmaterielRepository.existsById(id)) {
			RestExceptionCode code = RestExceptionCode.OBJECT_NOT_FOUND;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
        }
		interventionmaterielRepository.findById(id)
        .map(interventionmateriel -> {
        	interventionmaterielRepository.delete(interventionmateriel);
            return true;
        });

	}
	
	@Override
	public InterventionMateriel updateInterventionMateriel(Long id, InterventionMaterielDto i) {
		InterventionMateriel interventionmateriel = interventionmaterielRepository.findById(id).orElse(null);
		Intervention intervention =	interventionRepository.findById(i.getIdIntervention()).orElse(null);
		Materiel materiel =	materielRepository.findById(i.getIdMateriel()).orElse(null);
			interventionmateriel.setIntervention(intervention);
			interventionmateriel.setMateriel(materiel);
			return interventionmaterielRepository.save(interventionmateriel);
	}	
}
