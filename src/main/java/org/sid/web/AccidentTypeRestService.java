package org.sid.web;

import java.util.List;

import org.sid.dto.AccidentTypeDto;
import org.sid.entities.AccidentType;
import org.sid.services.AccidentTypeService;
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
public class AccidentTypeRestService {
	@Autowired
	private AccidentTypeService accidentTypeService;
	@RequestMapping(value="/list-accidenttype",method=RequestMethod.GET)
	public List<AccidentType> getAccidentType(){
		return accidentTypeService.fetchListAccidentType();
	}
	@RequestMapping(value="/accidenttype/{id}",method=RequestMethod.GET)
	public AccidentType getAccidentType(@PathVariable Long id){
		return accidentTypeService.findById(id).orElse(null);
	}
	
	@RequestMapping(value="/chercher-accidenttype",method=RequestMethod.GET)
	public Page<AccidentType> chercher(
			@RequestParam(name="mc",defaultValue="") String mc,
			@RequestParam(name="page",defaultValue="0") int page,
			@RequestParam(name="size",defaultValue="5") int size){
		return accidentTypeService.chercherAccidentType("%"+mc+"%",PageRequest.of(page,size));
	}
	
	@RequestMapping(value="/accidenttype",method=RequestMethod.POST)
	public AccidentType save(@RequestBody AccidentTypeDto at ){
		return accidentTypeService.saveAccidentType(at);
	}
	
	@RequestMapping(value="/accidenttype/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		accidentTypeService.deleteById(id);
		return true;
	}
	
	@RequestMapping(value="/accidenttype/{id}",method=RequestMethod.PUT)
	public AccidentType save(@PathVariable Long id,@RequestBody AccidentTypeDto accidenttype ){	
		return accidentTypeService.updateAccidentType(id, accidenttype);
	}

}
