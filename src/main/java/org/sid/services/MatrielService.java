package org.sid.services;

import java.util.List;
import java.util.Optional;

import org.sid.dto.MaterielDto;
import org.sid.entities.Materiel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface MatrielService {

	Materiel saveMateriel(MaterielDto l);
	
	Materiel updateMateriel(Long id,MaterielDto l);
	
	List<Materiel> fetchListMateriel();

	Optional<Materiel> findById(Long id);

	Page<Materiel> chercherMateriel(String string, PageRequest of);

	void deleteById(Long id);


}
