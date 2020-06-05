package org.sid.web;

import java.util.List;

import org.sid.bi.entitie.NbrAccidentParTypeAccident;
import org.sid.dao.NbrAccidentParTypeAccidentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class NbrAccidentParTypeAccidentRestService {
	@Autowired
	private NbrAccidentParTypeAccidentRepository nbrAccidentParTypeAccidentRepository;
	@RequestMapping(value="/nbrAccidentParTypeAccident",method=RequestMethod.GET)
	public List<NbrAccidentParTypeAccident> getNbrAccidentParTypeAccident(){
		return (List<NbrAccidentParTypeAccident>) nbrAccidentParTypeAccidentRepository.findAll();
}
}