package org.sid.services;

import java.util.List;
import java.util.Optional;

import org.sid.dto.LineDto;
import org.sid.entities.Line;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface LineService {
Line saveLine(LineDto l);
	
	Line updateLine(Long id,LineDto l);
	
	List<Line> fetchListLine();

	Optional<Line> findById(Long id);

	Page<Line> chercherLine(String string, PageRequest of);

	void deleteById(Long id);
}
