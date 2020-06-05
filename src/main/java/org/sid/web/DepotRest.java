package org.sid.web;

import java.util.List;

import org.sid.dto.DepotDto;
import org.sid.entities.Depot;
import org.sid.services.DepotService;
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
public class DepotRest {

	@Autowired
	private DepotService depotService;
	@RequestMapping(value="/list-depot",method=RequestMethod.GET)
	public List<Depot> getDepot(){
		return depotService.fetchListDepot();
	}
	@RequestMapping(value="/depot/{id}",method=RequestMethod.GET)
	public Depot getDepot(@PathVariable Long id){
		return depotService.findById(id).orElse(null);
	}
	
	@RequestMapping(value="/chercher-depot",method=RequestMethod.GET)
	public Page<Depot> chercher(
			@RequestParam(name="mc",defaultValue="") String mc,
			@RequestParam(name="page",defaultValue="0") int page,
			@RequestParam(name="size",defaultValue="5") int size){
		return depotService.chercherDepot("%"+mc+"%",PageRequest.of(page,size));
	}
	
	@RequestMapping(value="/depot",method=RequestMethod.POST)
	public Depot save(@RequestBody DepotDto d ){
		return depotService.saveDepot(d);
	}
	
	@RequestMapping(value="/depot/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		depotService.deleteById(id);
		return true;
	}
	
	@RequestMapping(value="/depot/{id}",method=RequestMethod.PUT)
	public Depot save(@PathVariable Long id,@RequestBody DepotDto dpot ){	
		return depotService.updateDepot(id, dpot);
	}



}
