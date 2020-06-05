package org.sid.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.sid.dao.AgentPcrRepository;
import org.sid.dto.AgentPcrDto;
import org.sid.entities.AgentIntervention;
import org.sid.entities.AgentPcr;
import org.sid.exception.RestException;
import org.sid.exception.RestExceptionCode;
import org.sid.services.AgentPcrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
@Service
public class AgentPcrServiceImpl implements AgentPcrService{
	@Autowired(required = true)
	AgentPcrRepository agentPcrRepository;
	@Override
	public AgentPcr saveAgentPcr(AgentPcrDto a ){
		String nameAgentPcr=a.getNameAgent();	
		String lastNameAgentPcr=a.getLastNameAgent();		
		String phoneAgentPcr=a.getPhoneAgent();	
		String regExpEmail ="^[\\w.-]+@[\\w.-]+\\.[a-z]{2.}$";
		String regExpPhone ="^\\d{8}$";	
		AgentPcr agentPcr = new AgentPcr();
			if(nameAgentPcr== ""){
				RestExceptionCode code = RestExceptionCode.NAME_EMPTY;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			
			if(nameAgentPcr==null){
				RestExceptionCode code = RestExceptionCode.NAME_NOT_FOUND;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			if(lastNameAgentPcr== ""){
				RestExceptionCode code = RestExceptionCode.LASTNAME_EMPTY;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			
			if(lastNameAgentPcr==null){
				RestExceptionCode code = RestExceptionCode.LASTNAME_NOT_FOUND;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			if(!(phoneAgentPcr).matches(regExpPhone)){
				RestExceptionCode code = RestExceptionCode.PHONE_INCORRECT;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			agentPcr.setNameAgent(nameAgentPcr);
			agentPcr.setLastNameAgent(lastNameAgentPcr);
			agentPcr.setPhoneAgent(phoneAgentPcr);
			return agentPcrRepository.save(agentPcr);
		}
	@Override
	public List<AgentPcr> fetchListAgentPcr() {
		// TODO Auto-generated method stub
		return agentPcrRepository.findAll();
	}
	@Override
	public Optional<AgentPcr> findById(Long id) {
		// TODO Auto-generated method stub
		return agentPcrRepository.findById(id);
	}
	@Override
	public Page<AgentPcr> chercherAgentPcr(String string, PageRequest of) {
		// TODO Auto-generated method stub
		
		return agentPcrRepository.chercherAgentPcr(string, of);
	}
	@Override
	public void deleteById(Long id) {
		if(!agentPcrRepository.existsById(id)) {
			RestExceptionCode code = RestExceptionCode.OBJECT_NOT_FOUND;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
        }
		agentPcrRepository.findById(id)
        .map(agent -> {
        	agentPcrRepository.delete(agent);
            return true;
        });

	}
	
	@Override
	public AgentPcr updateAgentPcr(Long id, AgentPcrDto a) {
		AgentPcr agentPcr = agentPcrRepository.findById(id).orElse(null);

		String nameAgentPcr=a.getNameAgent();	
		String lastNameAgentPcr=a.getLastNameAgent();		
		String phoneAgentPcr=a.getPhoneAgent();	
		String regExpEmail ="^[\\w.-]+@[\\w.-]+\\.[a-z]{2.}$";
		String regExpPhone ="^\\d{8}$";	
		;
			if(nameAgentPcr== ""){
				RestExceptionCode code = RestExceptionCode.NAME_EMPTY;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			
			if(nameAgentPcr==null){
				RestExceptionCode code = RestExceptionCode.NAME_NOT_FOUND;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			if(lastNameAgentPcr== ""){
				RestExceptionCode code = RestExceptionCode.LASTNAME_EMPTY;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			
			if(lastNameAgentPcr==null){
				RestExceptionCode code = RestExceptionCode.LASTNAME_NOT_FOUND;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			if(!(phoneAgentPcr).matches(regExpPhone)){
				RestExceptionCode code = RestExceptionCode.PHONE_INCORRECT;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			agentPcr.setNameAgent(nameAgentPcr);
			agentPcr.setLastNameAgent(lastNameAgentPcr);
			agentPcr.setPhoneAgent(phoneAgentPcr);
			return agentPcrRepository.save(agentPcr);
	}
	
}
