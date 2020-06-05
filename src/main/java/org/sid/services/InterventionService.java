package org.sid.services;

import java.util.List;
import java.util.Optional;

import org.sid.dto.InterventionDto;
import org.sid.entities.Intervention;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface InterventionService {
	Intervention saveIntervention(InterventionDto i);
	
	Intervention updateIntervention(Long id,InterventionDto i);
	
	List<Intervention> fetchListIntervention();

	Optional<Intervention> findById(Long id);

	Page<Intervention> chercherIntervention(String string, PageRequest of);

	void deleteById(Long id);
}
