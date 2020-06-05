package org.sid.web;

import java.util.List;

import org.sid.services.SourceInfoService  ;
import org.sid.dto.SourceInfoDto;
import org.sid.entities.SourceInfo;
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
public class SourceInfoRestService {
	@Autowired
	private SourceInfoService  sourceInfoService  ;
	@RequestMapping(value="/sourceInfo",method=RequestMethod.GET)
	public List<SourceInfo> getSourceInfo(){
		return sourceInfoService.fetchListSourceInfo();
	}
	@RequestMapping(value="/sourceInfo/{id}",method=RequestMethod.GET)
	public SourceInfo getSourceInfo(@PathVariable Long id){
		return sourceInfoService.findById(id).orElse(null);
	}
	@RequestMapping(value="/chercherSourceInfo",method=RequestMethod.GET)
	public Page<SourceInfo> chercher(
			@RequestParam(name="mc",defaultValue="")String mc,
			@RequestParam(name="page",defaultValue="0")int page,
			@RequestParam(name="size",defaultValue="5")int size){
		return sourceInfoService.chercherSourceInfo("%"+mc+"%",PageRequest.of(page,size));
	}
	
	@RequestMapping(value="/add-sourceInfo",method=RequestMethod.POST)
	public SourceInfo save(@RequestBody SourceInfoDto s ){
		return sourceInfoService.saveSourceInfo(s);
	}
	
	@RequestMapping(value="/delete-sourceInfo/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		sourceInfoService.deleteById(id);
		return true;
	}
	
	@RequestMapping(value="/update-sourceInfo/{id}",method=RequestMethod.PUT)
	public SourceInfo save(@PathVariable Long id,@RequestBody SourceInfoDto s ){
		return sourceInfoService.updateSourceInfo(id,s);
	}


}
