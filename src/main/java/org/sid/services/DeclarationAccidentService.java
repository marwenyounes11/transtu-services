package org.sid.services;

import java.util.List;
import java.util.Optional;

import org.sid.dto.DeclarationAccidentDto;
import org.sid.entities.DeclarationAcc;

public interface DeclarationAccidentService {
Boolean saveDeclaration(DeclarationAccidentDto a);
	
	Boolean updateDeclaration(Long id,DeclarationAccidentDto d);
	Optional<DeclarationAcc> findById(Long id);
	List<DeclarationAcc> fetchListDeclaration();
	void deleteById(Long id);
	
}
