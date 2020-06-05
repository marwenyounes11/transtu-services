package org.sid.web;

import java.util.List;

import org.sid.dao.LineRepository;
import org.sid.dto.LineDto;
import org.sid.entities.Line;
import org.sid.services.LineService;
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
public class LineRest {
	@Autowired
	private LineService lineService;
	@RequestMapping(value="/line",method=RequestMethod.GET)
	public List<Line> getLine(){
		return lineService.fetchListLine();
	}
	@RequestMapping(value="/line/{id}",method=RequestMethod.GET)
	public Line getLine(@PathVariable Long id){
		return lineService.findById(id).orElse(null);
	}
	@RequestMapping(value="/chercherLine",method=RequestMethod.GET)
	public Page<Line> chercher(
			@RequestParam(name="mc",defaultValue="")String mc,
			@RequestParam(name="page",defaultValue="0")int page,
			@RequestParam(name="size",defaultValue="5")int size){
		return lineService.chercherLine("%"+mc+"%",PageRequest.of(page,size));
	}
	
	@RequestMapping(value="/add-line",method=RequestMethod.POST)
	public Line save(@RequestBody LineDto l ){
		return lineService.saveLine(l);
	}
	
	@RequestMapping(value="/delete-line/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		lineService.deleteById(id);
		return true;
	}
	
	@RequestMapping(value="/update-line/{id}",method=RequestMethod.PUT)
	public Line save(@PathVariable Long id,@RequestBody LineDto l ){
		return lineService.updateLine(id, l);
	}
}
