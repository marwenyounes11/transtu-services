package org.sid.web;

import java.util.List;

import org.sid.dto.DeclarationResponsableDto;
import org.sid.entities.DeclarationAcc;
import org.sid.entities.DeclarationRes;
import org.sid.services.DeclarationResponsableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class DeclarationResponsableRestService {
	@Autowired
	private DeclarationResponsableService declarationResponsableService;
	@RequestMapping(value="/declaration-responsable",method=RequestMethod.GET)
	public List<DeclarationRes> getDeclaration(){
		return declarationResponsableService.fetchListDeclarationResponsable();
	}
	
	
	
	@RequestMapping(value="/add-declaration-responsable",method=RequestMethod.POST)
	public Boolean saveDeclaration(@RequestBody DeclarationResponsableDto d ){
		return declarationResponsableService.saveDeclarationResponsable(d);
	}
	@RequestMapping(value="/declarationresponsable/{id}",method=RequestMethod.GET)
	public DeclarationRes getDeclarationResponsable(@PathVariable Long id){
		return declarationResponsableService.findById(id).orElse(null);
	}
	@RequestMapping(value="/delete-declarationresponsable/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		declarationResponsableService.deleteById(id);
		return true;
	}
	
	@RequestMapping(value="/update-declaration-responsable/{id}",method=RequestMethod.PUT)
	public Boolean updateDeclaration(@PathVariable Long id,@RequestBody DeclarationResponsableDto d ){
		return declarationResponsableService.updateDeclarationResponsable(id, d);
	}

}
