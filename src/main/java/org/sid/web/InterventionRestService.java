package org.sid.web;


import java.util.List;


import org.sid.services.InterventionService;

import org.sid.dto.InterventionDto;

import org.sid.entities.Intervention;


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
public class InterventionRestService {
	@Autowired
	private InterventionService interventionService ;
	
	 
	@RequestMapping(value="/intervention",method=RequestMethod.GET)
	public List<Intervention> getIntervention(){
		return interventionService.fetchListIntervention();
	}
	@RequestMapping(value="/intervention/{id}",method=RequestMethod.GET)
	public Intervention getIntervention(@PathVariable Long id){
		return interventionService.findById(id).orElse(null);
	}
	@RequestMapping(value="/chercherIntervention",method=RequestMethod.GET)
	public Page<Intervention> chercher(
			@RequestParam(name="mc",defaultValue="")String mc,
			@RequestParam(name="page",defaultValue="0")int page,
			@RequestParam(name="size",defaultValue="5")int size){
		return interventionService.chercherIntervention("%"+mc+"%",PageRequest.of(page,size));
	}
	
	@RequestMapping(value="/add-intervention",method=RequestMethod.POST)
	public Intervention save(@RequestBody InterventionDto i ){
		return interventionService.saveIntervention(i);	
		
	}
	
	@RequestMapping(value="/delete-intervention/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		interventionService.deleteById(id);
		return true;
	}
	
	@RequestMapping(value="/update-intervention/{id}",method=RequestMethod.PUT)
	public Intervention save(@PathVariable Long id,@RequestBody InterventionDto i ){
		
		 return interventionService.updateIntervention(id,i);
	}


}
