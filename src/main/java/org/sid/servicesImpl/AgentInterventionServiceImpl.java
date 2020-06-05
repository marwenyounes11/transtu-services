package org.sid.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.sid.dao.AgentInterventionRepository;
import org.sid.dto.AgentInterventionDto;
import org.sid.entities.AccidentType;
import org.sid.entities.AgentIntervention;
import org.sid.exception.RestException;
import org.sid.exception.RestExceptionCode;
import org.sid.services.AgentInterventionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
@Service
public class AgentInterventionServiceImpl implements AgentInterventionService {
	@Autowired(required = true)
	AgentInterventionRepository agentInterventionRepository;
	@Override
	public AgentIntervention saveAgentIntervention(AgentInterventionDto a ){
		String nameAgentInt=a.getNameAgentInt();	
		String lastNameAgentInt=a.getLastNameAgentInt();	
		String emailAgentInt=a.getEmailAgentInt();	
		String phoneAgentInt=a.getPhoneAgentInt();	
		String regExpEmail ="^[\\w.-]+@[\\w.-]+\\.[a-z]{2.}$";
		String regExpPhone ="^\\d{8}$";
		AgentIntervention agentIntervention = new AgentIntervention();
			if(nameAgentInt== ""){
				RestExceptionCode code = RestExceptionCode.NAME_EMPTY;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			
			if(nameAgentInt==null){
				RestExceptionCode code = RestExceptionCode.NAME_NOT_FOUND;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			if( lastNameAgentInt==""){
				RestExceptionCode code = RestExceptionCode.LASTNAME_EMPTY;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			
			if(lastNameAgentInt==null){
				RestExceptionCode code = RestExceptionCode.LASTNAME_NOT_FOUND;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			if(!(emailAgentInt).matches(regExpEmail)){
				RestExceptionCode code = RestExceptionCode.EMAIL_INCORRECT;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			if(!(phoneAgentInt).matches(regExpPhone)){
				RestExceptionCode code = RestExceptionCode.PHONE_INCORRECT;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			agentIntervention.setEmailAgentInt(emailAgentInt);
			agentIntervention.setNameAgentInt(nameAgentInt);
			agentIntervention.setLastNameAgentInt(lastNameAgentInt);
			agentIntervention.setPhoneAgentInt(phoneAgentInt);
			return agentInterventionRepository.save(agentIntervention);
		}
	@Override
	public List<AgentIntervention> fetchListAgentIntervention() {
		// TODO Auto-generated method stub
		return agentInterventionRepository.findAll();
	}
	@Override
	public Optional<AgentIntervention> findById(Long id) {
		// TODO Auto-generated method stub
		return agentInterventionRepository.findById(id);
	}
	@Override
	public Page<AgentIntervention> chercherAgentIntervention(String string, PageRequest of) {
		// TODO Auto-generated method stub
		
		return agentInterventionRepository.chercherAgentIntervention(string, of);
	}
	@Override
	public void deleteById(Long id) {
		if(!agentInterventionRepository.existsById(id)) {
			RestExceptionCode code = RestExceptionCode.OBJECT_NOT_FOUND;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
        }
		agentInterventionRepository.findById(id)
        .map(agent -> {
        	agentInterventionRepository.delete(agent);
            return true;
        });

	}
	
	@Override
	public AgentIntervention updateAgentIntervention(Long id, AgentInterventionDto a) {
		AgentIntervention agentIntervention = agentInterventionRepository.findById(id).orElse(null);
		String nameAgentInt=a.getNameAgentInt();	
		String lastNameAgentInt=a.getLastNameAgentInt();	
		String emailAgentInt=a.getEmailAgentInt();	
		String phoneAgentInt=a.getPhoneAgentInt();	
		String regExpEmail ="^[\\w.-]+@[\\w.-]+\\.[a-z]{2.}$";
		String regExpPhone ="^\\d{8}$";
	
			if(nameAgentInt== ""){
				RestExceptionCode code = RestExceptionCode.NAME_EMPTY;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			
			if(nameAgentInt==null){
				RestExceptionCode code = RestExceptionCode.NAME_NOT_FOUND;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			if( lastNameAgentInt==""){
				RestExceptionCode code = RestExceptionCode.LASTNAME_EMPTY;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			
			if(lastNameAgentInt==null){
				RestExceptionCode code = RestExceptionCode.LASTNAME_NOT_FOUND;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			if(!(emailAgentInt).matches(regExpEmail)){
				RestExceptionCode code = RestExceptionCode.EMAIL_INCORRECT;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			if(!(phoneAgentInt).matches(regExpPhone)){
				RestExceptionCode code = RestExceptionCode.PHONE_INCORRECT;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			agentIntervention.setEmailAgentInt(emailAgentInt);
			agentIntervention.setNameAgentInt(nameAgentInt);
			agentIntervention.setLastNameAgentInt(lastNameAgentInt);
			agentIntervention.setPhoneAgentInt(phoneAgentInt);
			return agentInterventionRepository.save(agentIntervention);
	}
}
