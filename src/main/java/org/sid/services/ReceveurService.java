package org.sid.services;

import java.util.List;
import java.util.Optional;

import org.sid.dto.ReceveurDto;
import org.sid.entities.Receveur;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface ReceveurService {
	Receveur saveReceveur(ReceveurDto r);
	
	Receveur updateReceveur(Long id,ReceveurDto r);
	
	List<Receveur> fetchListReceveur();

	Optional<Receveur> findById(Long id);

	Page<Receveur> chercherReceveur(String string, PageRequest of);

	void deleteById(Long id);
}
