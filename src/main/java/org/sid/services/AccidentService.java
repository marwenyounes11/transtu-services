package org.sid.services;

import java.util.List;
import java.util.Optional;

import org.sid.dto.AccidentDto;
import org.sid.entities.Accident;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface AccidentService {
	Accident saveAccident(AccidentDto a);
	
	Accident updateAccident(Long id,AccidentDto l);
	
	List<Accident> fetchListAccident();

	Optional<Accident> findById(Long id);

	Page<Accident> chercherAccident(String string, PageRequest of);

	void deleteById(Long id);
}
