package org.sid.services;

import java.util.List;
import java.util.Optional;

import org.sid.dto.DepotDto;
import org.sid.entities.Depot;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;


public interface DepotService {

	Depot saveDepot(DepotDto d);
	
	Depot updateDepot(Long id,DepotDto d);
	
	List<Depot> fetchListDepot();

	Optional<Depot> findById(Long id);

	Page<Depot> chercherDepot(String string, PageRequest of);

	void deleteById(Long id);


}
