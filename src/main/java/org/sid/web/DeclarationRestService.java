package org.sid.web;



import java.util.List;

import org.sid.dto.DeclarationAccidentDto;
import org.sid.entities.Accident;
import org.sid.entities.DeclarationAcc;
import org.sid.services.DeclarationAccidentService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import org.springframework.web.bind.annotation.RestController;




@RestController
@CrossOrigin(origins = "*")
public class DeclarationRestService {
	@Autowired
	private DeclarationAccidentService declarationService;
	@RequestMapping(value="/declaration",method=RequestMethod.GET)
	public List<DeclarationAcc> getDeclaration(){
		return declarationService.fetchListDeclaration();
	}
	
	
	
	@RequestMapping(value="/add-declaration",method=RequestMethod.POST)
	public Boolean saveDeclaration(@RequestBody DeclarationAccidentDto d ){
		return declarationService.saveDeclaration(d);
	}
	@RequestMapping(value="/declarationaccident/{id}",method=RequestMethod.GET)
	public DeclarationAcc getDeclarationAccident(@PathVariable Long id){
		return declarationService.findById(id).orElse(null);
	}
	@RequestMapping(value="/delete-declarationaccident/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		declarationService.deleteById(id);
		return true;
	}
	@RequestMapping(value="/update-declaration/{id}",method=RequestMethod.PUT)
	public Boolean updateDeclaration(@PathVariable Long id,@RequestBody DeclarationAccidentDto d ){
		return declarationService.updateDeclaration(id, d);
	}

	  
	 
}
