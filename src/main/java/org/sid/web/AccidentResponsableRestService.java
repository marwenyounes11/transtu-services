package org.sid.web;

import java.util.List;


import org.sid.dao.AccidentResponsableRepository;

import org.sid.dto.AccidentResponsableDto;

import org.sid.entities.AccidentResponsable;

import org.sid.services.AccidentResponsableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class AccidentResponsableRestService {
	@Autowired
	private AccidentResponsableRepository accidentResponsableRepository ;
	@Autowired
	private AccidentResponsableService accidentResponsableService;
	@RequestMapping(value="/accidentresponsable",method=RequestMethod.GET)
	public List<AccidentResponsable> getAccResponsable(){
		return accidentResponsableService.fetchListAccidentResponsable();
	}
	@RequestMapping(value="/accidentresponsable/{id}",method=RequestMethod.GET)
	public AccidentResponsable getAccidentResponsable(@PathVariable Long id){
		return accidentResponsableService.findById(id).orElse(null);
	}
	@RequestMapping(value="/accidentresponsable",method=RequestMethod.POST)
	public AccidentResponsable save(@RequestBody AccidentResponsableDto a ){
		return accidentResponsableService.saveAccidentResponsable(a);
	}
	
	@RequestMapping(value="/accidentresponsable/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		accidentResponsableService.deleteById(id);
		return true;
	}
	
	@RequestMapping(value="/accidentresponsable/{id}",method=RequestMethod.PUT)
	public AccidentResponsable save(@PathVariable Long id,@RequestBody AccidentResponsableDto a ){
		return accidentResponsableService.updateAccidentResponsable(id, a);
	}
}
