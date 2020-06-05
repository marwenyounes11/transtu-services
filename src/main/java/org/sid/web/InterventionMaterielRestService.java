package org.sid.web;

import java.util.List;

import org.sid.dao.InterventionMaterielRepository;
import org.sid.dto.InterventionDto;
import org.sid.dto.InterventionMaterielDto;
import org.sid.entities.Intervention;
import org.sid.entities.InterventionMateriel;
import org.sid.services.InterventionMaterielService;
import org.sid.services.InterventionService;
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

public class InterventionMaterielRestService {
	@Autowired
	private InterventionMaterielService interventionmaterielService ;
	
	 
	@RequestMapping(value="/interventionmateriel",method=RequestMethod.GET)
	public List<InterventionMateriel> getInterventionMateriel(){
		return interventionmaterielService.fetchListInterventionMateriel();
	}
	@RequestMapping(value="/interventionmateriel/{id}",method=RequestMethod.GET)
	public InterventionMateriel getInterventionMateriel(@PathVariable Long id){
		return interventionmaterielService.findById(id).orElse(null);
	}
	
	
	@RequestMapping(value="/add-interventionmateriel",method=RequestMethod.POST)
	public InterventionMateriel save(@RequestBody InterventionMaterielDto i ){
		return interventionmaterielService.saveInterventionMateriel(i);	
		
	}
	
	@RequestMapping(value="/delete-interventionmateriel/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		interventionmaterielService.deleteById(id);
		return true;
	}
	
	@RequestMapping(value="/update-interventionmateriel/{id}",method=RequestMethod.PUT)
	public InterventionMateriel save(@PathVariable Long id,@RequestBody InterventionMaterielDto i ){
		
		 return interventionmaterielService.updateInterventionMateriel(id,i);
	}
}
