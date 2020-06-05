package org.sid.web;

import java.util.List;

import org.sid.services.AgentInterventionService;
import org.sid.dto.AgentInterventionDto;
import org.sid.entities.AgentIntervention;
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
public class AgentInterventionRestService {
	@Autowired
	private AgentInterventionService agentInterventionService;
	@RequestMapping(value="/agentIntervention",method=RequestMethod.GET)
	public List<AgentIntervention> getAgentIntervention(){
		return agentInterventionService.fetchListAgentIntervention();
	}
	@RequestMapping(value="/agentIntervention/{id}",method=RequestMethod.GET)
	public AgentIntervention getAgentIntervention(@PathVariable Long id){
		return agentInterventionService.findById(id).orElse(null);
	}
	@RequestMapping(value="/chercherAgentIntervention",method=RequestMethod.GET)
	public Page<AgentIntervention> chercher(
			@RequestParam(name="mc",defaultValue="")String mc,
			@RequestParam(name="page",defaultValue="0")int page,
			@RequestParam(name="size",defaultValue="5")int size){
		return agentInterventionService.chercherAgentIntervention("%"+mc+"%",PageRequest.of(page,size));
	}
	
	@RequestMapping(value="/add-agentIntervention",method=RequestMethod.POST)
	public AgentIntervention save(@RequestBody AgentInterventionDto ag ){
		return agentInterventionService.saveAgentIntervention(ag);
	}
	
	@RequestMapping(value="/delete-agentIntervention/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		agentInterventionService.deleteById(id);
		return true;
	}
	
	@RequestMapping(value="/update-agentIntervention/{id}",method=RequestMethod.PUT)
	public AgentIntervention save(@PathVariable Long id,@RequestBody AgentInterventionDto ag ){
		 return agentInterventionService.updateAgentIntervention(id,ag);
	}

}
