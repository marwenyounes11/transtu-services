package org.sid.services;

import java.util.List;
import java.util.Optional;

import org.sid.dto.ChauffeurDto;
import org.sid.entities.Chauffeur;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface ChauffeurService {
	Chauffeur saveChauffeur(ChauffeurDto c);
	
	Chauffeur updateChauffeur(Long id,ChauffeurDto c);
	
	List<Chauffeur> fetchListChauffeur();

	Optional<Chauffeur> findById(Long id);

	Page<Chauffeur> chercherChauffeur(String string, PageRequest of);

	void deleteById(Long id);
}
