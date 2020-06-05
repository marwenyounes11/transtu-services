package org.sid.servicesImpl;

import java.util.List;
import java.util.Optional;


import org.sid.dao.SourceInfoRepository;    
import org.sid.dto.SourceInfoDto;
import org.sid.entities.Record;
import org.sid.entities.SourceInfo;
import org.sid.exception.RestException;
import org.sid.exception.RestExceptionCode;
import org.sid.services.SourceInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
@Service


public class SourceInfoServiceImpl implements SourceInfoService{
	@Autowired(required = true)
	SourceInfoRepository sourceInfoRepository;
	@Override
	public SourceInfo saveSourceInfo(SourceInfoDto s ){
			
		SourceInfo sourceInfo = new SourceInfo();
			if(s.getLastNameInfo()== ""){
				RestExceptionCode code = RestExceptionCode.NAME_EMPTY;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			
			if(s.getLastNameInfo()==null){
				RestExceptionCode code = RestExceptionCode.NAME_NOT_FOUND;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			sourceInfo.setLastNameInfo(s.getLastNameInfo());
			return sourceInfoRepository.save(sourceInfo);
		}
	@Override
	public List<SourceInfo> fetchListSourceInfo() {
		// TODO Auto-generated method stub
		return sourceInfoRepository.findAll();
	}
	@Override
	public Optional<SourceInfo> findById(Long id) {
		// TODO Auto-generated method stub
		return sourceInfoRepository.findById(id);
	}
	@Override
	public Page<SourceInfo> chercherSourceInfo(String string, PageRequest of) {
		// TODO Auto-generated method stub
		
		return sourceInfoRepository.chercherSourceInfo(string, of);
	}
	@Override
	public void deleteById(Long id) {
		if(!sourceInfoRepository.existsById(id)) {
			RestExceptionCode code = RestExceptionCode.OBJECT_NOT_FOUND;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
        }
		sourceInfoRepository.findById(id)
        .map(sourceInfo -> {
        	sourceInfoRepository.delete(sourceInfo);
            return true;
        });

	}
	
	@Override
	public SourceInfo updateSourceInfo(Long id,SourceInfoDto s) {
		SourceInfo sourceInfo = sourceInfoRepository.findById(id).orElse(null);
		if(s.getLastNameInfo()== ""){
			RestExceptionCode code = RestExceptionCode.NAME_EMPTY;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
		}
		
		if(s.getLastNameInfo()==null){
			RestExceptionCode code = RestExceptionCode.NAME_NOT_FOUND;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
		}
		sourceInfo.setLastNameInfo(s.getLastNameInfo());
		return sourceInfoRepository.save(sourceInfo);
	}

}
