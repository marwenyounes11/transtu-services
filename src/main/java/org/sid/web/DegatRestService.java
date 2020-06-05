package org.sid.web;

import java.util.List;




import org.sid.dto.DegatDto;


import org.sid.entities.Degat;

import org.sid.services.DegatService;

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
public class DegatRestService {
	@Autowired
	private DegatService degatService;
	@RequestMapping(value="/degat",method=RequestMethod.GET)
	public List<Degat> getDegat(){
		return degatService.fetchListDegat();
	}
	@RequestMapping(value="/degat/{id}",method=RequestMethod.GET)
	public Degat getDegat(@PathVariable Long id){
		return degatService.findById(id).orElse(null);
	}
	@RequestMapping(value="/chercherDegat",method=RequestMethod.GET)
	public Page<Degat> chercher(
			@RequestParam(name="mc",defaultValue="")String mc,
			@RequestParam(name="page",defaultValue="0")int page,
			@RequestParam(name="size",defaultValue="5")int size){
		return degatService.chercherDegat("%"+mc+"%",PageRequest.of(page,size));
	}
	
	@RequestMapping(value="/add-degat",method=RequestMethod.POST)
	public Degat save(@RequestBody DegatDto d ){
		return degatService.saveDegat(d);
	}
	
	@RequestMapping(value="/delete-degat/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		degatService.deleteById(id);
		return true;
	}
	
	@RequestMapping(value="/update-degat/{id}",method=RequestMethod.PUT)
	public Degat save(@PathVariable Long id,@RequestBody DegatDto a ){
		return degatService.updateDegat(id, a);
	}
}
