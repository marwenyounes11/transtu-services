package org.sid.web;

import java.util.List;

import org.sid.entities.Ambulancier;
import org.sid.services.AmbulancierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin(origins = "*")
public class AmbulancierRestService {
	@Autowired
	private AmbulancierService ambulancierService ;
	@RequestMapping(value="/ambulancier",method=RequestMethod.GET)
	public List<Ambulancier> getAmbulancier(){
		return ambulancierService.fetchListAmbulancier();
	}
	@RequestMapping(value="/ambulancier/{id}",method=RequestMethod.GET)
	public Ambulancier getAmbulancier(@PathVariable Long id){
		return ambulancierService.findById(id).orElse(null);
	}
	
	@RequestMapping(value="/add-ambulancier",method=RequestMethod.POST)
	public Ambulancier save(@RequestBody Ambulancier a ){
		return ambulancierService.saveAmbulancier(a);
	}
	
	@RequestMapping(value="/delete-ambulancier/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		ambulancierService.deleteById(id);
		return true;
	}
	
	@RequestMapping(value="/update-ambulancier/{id}",method=RequestMethod.PUT)
	public Ambulancier save(@PathVariable Long id,@RequestBody Ambulancier a ){
		return ambulancierService.updateAmbulancier(id,a);
	}

}
