package org.sid.web;

import java.util.List;

import org.sid.entities.Securite;
import org.sid.services.SecuriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin(origins = "*")
public class SecuriteRestService {
	@Autowired
	private SecuriteService securiteService ;
	@RequestMapping(value="/securite",method=RequestMethod.GET)
	public List<Securite> getSecurite(){
		return securiteService.fetchListSecurite();
	}
	@RequestMapping(value="/securite/{id}",method=RequestMethod.GET)
	public Securite getSecurite(@PathVariable Long id){
		return securiteService.findById(id).orElse(null);
	}
	
	@RequestMapping(value="/add-securite",method=RequestMethod.POST)
	public Securite save(@RequestBody Securite s ){
		return securiteService.saveSecurite(s);
	}
	
	@RequestMapping(value="/delete-securite/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		securiteService.deleteById(id);
		return true;
	}
	
	@RequestMapping(value="/update-securite/{id}",method=RequestMethod.PUT)
	public Securite save(@PathVariable Long id,@RequestBody Securite s ){
		return securiteService.updateSecurite(id,s);
	}

}
