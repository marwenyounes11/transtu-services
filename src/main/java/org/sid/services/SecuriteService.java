package org.sid.services;

import java.util.List;
import java.util.Optional;

import org.sid.entities.Securite;

public interface SecuriteService {
	Securite saveSecurite(Securite s );
	
	Securite updateSecurite(Long id,Securite s);
	
	List<Securite> fetchListSecurite();

	Optional<Securite> findById(Long id);

	void deleteById(Long id);
}
