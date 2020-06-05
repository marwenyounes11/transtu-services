package org.sid.web;

import java.util.List;

import org.sid.services.EmplacementService;
import org.sid.dto.EmplacementDto;
import org.sid.entities.Emplacement;
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
public class EmplacementRestService {
	@Autowired
	private EmplacementService emplacementService;
	@RequestMapping(value="/list-emplacement",method=RequestMethod.GET)
	public List<Emplacement> getEmplacement(){
		return emplacementService.fetchListEmplacement();
	}
	@RequestMapping(value="/emplacement/{id}",method=RequestMethod.GET)
	public Emplacement getEmplacement(@PathVariable Long id){
		return emplacementService.findById(id).orElse(null);
	}
	@RequestMapping(value="/chercherEmplacement",method=RequestMethod.GET)
	public Page<Emplacement> chercher(
			@RequestParam(name="mc",defaultValue="")String mc,
			@RequestParam(name="page",defaultValue="0")int page,
			@RequestParam(name="size",defaultValue="5")int size){
		return emplacementService.chercherEmplacement("%"+mc+"%",PageRequest.of(page,size));
	}
	
	@RequestMapping(value="/add-emplacement",method=RequestMethod.POST)
	public Emplacement save(@RequestBody EmplacementDto e ){
		return emplacementService.saveEmplacement(e);
	}
	
	@RequestMapping(value="/emplacement/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		emplacementService.deleteById(id);
		return true;
	}
	
	@RequestMapping(value="/emplacement/{id}",method=RequestMethod.PUT)
	public Emplacement save(@PathVariable Long id,@RequestBody EmplacementDto e ){
		return emplacementService.updateEmplacement(id,e);
	}


}
