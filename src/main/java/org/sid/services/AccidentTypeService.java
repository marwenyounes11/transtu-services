package org.sid.services;

import java.util.List;
import java.util.Optional;

import org.sid.dto.AccidentTypeDto;
import org.sid.entities.AccidentType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface AccidentTypeService {
AccidentType saveAccidentType(AccidentTypeDto at);
	
AccidentType updateAccidentType(Long id,AccidentTypeDto at);
	
	List<AccidentType> fetchListAccidentType();

	Optional<AccidentType> findById(Long id);

	Page<AccidentType> chercherAccidentType(String string, PageRequest of);

	void deleteById(Long id);
}
