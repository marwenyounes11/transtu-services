package org.sid.web;

import java.util.List;


import org.sid.entities.Responsable;
import org.sid.services.ResponsableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class ResponsableRestService {
	@Autowired
	private ResponsableService responsableService ;
	@RequestMapping(value="/responsable",method=RequestMethod.GET)
	public List<Responsable> getResponsable(){
		return responsableService.fetchListResponsable();
	}
	@RequestMapping(value="/responsable/{id}",method=RequestMethod.GET)
	public Responsable getResponsable(@PathVariable Long id){
		return responsableService.findById(id).orElse(null);
	}
	
	@RequestMapping(value="/add-responsable",method=RequestMethod.POST)
	public Responsable save(@RequestBody Responsable r ){
		return responsableService.saveResponsable(r);
	}
	
	@RequestMapping(value="/delete-responsable/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		responsableService.deleteById(id);
		return true;
	}
	
	@RequestMapping(value="/update-responsable/{id}",method=RequestMethod.PUT)
	public Responsable save(@PathVariable Long id,@RequestBody Responsable r ){
		return responsableService.updateResponsable(id,r);
	}

}
