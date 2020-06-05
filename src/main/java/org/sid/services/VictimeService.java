package org.sid.services;

import java.util.List;
import java.util.Optional;

import org.sid.dto.VictimeDto;
import org.sid.entities.Victime;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface VictimeService {
	 Boolean saveVictime(VictimeDto v);
	
	Victime updateVictime(Long id,VictimeDto v);
	
	List<Victime> fetchListVictime();

	VictimeDto findById(Long id);

	Page<Victime> chercherVictime(String string, PageRequest of);

	void deleteById(Long id);
}
