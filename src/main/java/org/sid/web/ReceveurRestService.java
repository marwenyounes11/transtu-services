package org.sid.web;

import java.util.List;

import org.sid.dao.ReceveurRepository ;
import org.sid.dto.ReceveurDto;
import org.sid.entities.Chauffeur;
import org.sid.entities.Receveur;
import org.sid.services.ReceveurService;
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

public class ReceveurRestService {
	@Autowired
	private ReceveurService receveurService ;
	@RequestMapping(value="/receveur",method=RequestMethod.GET)
	public List<Receveur> getReceveur(){
		return receveurService.fetchListReceveur();
	}
	@RequestMapping(value="/receveur/{id}",method=RequestMethod.GET)
	public Receveur getReceveur(@PathVariable Long id){
		return receveurService.findById(id).orElse(null);
	}
	@RequestMapping(value="/chercherReceveur",method=RequestMethod.GET)
	public Page<Receveur> chercher(
			@RequestParam(name="mc",defaultValue="")String mc,
			@RequestParam(name="page",defaultValue="0")int page,
			@RequestParam(name="size",defaultValue="5")int size){
		return receveurService.chercherReceveur("%"+mc+"%",PageRequest.of(page,size));
	}
	
	@RequestMapping(value="/add-receveur",method=RequestMethod.POST)
	public Receveur save(@RequestBody ReceveurDto r ){
		 
		return receveurService.saveReceveur(r);
	}
	
	@RequestMapping(value="/delete-receveur/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		receveurService.deleteById(id);
		return true;
	}
	
	@RequestMapping(value="/update-receveur/{id}",method=RequestMethod.PUT)
	public Receveur save(@PathVariable Long id,@RequestBody ReceveurDto r ){
		 

		return receveurService.updateReceveur(id,r);
	}


}
