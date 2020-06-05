package org.sid.services;

import java.util.List;
import java.util.Optional;

import org.sid.dto.AccidentAmbulancierDto;
import org.sid.entities.AccidentAmbulancier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface AccidentAmbulancierService {
AccidentAmbulancier saveAccidentAmbulancier(AccidentAmbulancierDto a);
	
	AccidentAmbulancier updateAccidentAmbulancier(Long id,AccidentAmbulancierDto l);
	
	List<AccidentAmbulancier> fetchListAccidentAmbulancier();

	Optional<AccidentAmbulancier> findById(Long id);

	

	void deleteById(Long id);
}
