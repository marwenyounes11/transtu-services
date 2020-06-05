package org.sid.web;

import java.util.List;

import org.sid.services.RecordService;
import org.sid.dto.RecordDto;
import org.sid.entities.Record;
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

public class RecordRestService {
	@Autowired
	private RecordService recordService ;
	@RequestMapping(value="/record",method=RequestMethod.GET)
	public List<Record> getRecord(){
		return recordService.fetchListRecord();
	}
	@RequestMapping(value="/record/{id}",method=RequestMethod.GET)
	public Record getRecord(@PathVariable Long id){
		return recordService.findById(id).orElse(null);
	}
	@RequestMapping(value="/chercherRecord",method=RequestMethod.GET)
	public Page<Record> chercher(
			@RequestParam(name="mc",defaultValue="")String mc,
			@RequestParam(name="page",defaultValue="0")int page,
			@RequestParam(name="size",defaultValue="5")int size){
		return recordService.chercherRecord("%"+mc+"%",PageRequest.of(page,size));
	}
	
	@RequestMapping(value="/add-record",method=RequestMethod.POST)
	public Record save(@RequestBody RecordDto r ){
		return recordService.saveRecord(r);
	}
	
	@RequestMapping(value="/delete-record/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		recordService.deleteById(id);
		return true;
	}
	
	@RequestMapping(value="/update-record/{id}",method=RequestMethod.PUT)
	public Record save(@PathVariable Long id,@RequestBody RecordDto r ){
		return recordService.updateRecord(id,r);
	}

}
