package org.sid.web;

import java.util.List;

import org.sid.bi.entitie.EstimationPrixDegatParDate;
import org.sid.dao.EstimationPrixDegatParDateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class EstimationPrixDegatParDateRestService {
	@Autowired
	private EstimationPrixDegatParDateRepository estimationPrixDegatParDateRepository;
	@RequestMapping(value="/estimationPrixDegatParDate",method=RequestMethod.GET)
	public List<EstimationPrixDegatParDate> getEstimationPrixDegatParDate(){
		return (List<EstimationPrixDegatParDate>) estimationPrixDegatParDateRepository.findAll();
}
}
