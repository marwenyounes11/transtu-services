package org.sid.web;

import java.util.List;


import org.sid.dto.DegatTypeDto;
import org.sid.entities.DegatType;
import org.sid.services.DegatTypeService;
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
public class DegatTypeRestService {
	@Autowired
	private DegatTypeService degattypeService;
	@RequestMapping(value="/degattype",method=RequestMethod.GET)
	public List<DegatType> getDegatType(){
		return degattypeService.fetchListDegatType();
	}
	@RequestMapping(value="/degattype/{id}",method=RequestMethod.GET)
	public DegatType getDegatType(@PathVariable Long id){
		return degattypeService.findById(id).orElse(null);
	}
	@RequestMapping(value="/chercherDegatType",method=RequestMethod.GET)
	public Page<DegatType> chercher(
			@RequestParam(name="mc",defaultValue="")String mc,
			@RequestParam(name="page",defaultValue="0")int page,
			@RequestParam(name="size",defaultValue="5")int size){
		return degattypeService.chercherDegatType("%"+mc+"%",PageRequest.of(page,size));
	}
	
	@RequestMapping(value="/add-degattype",method=RequestMethod.POST)
	public DegatType save(@RequestBody DegatTypeDto d ){
		return degattypeService.saveDegatType(d);
	}
	
	@RequestMapping(value="/delete-degattype/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		degattypeService.deleteById(id);
		return true;
	}
	
	@RequestMapping(value="/update-degattype/{id}",method=RequestMethod.PUT)
	public DegatType save(@PathVariable Long id,@RequestBody DegatTypeDto a ){
		return degattypeService.updateDegatType(id, a);
	}
}
