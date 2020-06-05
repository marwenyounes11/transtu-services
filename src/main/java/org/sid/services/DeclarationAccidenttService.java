package org.sid.services;

import java.util.List;
import java.util.Optional;

import org.sid.dto.DeclarationAccidenttDto;
import org.sid.entities.DeclarationAccident;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

public interface DeclarationAccidenttService {
    Boolean saveDeclaration(DeclarationAccidenttDto a) ;
    Boolean savePhoto(Long id,MultipartFile file ) throws Exception;
	Boolean updateDeclaration(Long id,DeclarationAccidenttDto d, MultipartFile file);
	Optional<DeclarationAccident> findById(Long id);
	List<DeclarationAccident> fetchListDeclaration();
	void deleteById(Long id);
}
