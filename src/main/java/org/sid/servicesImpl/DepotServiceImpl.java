package org.sid.servicesImpl;

import java.util.List;
import java.util.Optional;
import org.sid.dao.DistrictRepository;
import org.sid.dto.DistrictDto;

import org.sid.entities.District;
import org.sid.dao.DepotRepository;
import org.sid.dto.DepotDto;
import org.sid.entities.Departement;
import org.sid.entities.Depot;
import org.sid.exception.RestException;
import org.sid.exception.RestExceptionCode;
import org.sid.services.DepotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class DepotServiceImpl implements DepotService{
	
	@Autowired(required = true)
	DepotRepository depotRepository;
	@Autowired(required = true)
	DistrictRepository districtRepository;
	@Override
	public Depot saveDepot(DepotDto d ){
			
			Depot depot = new Depot();
			District district =districtRepository.findById(d.getIdDistrict()).orElse(null);
			if(d.getName()== ""){
				RestExceptionCode code = RestExceptionCode.NAME_EMPTY;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			
			if(d.getName()==null){
				RestExceptionCode code = RestExceptionCode.NAME_NOT_FOUND;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
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
			depot.setName(d.getName());
			depot.setDistrict(district);
			return depotRepository.save(depot);
		}
	@Override
	public List<Depot> fetchListDepot() {
		// TODO Auto-generated method stub
		return depotRepository.findAll();
	}
	@Override
	public Optional<Depot> findById(Long id) {
		// TODO Auto-generated method stub
		return depotRepository.findById(id);
	}
	@Override
	public Page<Depot> chercherDepot(String string, PageRequest of) {
		// TODO Auto-generated method stub
		
		return depotRepository.chercherDepot(string, of);
	}
	@Override
	public void deleteById(Long id) {
		if(!depotRepository.existsById(id)) {
			RestExceptionCode code = RestExceptionCode.OBJECT_NOT_FOUND;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
        }
		depotRepository.findById(id)
        .map(depot -> {
        	depotRepository.delete(depot);
            return true;
        });

	}
	
	@Override
	public Depot updateDepot(Long id, DepotDto d) {
		Depot depot = depotRepository.findById(id).orElse(null);
		District district =districtRepository.findById(d.getIdDistrict()).orElse(null);
		if(d.getName()== ""){
			RestExceptionCode code = RestExceptionCode.NAME_EMPTY;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
		}
		
		if(d.getName()==null){
			RestExceptionCode code = RestExceptionCode.NAME_NOT_FOUND;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
		}
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
		depot.setName(d.getName());
		depot.setDistrict(district);
		return depotRepository.save(depot);
	}
	
}
