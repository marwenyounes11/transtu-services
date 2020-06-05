package org.sid.web;
import java.util.List;


import org.sid.dao.DegatVictimeRepository;
import org.sid.dto.DegatTransportDto;
import org.sid.dto.DegatVictimeDto;
import org.sid.entities.DegatTransport;
import org.sid.entities.DegatVictime;
import org.sid.services.DegatTransportService;
import org.sid.services.DegatVictimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin(origins = "*")
public class DegatVictimeRestService {
	@Autowired
	private DegatVictimeService degatVictimeService;
	@RequestMapping(value="/degatvictime",method=RequestMethod.GET)
	public List<DegatVictime> getDegatVictime(){
		return degatVictimeService.fetchListDegatVictime();
	}
	@RequestMapping(value="/degatvictime/{id}",method=RequestMethod.GET)
	public DegatVictime getDegatVictime(@PathVariable Long id){
		return degatVictimeService.findById(id).orElse(null);
	}
	
	
	@RequestMapping(value="/degatvictime",method=RequestMethod.POST)
	public DegatVictime save(@RequestBody DegatVictimeDto d ){
		return degatVictimeService.saveDegatVictime(d);
	}
	
	@RequestMapping(value="/degatvictime/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		degatVictimeService.deleteById(id);
		return true;
	}
	
	@RequestMapping(value="/degatvictime/{id}",method=RequestMethod.PUT)
	public DegatVictime save(@PathVariable Long id,@RequestBody DegatVictimeDto a ){
		return degatVictimeService.updateDegatVictime(id, a);
	}
}
