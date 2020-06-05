package org.sid.services;

import java.util.List;
import java.util.Optional;

import org.sid.dto.EmplacementDto;
import org.sid.entities.Emplacement;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface EmplacementService {
	Emplacement saveEmplacement(EmplacementDto e);
	
	Emplacement updateEmplacement(Long id,EmplacementDto e);
	
	List<Emplacement> fetchListEmplacement();

	Optional<Emplacement> findById(Long id);

	Page<Emplacement> chercherEmplacement(String string, PageRequest of);

	void deleteById(Long id);
}
