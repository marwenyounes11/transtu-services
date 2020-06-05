package org.sid.services;

import java.util.List;
import java.util.Optional;

import org.sid.dto.TransportDto;
import org.sid.entities.Transport;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface TransportService {
	Transport saveTransport(TransportDto a);
	
Transport updateTransport(Long id,TransportDto d);
	
	List<Transport> fetchListTransport();

	Optional<Transport> findById(Long id);

	Page<Transport> chercherTransport(String string, PageRequest of);

	void deleteById(Long id);
}
