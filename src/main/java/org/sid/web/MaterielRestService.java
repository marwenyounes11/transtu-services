package org.sid.web;


import java.util.ArrayList;
import java.util.List;

import org.sid.dao.DepartementRepository;
import org.sid.dao.DepotRepository;
import org.sid.dao.MaterielRepository;
import org.sid.dao.TransportRepository;
import org.sid.dto.ExtincteurDto;
import org.sid.dto.LineDto;
import org.sid.dto.MaterielDto;
import org.sid.entities.Departement;
import org.sid.entities.Depot;
import org.sid.entities.Intervention;
import org.sid.entities.InterventionMateriel;
import org.sid.entities.Line;
import org.sid.entities.Materiel;
import org.sid.entities.Transport;
import org.sid.services.LineService;
import org.sid.services.MatrielService;
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
public class MaterielRestService {
	@Autowired
	private MatrielService materielService;
	@RequestMapping(value="/materiel",method=RequestMethod.GET)
	public List<Materiel> getMateriel(){
		return materielService.fetchListMateriel();
	}
	@RequestMapping(value="/materiel/{id}",method=RequestMethod.GET)
	public Materiel getMateriel(@PathVariable Long id){
		return materielService.findById(id).orElse(null);
	}
	@RequestMapping(value="/chercherMateriel",method=RequestMethod.GET)
	public Page<Materiel> chercher(
			@RequestParam(name="mc",defaultValue="")String mc,
			@RequestParam(name="page",defaultValue="0")int page,
			@RequestParam(name="size",defaultValue="5")int size){
		return materielService.chercherMateriel("%"+mc+"%",PageRequest.of(page,size));
	}
	
	@RequestMapping(value="/add-materiel",method=RequestMethod.POST)
	public Materiel save(@RequestBody MaterielDto m ){
		return materielService.saveMateriel(m);
	}
	
	@RequestMapping(value="/delete-materiel/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		materielService.deleteById(id);
		return true;
	}
	
	@RequestMapping(value="/update-materiel/{id}",method=RequestMethod.PUT)
	public Materiel save(@PathVariable Long id,@RequestBody MaterielDto l ){
		return materielService.updateMateriel(id, l);
	}
	
	  
}
