package org.sid.services;

import java.util.List;
import java.util.Optional;

import org.sid.dto.DeclarationResponsableDto;

import org.sid.entities.DeclarationRes;

public interface DeclarationResponsableService {
Boolean saveDeclarationResponsable(DeclarationResponsableDto d);
	
	Boolean updateDeclarationResponsable(Long id,DeclarationResponsableDto d);
	Optional<DeclarationRes> findById(Long id);
	List<DeclarationRes> fetchListDeclarationResponsable();
	void deleteById(Long id);
}
