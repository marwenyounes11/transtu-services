package org.sid.services;

import java.util.List;
import java.util.Optional;

import org.sid.dto.DegatDto;
import org.sid.entities.Degat;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface DegatService {
	Degat saveDegat(DegatDto a);
	
	Degat updateDegat(Long id,DegatDto d);
	
	List<Degat> fetchListDegat();

	Optional<Degat> findById(Long id);

	Page<Degat> chercherDegat(String string, PageRequest of);

	void deleteById(Long id);
}
