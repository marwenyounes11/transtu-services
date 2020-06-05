package org.sid.services;

import java.util.List;
import java.util.Optional;

import org.sid.dto.DegatTypeDto;
import org.sid.entities.DegatType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface DegatTypeService {
	DegatType saveDegatType(DegatTypeDto at);
	
	DegatType updateDegatType(Long id,DegatTypeDto at);
		
		List<DegatType> fetchListDegatType();

		Optional<DegatType> findById(Long id);

		Page<DegatType> chercherDegatType(String string, PageRequest of);

		void deleteById(Long id);
}
