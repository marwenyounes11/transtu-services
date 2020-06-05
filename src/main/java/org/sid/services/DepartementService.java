package org.sid.services;

import java.util.List;
import java.util.Optional;

import org.sid.dto.DepartementDto;
import org.sid.entities.Departement;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface DepartementService {
	Departement saveDepartement(DepartementDto c);
	
	Departement updateDepartement(Long id,DepartementDto c);
	
	List<Departement> fetchListDepartement();

	Optional<Departement> findById(Long id);

	Page<Departement> chercherDepartement(String string, PageRequest of);

	void deleteById(Long id);
}
