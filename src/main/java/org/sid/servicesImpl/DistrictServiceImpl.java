package org.sid.servicesImpl;

import java.util.List;
import java.util.Optional;


import org.sid.dao.DistrictRepository;
import org.sid.dto.DistrictDto;

import org.sid.entities.District;
import org.sid.exception.RestException;
import org.sid.exception.RestExceptionCode;
import org.sid.services.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
@Service
public class DistrictServiceImpl implements DistrictService{
	@Autowired(required = true)
	DistrictRepository districtRepository;
	@Override
	public District saveDistrict(DistrictDto d ){
			
			District district = new District();
			
			
			if(d.getNameDistrict()== ""){
				RestExceptionCode code = RestExceptionCode.NAME_EMPTY;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			
			if(d.getNameDistrict()==null){
				RestExceptionCode code = RestExceptionCode.NAME_NOT_FOUND;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			district.setNameDistrict(d.getNameDistrict());
			return districtRepository.save(district);
		}
	@Override
	public List<District> fetchListDistrict() {
		// TODO Auto-generated method stub
		return districtRepository.findAll();
	}
	@Override
	public Optional<District> findById(Long id) {
		// TODO Auto-generated method stub
		return districtRepository.findById(id);
	}
	@Override
	public Page<District> chercherDistrict(String string, PageRequest of) {
		// TODO Auto-generated method stub
		
		return districtRepository.chercherDistrict(string, of);
	}
	@Override
	public void deleteById(Long id) {
		if(!districtRepository.existsById(id)) {
			RestExceptionCode code = RestExceptionCode.OBJECT_NOT_FOUND;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
        }
		districtRepository.findById(id)
        .map(district -> {
        	districtRepository.delete(district);
            return true;
        });

	}
	
	@Override
	public District updateDistrict(Long id, DistrictDto d) {
		District district = districtRepository.findById(id).orElse(null);
		if(d.getNameDistrict()== ""){
			RestExceptionCode code = RestExceptionCode.NAME_EMPTY;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
		}
		
		if(d.getNameDistrict()==null){
			RestExceptionCode code = RestExceptionCode.NAME_NOT_FOUND;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
		}
		district.setNameDistrict(d.getNameDistrict());
		return districtRepository.save(district);
	}
	
}
