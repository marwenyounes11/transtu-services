package org.sid.web;

import java.util.List;

import org.sid.dao.AccidentSecuriteRepository;
import org.sid.dto.AccidentSecuriteDto;
import org.sid.entities.AccidentSecurite;
import org.sid.services.AccidentSecuriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class AccidentSecuriteRestService {
	
	@Autowired
	private AccidentSecuriteService accidentSecuriteService;
	@RequestMapping(value="/accidentsecurite",method=RequestMethod.GET)
	public List<AccidentSecurite> getAccSecurite(){
		return accidentSecuriteService.fetchListAccidentSecurite();
	}
	@RequestMapping(value="/accidentsecurite/{id}",method=RequestMethod.GET)
	public AccidentSecurite getAccidentSecurite(@PathVariable Long id){
		return accidentSecuriteService.findById(id).orElse(null);
	}
	@RequestMapping(value="/accidentsecurite",method=RequestMethod.POST)
	public AccidentSecurite save(@RequestBody AccidentSecuriteDto a ){
		return accidentSecuriteService.saveAccidentSecurite(a);
	}
	
	@RequestMapping(value="/accidentsecurite/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		accidentSecuriteService.deleteById(id);
		return true;
	}
	
	@RequestMapping(value="/accidentsecurite/{id}",method=RequestMethod.PUT)
	public AccidentSecurite save(@PathVariable Long id,@RequestBody AccidentSecuriteDto a ){
		return accidentSecuriteService.updateAccidentSecurite(id, a);
	}
}
