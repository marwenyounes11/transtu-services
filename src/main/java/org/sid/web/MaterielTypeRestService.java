package org.sid.web;

import java.util.List;

import org.sid.dto.MaterialTypeDto;
import org.sid.entities.MaterialType;
import org.sid.services.MaterialTypeService;
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
public class MaterielTypeRestService {
	@Autowired
	private MaterialTypeService materieltypeService;
	@RequestMapping(value="/materieltype",method=RequestMethod.GET)
	public List<MaterialType> getMaterielType(){
		return materieltypeService.fetchListMaterialType();
	}
	@RequestMapping(value="/materieltype/{id}",method=RequestMethod.GET)
	public MaterialType getMaterielType(@PathVariable Long id){
		return materieltypeService.findById(id).orElse(null);
	}
	@RequestMapping(value="/chercherMaterieltype",method=RequestMethod.GET)
	public Page<MaterialType> chercher(
			@RequestParam(name="mc",defaultValue="")String mc,
			@RequestParam(name="page",defaultValue="0")int page,
			@RequestParam(name="size",defaultValue="5")int size){
		return materieltypeService.chercherMaterialType("%"+mc+"%",PageRequest.of(page,size));
	}
	
	@RequestMapping(value="/add-materieltype",method=RequestMethod.POST)
	public MaterialType save(@RequestBody MaterialTypeDto m ){
		return materieltypeService.saveMaterialType(m);
	}
	
	@RequestMapping(value="/delete-materieltype/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		materieltypeService.deleteById(id);
		return true;
	}
	
	@RequestMapping(value="/update-materieltype/{id}",method=RequestMethod.PUT)
	public MaterialType save(@PathVariable Long id,@RequestBody MaterialTypeDto l ){
		return materieltypeService.updateMaterialType(id, l);
	}
	
}
