package org.sid.services;

import java.util.List;
import java.util.Optional;

import org.sid.dto.DistrictDto;
import org.sid.entities.District;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface DistrictService {
District saveDistrict(DistrictDto d);
	
	District updateDistrict(Long id,DistrictDto d);
	
	List<District> fetchListDistrict();

	Optional<District> findById(Long id);

	Page<District> chercherDistrict(String string, PageRequest of);

	void deleteById(Long id);
}
