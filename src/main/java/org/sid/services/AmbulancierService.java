package org.sid.services;

import java.util.List;
import java.util.Optional;


import org.sid.entities.Ambulancier;


public interface AmbulancierService {
	Ambulancier saveAmbulancier(Ambulancier a);
	
	Ambulancier updateAmbulancier(Long id,Ambulancier a);
	
	List<Ambulancier> fetchListAmbulancier();

	Optional<Ambulancier> findById(Long id);
	
	void deleteById(Long id);
}
