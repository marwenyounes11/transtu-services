package org.sid.servicesImpl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.sid.dao.AccidentRepository;
import org.sid.dao.AgentPcrRepository;
import org.sid.dao.EmplacementRepository;
import org.sid.dao.RecordRepository;
import org.sid.dao.SourceInfoRepository;
import org.sid.dto.AccidentDto;
import org.sid.entities.Accident;
import org.sid.entities.AccidentSecurite;
import org.sid.entities.AgentPcr;
import org.sid.entities.Emplacement;
import org.sid.entities.Record;
import org.sid.entities.SourceInfo;
import org.sid.exception.RestException;
import org.sid.exception.RestExceptionCode;
import org.sid.services.AccidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
@Service
public class AccidentServiceImpl implements AccidentService{
	@Autowired(required = true)
	AccidentRepository accidentRepository;
	@Autowired(required = true)
	private AgentPcrRepository agentPcrRepository;
	@Autowired(required = true)
	private RecordRepository recordRepository;
	@Autowired(required = true)
	private EmplacementRepository emplacementRepository;
	@Autowired
	private SourceInfoRepository sourceInfoRepository;
	@Override
	public Accident saveAccident(AccidentDto a ){
		Accident accident = new Accident();
		AgentPcr agentPcr = agentPcrRepository.findById(a.getIdAgentPcr()).orElse(null);
		Record record = recordRepository.findById(a.getIdRecord()).orElse(null);
			SourceInfo sourceInfo = sourceInfoRepository.findById(a.getIdSourceInfo()).orElse(null);
			Emplacement emplacement = emplacementRepository.findById(a.getIdEmplacement()).orElse(null);	
		String descriptionAccident=a.getDescription();
		String dateAccident=a.getDateAccident();
		String timeAccident=a.getTimeAccident();
		String dateSaisi=a.getDateSaisi();
		String timeInfo=a.getTimeInfo();
		String dateInfo=a.getDateInfo();
		String timeSaisi=a.getTimeSaisi();
		if(descriptionAccident== ""){
			RestExceptionCode code = RestExceptionCode.DESCRIPTION_EMPTY;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
		}
		
		  
		
		
		
		accident.setTimeAccident(timeAccident);
		accident.setDateAccident(dateAccident);
		accident.setDateSaisi(dateSaisi);
		accident.setTimeSaisi(timeSaisi);
		accident.setDateSaisi(dateInfo);
		accident.setTimeSaisi(timeInfo);
		accident.setDescription(descriptionAccident);
		accident.setPhoto(a.getPhoto());
		accident.setEmplacement(emplacement);
		accident.setAgentPcr(agentPcr);
		accident.setRecord(record);
		accident.setSourceInfo(sourceInfo);
		
			return accidentRepository.save(accident);
		}
	@Override
	public List<Accident> fetchListAccident() {
		// TODO Auto-generated method stub
		return accidentRepository.findAll();
	}
	@Override
	public Optional<Accident> findById(Long id) {
		// TODO Auto-generated method stub
		return accidentRepository.findById(id);
	}
	@Override
	public Page<Accident> chercherAccident(String string, PageRequest of) {
		// TODO Auto-generated method stub
		
		return accidentRepository.chercherAccident(string, of);
	}
	@Override
	public void deleteById(Long id) {
		if(!accidentRepository.existsById(id)) {
			RestExceptionCode code = RestExceptionCode.OBJECT_NOT_FOUND;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
        }
		accidentRepository.findById(id)
        .map(accident -> {
        	accidentRepository.delete(accident);
            return true;
        });

	}
	
	@Override
	public Accident updateAccident(Long id,AccidentDto a) {
		Accident accident = accidentRepository.findById(id).orElse(null);
		AgentPcr agentPcr = agentPcrRepository.findById(a.getIdAgentPcr()).orElse(null);
		Record record = recordRepository.findById(a.getIdRecord()).orElse(null);
			SourceInfo sourceInfo = sourceInfoRepository.findById(a.getIdSourceInfo()).orElse(null);
			Emplacement emplacement = emplacementRepository.findById(a.getIdEmplacement()).orElse(null);	
		String descriptionAccident=a.getDescription();
		String dateAccident=a.getDateAccident();
		String timeAccident=a.getTimeAccident();
		String dateSaisi=a.getDateSaisi();
		String timeInfo=a.getTimeInfo();
		String dateInfo=a.getDateInfo();
		String timeSaisi=a.getTimeSaisi();
		if(descriptionAccident== ""){
			RestExceptionCode code = RestExceptionCode.DESCRIPTION_EMPTY;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
		}
		
		  
		
		
		
		accident.setTimeAccident(timeAccident);
		accident.setDateAccident(dateAccident);
		accident.setDateSaisi(dateSaisi);
		accident.setTimeSaisi(timeSaisi);
		accident.setDateSaisi(dateInfo);
		accident.setTimeSaisi(timeInfo);
		accident.setDescription(descriptionAccident);
		accident.setPhoto(a.getPhoto());
		accident.setEmplacement(emplacement);
		accident.setAgentPcr(agentPcr);
		accident.setRecord(record);
		accident.setSourceInfo(sourceInfo);
		
			return accidentRepository.save(accident);
	}
	

}
