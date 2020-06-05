package org.sid.servicesImpl;
import java.util.List;
import java.util.Optional;


import org.sid.dao.DepartementRepository;
import org.sid.dto.DepartementDto;
import org.sid.entities.Degat;
import org.sid.entities.Departement;
import org.sid.exception.RestException;
import org.sid.exception.RestExceptionCode;
import org.sid.services.DepartementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
@Service
public class DepartementServiceImpl implements DepartementService{
	@Autowired(required = true)
	DepartementRepository departementRepository;
	@Override
	public Departement saveDepartement(DepartementDto d ){
			
		Departement departement = new Departement();
			if(d.getNameDept()== ""){
				RestExceptionCode code = RestExceptionCode.NAME_EMPTY;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			
			if(d.getNameDept()==null){
				RestExceptionCode code = RestExceptionCode.NAME_NOT_FOUND;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			
			departement.setNameDept(d.getNameDept());
			return departementRepository.save(departement);
		}
	@Override
	public List<Departement> fetchListDepartement() {
		// TODO Auto-generated method stub
		return departementRepository.findAll();
	}
	@Override
	public Optional<Departement> findById(Long id) {
		// TODO Auto-generated method stub
		return departementRepository.findById(id);
	}
	@Override
	public Page<Departement> chercherDepartement(String string, PageRequest of) {
		// TODO Auto-generated method stub
		
		return departementRepository.chercherDepartement(string, of);
	}
	@Override
	public void deleteById(Long id) {
		if(!departementRepository.existsById(id)) {
			RestExceptionCode code = RestExceptionCode.OBJECT_NOT_FOUND;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
        }
		departementRepository.findById(id)
        .map(departement -> {
        	departementRepository.delete(departement);
            return true;
        });

	}
	
	@Override
	public Departement updateDepartement(Long id, DepartementDto d) {
		Departement departement = departementRepository.findById(id).orElse(null);
		
		if(d.getNameDept()== ""){
			RestExceptionCode code = RestExceptionCode.NAME_EMPTY;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
		}
		
		if(d.getNameDept()==null){
			RestExceptionCode code = RestExceptionCode.NAME_NOT_FOUND;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
		}
		
		departement.setNameDept(d.getNameDept());
		return departementRepository.save(departement);
	}
}
