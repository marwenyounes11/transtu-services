package org.sid.services;

import java.util.List;
import java.util.Optional;


import org.sid.entities.Responsable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface ResponsableService {
	Responsable saveResponsable(Responsable r);
	
	Responsable updateResponsable(Long id,Responsable r);
	
	List<Responsable> fetchListResponsable();

	Optional<Responsable> findById(Long id);

	

	void deleteById(Long id);
}
