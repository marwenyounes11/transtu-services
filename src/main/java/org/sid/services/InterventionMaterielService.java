package org.sid.services;

import java.util.List;
import java.util.Optional;

import org.sid.dto.InterventionMaterielDto;
import org.sid.entities.InterventionMateriel;

public interface InterventionMaterielService {
InterventionMateriel saveInterventionMateriel(InterventionMaterielDto i);
	
	InterventionMateriel updateInterventionMateriel(Long id,InterventionMaterielDto i);
	
	List<InterventionMateriel> fetchListInterventionMateriel();

	Optional<InterventionMateriel> findById(Long id);

	void deleteById(Long id);
}
