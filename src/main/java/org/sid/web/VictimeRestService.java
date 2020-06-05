package org.sid.web;

import java.util.List;

import org.sid.dao.AccidentRepository;
import org.sid.dao.DegatVictimeRepository;
import org.sid.services.VictimeService;
import org.sid.dto.VictimeDto;
import org.sid.entities.DegatVictime;
import org.sid.entities.Victime;
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
public class VictimeRestService {
	@Autowired
	private VictimeService victimeService;
	@Autowired
	private DegatVictimeRepository degatVictimeRepository;
	@Autowired
	private AccidentRepository accidentRepository;
	private DegatVictime degatVictime;
	@RequestMapping(value="/victime",method=RequestMethod.GET)
	public List<Victime> getVictime(){
		return victimeService.fetchListVictime();
	}
	
	@RequestMapping(value="/victime/{id}",method=RequestMethod.GET)
	public VictimeDto getVictime(@PathVariable Long id){
		
	return victimeService.findById(id);
	}
	@RequestMapping(value="/chercherVictime",method=RequestMethod.GET)
	public Page<Victime> chercher(
			@RequestParam(name="mc",defaultValue="")String mc,
			@RequestParam(name="page",defaultValue="0")int page,
			@RequestParam(name="size",defaultValue="5")int size){
		return victimeService.chercherVictime("%"+mc+"%",PageRequest.of(page,size));
	}
	
	@RequestMapping(value="/add-Victime",method=RequestMethod.POST)
	public Boolean save(@RequestBody VictimeDto v ){
		
		 return victimeService.saveVictime(v);
	}
	
	@RequestMapping(value="/delete-victime/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		victimeService.deleteById(id);
		return true;
	}
	
	@RequestMapping(value="/update-victime/{id}",method=RequestMethod.PUT)
	public Victime update(@PathVariable Long id,@RequestBody VictimeDto v){
		
		  return victimeService.updateVictime(id,v);
	}

}
