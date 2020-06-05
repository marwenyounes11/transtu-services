package org.sid.web;

import java.util.List;


import org.sid.dto.DeclarationAccidenttDto;

import org.sid.entities.DeclarationAccident;

import org.sid.services.DeclarationAccidenttService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin(origins = "*")
public class DeclarationAccidentRestService {
	@Autowired
	private DeclarationAccidenttService declarationService;
	@RequestMapping(value="/declarationaccident",method=RequestMethod.GET)
	public List<DeclarationAccident> getDeclaration(){
		return declarationService.fetchListDeclaration();
	}
	
	
	
	@RequestMapping(value="/add-declarationaccident",method=RequestMethod.POST)
	public Boolean saveDeclaration(@RequestParam("file") MultipartFile file,@RequestParam("declarationAccident") DeclarationAccidenttDto d ) {
		return declarationService.saveDeclaration(d);
	}
	@RequestMapping(value="/declarationaccidentt/{id}",method=RequestMethod.GET)
	public DeclarationAccident getDeclarationAccident(@PathVariable Long id){
		return declarationService.findById(id).orElse(null);
	}
	@RequestMapping(value="/delete-declarationaccidentt/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		declarationService.deleteById(id);
		return true;
	}
	@RequestMapping(value="/update-declarationaccident/{id}",method=RequestMethod.PUT)
	public Boolean updateDeclaration(@PathVariable Long id,@RequestBody DeclarationAccidenttDto d ,MultipartFile file){
		return declarationService.updateDeclaration(id, d,file);
	}
}
