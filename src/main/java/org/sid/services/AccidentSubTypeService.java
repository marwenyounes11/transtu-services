package org.sid.services;

import java.util.List;
import java.util.Optional;

import org.sid.dto.AccidentSubTypeDto;
import org.sid.entities.AccidentSubType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface AccidentSubTypeService {
	AccidentSubType saveAccidentSubType(AccidentSubTypeDto at);
	
	AccidentSubType updateAccidentSubType(Long id,AccidentSubTypeDto at);
		
		List<AccidentSubType> fetchListAccidentSubType();

		Optional<AccidentSubType> findById(Long id);

		Page<AccidentSubType> chercherAccidentSubType(String string, PageRequest of);

		void deleteById(Long id);
}
