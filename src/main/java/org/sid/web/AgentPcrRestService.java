package org.sid.web;

import java.util.List;

import org.sid.services.AgentPcrService;
import org.sid.dto.AgentPcrDto;
import org.sid.entities.AgentPcr;
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
public class AgentPcrRestService {
	@Autowired
	private AgentPcrService agentPcrService;
	@RequestMapping(value="/agentPcr",method=RequestMethod.GET)
	public List<AgentPcr> getAgentPcr(){
		return agentPcrService.fetchListAgentPcr();
	}
	@RequestMapping(value="/agentPcr/{id}",method=RequestMethod.GET)
	public AgentPcr getAgentPcr(@PathVariable Long id){
		return agentPcrService.findById(id).orElse(null);
	}
	@RequestMapping(value="/chercherAgentPcr",method=RequestMethod.GET)
	public Page<AgentPcr> chercher(
			@RequestParam(name="mc",defaultValue="")String mc,
			@RequestParam(name="page",defaultValue="0")int page,
			@RequestParam(name="size",defaultValue="5")int size){
		return agentPcrService.chercherAgentPcr("%"+mc+"%",PageRequest.of(page,size));
	}
	
	@RequestMapping(value="/add-agentpcr",method=RequestMethod.POST)
	public AgentPcr save(@RequestBody AgentPcrDto ag ){
		 
		return agentPcrService.saveAgentPcr(ag);
	}
	
	@RequestMapping(value="/delete-agentPcr/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		agentPcrService.deleteById(id);
		return true;
	}
	
	@RequestMapping(value="/update-agentPcr/{id}",method=RequestMethod.PUT)
	public AgentPcr save(@PathVariable Long id,@RequestBody AgentPcrDto ag ){
		 
		return agentPcrService.updateAgentPcr(id,ag);
	}

}
