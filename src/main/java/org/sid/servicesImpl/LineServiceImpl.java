package org.sid.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.sid.dao.LineRepository;
import org.sid.dto.LineDto;
import org.sid.entities.Intervention;
import org.sid.entities.Line;
import org.sid.exception.RestException;
import org.sid.exception.RestExceptionCode;
import org.sid.services.LineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
@Service
public class LineServiceImpl  implements LineService{
	@Autowired(required = true)
	LineRepository lineRepository;
	@Override
	public Line saveLine(LineDto d ){
			
			Line line = new Line();
			if(d.getNameLine()== ""){
				RestExceptionCode code = RestExceptionCode.NAME_EMPTY;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			
			if(d.getNameLine()==null){
				RestExceptionCode code = RestExceptionCode.NAME_NOT_FOUND;
				RestException ex = new RestException(code.getError(), code);
				throw ex;
			}
			line.setNameLine(d.getNameLine());
			return lineRepository.save(line);
		}
	@Override
	public List<Line> fetchListLine() {
		// TODO Auto-generated method stub
		return lineRepository.findAll();
	}
	@Override
	public Optional<Line> findById(Long id) {
		// TODO Auto-generated method stub
		return lineRepository.findById(id);
	}
	@Override
	public Page<Line> chercherLine(String string, PageRequest of) {
		// TODO Auto-generated method stub
		
		return lineRepository.chercherLine(string, of);
	}
	@Override
	public void deleteById(Long id) {
		if(!lineRepository.existsById(id)) {
			RestExceptionCode code = RestExceptionCode.OBJECT_NOT_FOUND;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
        }
		lineRepository.findById(id)
        .map(line -> {
        	lineRepository.delete(line);
            return true;
        });

	}
	
	@Override
	public Line updateLine(Long id,LineDto l) {
		Line line = lineRepository.findById(id).orElse(null);
		if(l.getNameLine()== ""){
			RestExceptionCode code = RestExceptionCode.NAME_EMPTY;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
		}
		
		if(l.getNameLine()==null){
			RestExceptionCode code = RestExceptionCode.NAME_NOT_FOUND;
			RestException ex = new RestException(code.getError(), code);
			throw ex;
		}
		line.setNameLine(l.getNameLine());
		return lineRepository.save(line);
	}
	

}
