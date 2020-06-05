package org.sid.services;

import java.util.List;
import java.util.Optional;

import org.sid.dto.MaterialTypeDto;
import org.sid.entities.MaterialType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface MaterialTypeService {
	MaterialType saveMaterialType(MaterialTypeDto a);
	
	MaterialType updateMaterialType(Long id,MaterialTypeDto d);
		
		List<MaterialType> fetchListMaterialType();

		Optional<MaterialType> findById(Long id);

		Page<MaterialType> chercherMaterialType(String string, PageRequest of);

		void deleteById(Long id);
}
