package org.sid.web;
import java.util.List;

import org.sid.services.DepartementService;
import org.sid.dto.DepartementDto;
import org.sid.entities.Departement;
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
public class DepartementRestService {
	@Autowired
	private DepartementService departementService;
	@RequestMapping(value="/departement",method=RequestMethod.GET)
	public List<Departement> getDepartement(){
		return departementService.fetchListDepartement();
	}
	@RequestMapping(value="/departement/{id}",method=RequestMethod.GET)
	public Departement getDepartement(@PathVariable Long id){
		return departementService.findById(id).orElse(null);
	}
	@RequestMapping(value="/chercherDepartement",method=RequestMethod.GET)
	public Page<Departement> chercher(
			@RequestParam(name="mc",defaultValue="")String mc,
			@RequestParam(name="page",defaultValue="0")int page,
			@RequestParam(name="size",defaultValue="5")int size){
		return departementService.chercherDepartement("%"+mc+"%",PageRequest.of(page,size));
	}
	
	@RequestMapping(value="/add-departement",method=RequestMethod.POST)
	public Departement save(@RequestBody DepartementDto d ){
		return departementService.saveDepartement(d);
	}
	
	@RequestMapping(value="/delete-departement/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		departementService.deleteById(id);
		return true;
	}
	
	@RequestMapping(value="/update-departement/{id}",method=RequestMethod.PUT)
	public Departement save(@PathVariable Long id,@RequestBody DepartementDto d ){
		
		return departementService.updateDepartement(id,d);
	}

}
