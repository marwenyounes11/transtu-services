package org.sid.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.sid.dao.RecordRepository;
import org.sid.dto.RecordDto;
import org.sid.entities.Receveur;
import org.sid.entities.Record;
import org.sid.exception.RestException;
import org.sid.exception.RestExceptionCode;
import org.sid.services.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
@Service

public class RecordServiceImpl implements RecordService{
	@Autowired(required = true)
	RecordRepository recordRepository;
	@Override
	public Record saveRecord(RecordDto r ){
			
		Record record = new Record();
			if(r.getDescriptionRecord()== ""){
				RestExceptionCode code = RestExceptionCode.DESCRIPTION_EMPTY;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			
			if(r.getDescriptionRecord()==null){
				RestExceptionCode code = RestExceptionCode.DESCRIPTION_NOT_FOUND;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			record.setDescriptionRecord(r.getDescriptionRecord());
			return recordRepository.save(record);
		}
	@Override
	public List<Record> fetchListRecord() {
		// TODO Auto-generated method stub
		return recordRepository.findAll();
	}
	@Override
	public Optional<Record> findById(Long id) {
		// TODO Auto-generated method stub
		return recordRepository.findById(id);
	}
	@Override
	public Page<Record> chercherRecord(String string, PageRequest of) {
		// TODO Auto-generated method stub
		
		return recordRepository.chercherRecord(string, of);
	}
	@Override
	public void deleteById(Long id) {
		if(!recordRepository.existsById(id)) {
			RestExceptionCode code = RestExceptionCode.OBJECT_NOT_FOUND;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
        }
		recordRepository.findById(id)
        .map(record -> {
        	recordRepository.delete(record);
            return true;
        });

	}
	
	@Override
	public Record updateRecord(Long id,RecordDto r) {
		Record record = recordRepository.findById(id).orElse(null);
		if(r.getDescriptionRecord()== ""){
			RestExceptionCode code = RestExceptionCode.DESCRIPTION_EMPTY;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
		}
		
		if(r.getDescriptionRecord()==null){
			RestExceptionCode code = RestExceptionCode.DESCRIPTION_NOT_FOUND;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
		}
		record.setDescriptionRecord(r.getDescriptionRecord());
		return recordRepository.save(record);
	}
}
