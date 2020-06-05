package org.sid.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.sid.dao.MaterialTypeRepository;

import org.sid.dto.MaterialTypeDto;
import org.sid.entities.MaterialType;

import org.sid.exception.RestException;
import org.sid.exception.RestExceptionCode;
import org.sid.services.MaterialTypeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
@Service
public class MaterialTypeServiceImpl implements MaterialTypeService{
	@Autowired(required = true)
	MaterialTypeRepository materialtypeRepository;
	@Override
	public MaterialType saveMaterialType(MaterialTypeDto t ){
			
		MaterialType materialtype = new MaterialType();
			
		materialtype.setAlias(t.getAlias());
		materialtype.setLabel(t.getLabel());
		
		
			return materialtypeRepository.save(materialtype);
		}
	@Override
	public List<MaterialType> fetchListMaterialType() {
		// TODO Auto-generated method stub
		return materialtypeRepository.findAll();
	}
	@Override
	public Optional<MaterialType> findById(Long id) {
		// TODO Auto-generated method stub
		return materialtypeRepository.findById(id);
	}
	@Override
	public Page<MaterialType> chercherMaterialType(String string, PageRequest of) {
		// TODO Auto-generated method stub
		
		return materialtypeRepository.chercherMaterialType(string, of);
	}
	@Override
	public void deleteById(Long id) {
		if(!materialtypeRepository.existsById(id)) {
			RestExceptionCode code = RestExceptionCode.OBJECT_NOT_FOUND;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
        }
		materialtypeRepository.findById(id)
        .map(materialtype -> {
        	materialtypeRepository.delete(materialtype);
            return true;
        });

	}
	
	@Override
	public MaterialType updateMaterialType(Long id,MaterialTypeDto t) {
		MaterialType materialtype = materialtypeRepository.findById(id).orElse(null);
		
		materialtype.setLabel(t.getLabel());
		materialtype.setAlias(t.getAlias());
		
		
			return materialtypeRepository.save(materialtype);
	}
}
