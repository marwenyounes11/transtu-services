package org.sid.services;

import java.util.List;
import java.util.Optional;

import org.sid.dto.DegatTransportDto;

import org.sid.entities.DegatTransport;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface DegatTransportService {
DegatTransport saveDegatTransport(DegatTransportDto a);
	
	DegatTransport updateDegatTransport(Long id,DegatTransportDto d);
	
	List<DegatTransport> fetchListDegatTransport();

	Optional<DegatTransport> findById(Long id);

	

	void deleteById(Long id);
}
