package org.sid.services;

import java.util.List;
import java.util.Optional;


import org.sid.dto.DegatVictimeDto;

import org.sid.entities.DegatVictime;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface DegatVictimeService {
DegatVictime saveDegatVictime(DegatVictimeDto a);
	
	DegatVictime updateDegatVictime(Long id,DegatVictimeDto d);
	
	List<DegatVictime> fetchListDegatVictime();

	Optional<DegatVictime> findById(Long id);

	

	void deleteById(Long id);
}
