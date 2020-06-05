package org.sid.web;

import java.util.List;


import org.sid.dto.TransportTypeDto;

import org.sid.entities.TransportType;

import org.sid.services.TransportTypeService;
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
public class TransportTypeRestService {
	@Autowired
	private TransportTypeService transporttypeService;
	@RequestMapping(value="/transporttype",method=RequestMethod.GET)
	public List<TransportType> getTransportType(){
		return transporttypeService.fetchListTransportType();
	}
	@RequestMapping(value="/transporttype/{id}",method=RequestMethod.GET)
	public TransportType getTransportType(@PathVariable Long id){
		return transporttypeService.findById(id).orElse(null);
	}
	@RequestMapping(value="/chercherTransportType",method=RequestMethod.GET)
	public Page<TransportType> chercher(
			@RequestParam(name="mc",defaultValue="")String mc,
			@RequestParam(name="page",defaultValue="0")int page,
			@RequestParam(name="size",defaultValue="5")int size){
		return transporttypeService.chercherTransportType("%"+mc+"%",PageRequest.of(page,size));
	}
	
	@RequestMapping(value="/add-transporttype",method=RequestMethod.POST)
	public TransportType save(@RequestBody TransportTypeDto t ){
		return transporttypeService.saveTransportType(t);
	}
	
	@RequestMapping(value="/delete-transporttype/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		transporttypeService.deleteById(id);
		return true;
	}
	
	@RequestMapping(value="/update-transporttype/{id}",method=RequestMethod.PUT)
	public TransportType save(@PathVariable Long id,@RequestBody TransportTypeDto t ){
		return transporttypeService.updateTransportType(id, t);
	}
}
