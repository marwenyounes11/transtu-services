package org.sid.web;

import java.util.List;

import org.sid.bi.entitie.EstimationPrixDegatParSousTypeAccident;
import org.sid.dao.EstimationPrixDegatParSousTypeAccidentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class EstimationPrixDegatParSousTypeAccidentRestService {
	@Autowired
	private EstimationPrixDegatParSousTypeAccidentRepository estimationPrixDegatParSousTypeAccidentRepository;
	@RequestMapping(value="/estimationPrixDegatParSousTypeAccident",method=RequestMethod.GET)
	public List<EstimationPrixDegatParSousTypeAccident> getEstimationPrixDegatParSousTypeAccident(){
		return (List<EstimationPrixDegatParSousTypeAccident>) estimationPrixDegatParSousTypeAccidentRepository.findAll();
}
}
