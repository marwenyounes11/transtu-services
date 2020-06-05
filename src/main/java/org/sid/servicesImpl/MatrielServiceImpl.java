package org.sid.servicesImpl;


import java.util.List;
import java.util.Optional;

import org.sid.dao.DepartementRepository;
import org.sid.dao.MaterielRepository;
import org.sid.dao.MaterialTypeRepository;
import org.sid.dto.MaterielDto;
import org.sid.entities.Departement;
import org.sid.entities.Line;
import org.sid.entities.MaterialType;
import org.sid.entities.Materiel;
import org.sid.exception.RestException;
import org.sid.exception.RestExceptionCode;
import org.sid.services.MatrielService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;


@Service
public class MatrielServiceImpl implements MatrielService{
	
	@Autowired(required = true)
	MaterielRepository materielRepository;
	@Autowired(required = true)
	DepartementRepository departementRepository;
	@Autowired(required = true)
	MaterialTypeRepository materialTypeRepository;
	@Override
	public Materiel saveMateriel(MaterielDto d ){
			
		Materiel materiel = new Materiel();
		MaterialType materialType = materialTypeRepository.findById(d.getIdMaterialType()).orElse(null);
		Departement departement = departementRepository.findById(d.getIdDepartement()).orElse(null);
			
		String dateAcquisition=d.getDateAcquisition();
		String datePeremption=d.getDatePeremption();
		String description=d.getDescription();
		String numberSerie=d.getNumberSerie();
		
		
		  
		
		
		
		materiel.setDateAcquisition(dateAcquisition);
		materiel.setDatePeremption(datePeremption);
		materiel.setDescription(description);
		materiel.setNumberSerie(numberSerie);
		materiel.setMaterialType(materialType);
		materiel.setDepartement(departement);
		return materielRepository.save(materiel);
		}
	@Override
	public List<Materiel> fetchListMateriel() {
		// TODO Auto-generated method stub
		return materielRepository.findAll();
	}
	@Override
	public Optional<Materiel> findById(Long id) {
		// TODO Auto-generated method stub
		return materielRepository.findById(id);
	}
	@Override
	public Page<Materiel> chercherMateriel(String string, PageRequest of) {
		// TODO Auto-generated method stub
		
		return materielRepository.chercherMateriel(string, of);
	}
	@Override
	public void deleteById(Long id) {
		if(!materielRepository.existsById(id)) {
			RestExceptionCode code = RestExceptionCode.OBJECT_NOT_FOUND;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
        }
		materielRepository.findById(id)
        .map(materiel -> {
        	materielRepository.delete(materiel);
            return true;
        });

	}
	
	@Override
	public Materiel updateMateriel(Long id,MaterielDto m) {
		Materiel materiel = materielRepository.findById(id).orElse(null);
		MaterialType materialType = materialTypeRepository.findById(m.getIdMaterialType()).orElse(null);
		Departement departement = departementRepository.findById(m.getIdDepartement()).orElse(null);
			
		String dateAcquisition=m.getDateAcquisition();
		String datePeremption=m.getDatePeremption();
		String description=m.getDescription();
		String numberSerie=m.getNumberSerie();
		
		
		  
		
		
		
		materiel.setDateAcquisition(dateAcquisition);
		materiel.setDatePeremption(datePeremption);
		materiel.setDescription(description);
		materiel.setNumberSerie(numberSerie);
		materiel.setMaterialType(materialType);
		materiel.setDepartement(departement);
		return materielRepository.save(materiel);
	}
	

	

}
