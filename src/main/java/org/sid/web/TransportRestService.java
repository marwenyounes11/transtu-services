package org.sid.web;

import java.util.List;




import org.sid.dto.TransportDto;


import org.sid.entities.Transport;

import org.sid.services.TransportService;

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
public class TransportRestService {
	@Autowired
	private TransportService transportService;
	@RequestMapping(value="/transport",method=RequestMethod.GET)
	public List<Transport> getTransport(){
		return transportService.fetchListTransport();
	}
	@RequestMapping(value="/transport/{id}",method=RequestMethod.GET)
	public Transport getTransport(@PathVariable Long id){
		return transportService.findById(id).orElse(null);
	}
	@RequestMapping(value="/chercherTransport",method=RequestMethod.GET)
	public Page<Transport> chercher(
			@RequestParam(name="mc",defaultValue="")String mc,
			@RequestParam(name="page",defaultValue="0")int page,
			@RequestParam(name="size",defaultValue="5")int size){
		return transportService.chercherTransport("%"+mc+"%",PageRequest.of(page,size));
	}
	
	@RequestMapping(value="/add-transport",method=RequestMethod.POST)
	public Transport save(@RequestBody TransportDto t ){
		return transportService.saveTransport(t);
	}
	
	@RequestMapping(value="/delete-transport/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		transportService.deleteById(id);
		return true;
	}
	
	@RequestMapping(value="/update-transport/{id}",method=RequestMethod.PUT)
	public Transport save(@PathVariable Long id,@RequestBody TransportDto t ){
		return transportService.updateTransport(id, t);
	}
	}

