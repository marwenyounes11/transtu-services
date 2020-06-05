package org.sid.services;

import java.util.List;
import java.util.Optional;


import org.sid.dto.TransportTypeDto;

import org.sid.entities.TransportType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface TransportTypeService {
	TransportType saveTransportType(TransportTypeDto a);
	
	TransportType updateTransportType(Long id,TransportTypeDto d);
		
		List<TransportType> fetchListTransportType();

		Optional<TransportType> findById(Long id);

		Page<TransportType> chercherTransportType(String string, PageRequest of);

		void deleteById(Long id);
}
