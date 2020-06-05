package org.sid.web;


import java.util.List;




import org.sid.dto.AccidentDto;


import org.sid.entities.Accident;

import org.sid.services.AccidentService;

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
public class AccidentRestService {
	
	@Autowired
	private AccidentService accidentService;
	@RequestMapping(value="/list-accidents",method=RequestMethod.GET)
	public List<Accident> getAccident(){
		return accidentService.fetchListAccident();
	}
	@RequestMapping(value="/accident/{id}",method=RequestMethod.GET)
	public Accident getAccident(@PathVariable Long id){
		return accidentService.findById(id).orElse(null);
	}
	@RequestMapping(value="/chercherAccident",method=RequestMethod.GET)
	public Page<Accident> chercher(
			@RequestParam(name="mc",defaultValue="")String mc,
			@RequestParam(name="page",defaultValue="0")int page,
			@RequestParam(name="size",defaultValue="5")int size){
		return accidentService.chercherAccident("%"+mc+"%",PageRequest.of(page,size));
	}
	
	@RequestMapping(value="/add-accident",method=RequestMethod.POST)
	public Accident save(@RequestBody AccidentDto a ){
		return accidentService.saveAccident(a);
	}
	
	@RequestMapping(value="/delete-accident/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		accidentService.deleteById(id);
		return true;
	}
	
	@RequestMapping(value="/update-accident/{id}",method=RequestMethod.PUT)
	public Accident save(@PathVariable Long id,@RequestBody AccidentDto a ){
		return accidentService.updateAccident(id, a);
	}
}
