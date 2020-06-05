package org.sid.services;

import java.util.List;
import java.util.Optional;

import org.sid.dto.AccidentSecuriteDto;
import org.sid.entities.AccidentSecurite;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface AccidentSecuriteService {
AccidentSecurite saveAccidentSecurite(AccidentSecuriteDto a);
	
	AccidentSecurite updateAccidentSecurite(Long id,AccidentSecuriteDto l);
	
	List<AccidentSecurite> fetchListAccidentSecurite();

	Optional<AccidentSecurite> findById(Long id);


	void deleteById(Long id);
}
