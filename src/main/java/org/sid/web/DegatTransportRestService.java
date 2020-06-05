package org.sid.web;

import java.util.List;


import org.sid.dao.DegatTransportRepository;
import org.sid.dto.DegatDto;
import org.sid.dto.DegatTransportDto;
import org.sid.entities.Degat;
import org.sid.entities.DegatTransport;
import org.sid.services.DegatService;
import org.sid.services.DegatTransportService;
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

public class DegatTransportRestService {
	@Autowired
	private DegatTransportService degatTransportService;
	@RequestMapping(value="/degattransport",method=RequestMethod.GET)
	public List<DegatTransport> getDegatTransport(){
		return degatTransportService.fetchListDegatTransport();
	}
	@RequestMapping(value="/degattransport/{id}",method=RequestMethod.GET)
	public DegatTransport getDegatTransport(@PathVariable Long id){
		return degatTransportService.findById(id).orElse(null);
	}
	
	
	@RequestMapping(value="/degattransport",method=RequestMethod.POST)
	public DegatTransport save(@RequestBody DegatTransportDto d ){
		return degatTransportService.saveDegatTransport(d);
	}
	
	@RequestMapping(value="/degattransport/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		degatTransportService.deleteById(id);
		return true;
	}
	
	@RequestMapping(value="/degattransport/{id}",method=RequestMethod.PUT)
	public DegatTransport save(@PathVariable Long id,@RequestBody DegatTransportDto a ){
		return degatTransportService.updateDegatTransport(id, a);
	}
}
