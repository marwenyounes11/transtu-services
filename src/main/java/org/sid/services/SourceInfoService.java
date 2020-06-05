package org.sid.services;

import java.util.List;
import java.util.Optional;

import org.sid.dto.SourceInfoDto;
import org.sid.entities.SourceInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface SourceInfoService {
	SourceInfo saveSourceInfo(SourceInfoDto s);
	
	SourceInfo updateSourceInfo(Long id,SourceInfoDto s);
	
	List<SourceInfo> fetchListSourceInfo();

	Optional<SourceInfo> findById(Long id);

	Page<SourceInfo> chercherSourceInfo(String string, PageRequest of);

	void deleteById(Long id);
}
