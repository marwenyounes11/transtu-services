package org.sid.web;

import java.util.List;

import org.sid.dao.GroupLineRepository;
import org.sid.entities.GroupLine;
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
public class GroupLineRestService {
	@Autowired
	private GroupLineRepository groupLineRepository;
	@RequestMapping(value="/groupLine",method=RequestMethod.GET)
	public List<GroupLine> getGroupLine(){
		return groupLineRepository.findAll();
	}
	@RequestMapping(value="/groupLine/{id}",method=RequestMethod.GET)
	public GroupLine getGroupLine(@PathVariable Long id){
		return groupLineRepository.findById(id).orElse(null);
	}
	@RequestMapping(value="/chercherGroupLine",method=RequestMethod.GET)
	public Page<GroupLine> chercher(
			@RequestParam(name="mc",defaultValue="")String mc,
			@RequestParam(name="page",defaultValue="0")int page,
			@RequestParam(name="size",defaultValue="5")int size){
		return groupLineRepository.chercherGroupLine("%"+mc+"%",PageRequest.of(page,size));
	}
	
	@RequestMapping(value="/groupLine",method=RequestMethod.POST)
	public GroupLine save(@RequestBody GroupLine g ){
		return groupLineRepository.save(g);
	}
	
	@RequestMapping(value="/groupLine/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		groupLineRepository.deleteById(id);
		return true;
	}
	
	@RequestMapping(value="/groupLine/{id}",method=RequestMethod.PUT)
	public GroupLine save(@PathVariable Long id,@RequestBody GroupLine g ){
		g.setId(id);
		return groupLineRepository.save(g);
	}
}
