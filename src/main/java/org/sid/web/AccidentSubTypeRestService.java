package org.sid.web;

import java.util.List;

import org.sid.dto.AccidentSubTypeDto;
import org.sid.entities.AccidentSubType;
import org.sid.services.AccidentSubTypeService;
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
public class AccidentSubTypeRestService {
	@Autowired
	private AccidentSubTypeService accidentSubTypeService;
	@RequestMapping(value="/list-accidentsubtype",method=RequestMethod.GET)
	public List<AccidentSubType> getAccidentSubType(){
		return accidentSubTypeService.fetchListAccidentSubType();
	}
	@RequestMapping(value="/accidentsubtype/{id}",method=RequestMethod.GET)
	public AccidentSubType getAccidentSubType(@PathVariable Long id){
		return accidentSubTypeService.findById(id).orElse(null);
	}
	
	@RequestMapping(value="/chercher-accidentsubtype",method=RequestMethod.GET)
	public Page<AccidentSubType> chercher(
			@RequestParam(name="mc",defaultValue="") String mc,
			@RequestParam(name="page",defaultValue="0") int page,
			@RequestParam(name="size",defaultValue="5") int size){
		return accidentSubTypeService.chercherAccidentSubType("%"+mc+"%",PageRequest.of(page,size));
	}
	
	@RequestMapping(value="/accidentsubtype",method=RequestMethod.POST)
	public AccidentSubType save(@RequestBody AccidentSubTypeDto at ){
		return accidentSubTypeService.saveAccidentSubType(at);
	}
	
	@RequestMapping(value="/accidentsubtype/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		accidentSubTypeService.deleteById(id);
		return true;
	}
	
	@RequestMapping(value="/accidentsubtype/{id}",method=RequestMethod.PUT)
	public AccidentSubType save(@PathVariable Long id,@RequestBody AccidentSubTypeDto accidentsubtype ){	
		return accidentSubTypeService.updateAccidentSubType(id, accidentsubtype);
	}

}
