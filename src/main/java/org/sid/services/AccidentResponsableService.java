package org.sid.services;

import java.util.List;
import java.util.Optional;

import org.sid.dto.AccidentResponsableDto;
import org.sid.entities.AccidentResponsable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface AccidentResponsableService {
AccidentResponsable saveAccidentResponsable(AccidentResponsableDto a);
	
	AccidentResponsable updateAccidentResponsable(Long id,AccidentResponsableDto l);
	
	List<AccidentResponsable> fetchListAccidentResponsable();

	Optional<AccidentResponsable> findById(Long id);


	void deleteById(Long id);
}
