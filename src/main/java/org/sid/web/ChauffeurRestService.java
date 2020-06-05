package org.sid.web;

import java.util.List;

import org.sid.services.ChauffeurService ;
import org.sid.dto.ChauffeurDto;
import org.sid.entities.Chauffeur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin(origins = "*")
public class ChauffeurRestService {
	@Autowired
	private ChauffeurService chauffeurService ;
	
	 
	@RequestMapping(value="/chauffeur",method=RequestMethod.GET)
	public List<Chauffeur> getChauffeur(){
		return chauffeurService.fetchListChauffeur();
	}
	@RequestMapping(value="/chauffeur/{id}",method=RequestMethod.GET)
	public Chauffeur getChauffeur(@PathVariable Long id){
		return chauffeurService.findById(id).orElse(null);
	}
	@RequestMapping(value="/chercherChauffeur",method=RequestMethod.GET)
	public Page<Chauffeur> chercher(
			@RequestParam(name="mc",defaultValue="")String mc,
			@RequestParam(name="page",defaultValue="0")int page,
			@RequestParam(name="size",defaultValue="5")int size){
		return chauffeurService.chercherChauffeur("%"+mc+"%",PageRequest.of(page,size));
	}
	
	@RequestMapping(value="/add-chauffeur",method=RequestMethod.POST)
	public Chauffeur save(@RequestBody ChauffeurDto c ){
		return chauffeurService.saveChauffeur(c);	
		
	}
	
	@RequestMapping(value="/delete-chauffeur/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		chauffeurService.deleteById(id);
		return true;
	}
	
	@RequestMapping(value="/update-chauffeur/{id}",method=RequestMethod.PUT)
	public Chauffeur save(@PathVariable Long id,@RequestBody ChauffeurDto c ){
		
		 return chauffeurService.updateChauffeur(id,c);
	}

}
