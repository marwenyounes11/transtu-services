package org.sid.web;

import java.util.List;

import org.sid.dao.AccidentAmbulancierRepository;

import org.sid.dto.AccidentAmbulancierDto;
import org.sid.dto.AccidentTransportDto;
import org.sid.entities.AccidentAmbulancier;
import org.sid.services.AccidentAmbulancierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class AccidentAmbulancierRestService {
	@Autowired
	private AccidentAmbulancierRepository accidentAmbulancierRepository ;
	@Autowired
	private AccidentAmbulancierService accidentAmbulancierService;
	@RequestMapping(value="/accidentambulancier",method=RequestMethod.GET)
	public List<AccidentAmbulancier> getAccAmbulancier(){
		return accidentAmbulancierService.fetchListAccidentAmbulancier();
	}
	@RequestMapping(value="/accidentambulancier/{id}",method=RequestMethod.GET)
	public AccidentAmbulancier getAccidentAmbulancier(@PathVariable Long id){
		return accidentAmbulancierService.findById(id).orElse(null);
	}
	@RequestMapping(value="/accidentambulancier",method=RequestMethod.POST)
	public AccidentAmbulancier save(@RequestBody AccidentAmbulancierDto a ){
		return accidentAmbulancierService.saveAccidentAmbulancier(a);
	}
	
	@RequestMapping(value="/accidentambulancier/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		accidentAmbulancierService.deleteById(id);
		return true;
	}
	
	@RequestMapping(value="/accidentambulancier/{id}",method=RequestMethod.PUT)
	public AccidentAmbulancier save(@PathVariable Long id,@RequestBody AccidentAmbulancierDto a ){
		return accidentAmbulancierService.updateAccidentAmbulancier(id, a);
	}
}
