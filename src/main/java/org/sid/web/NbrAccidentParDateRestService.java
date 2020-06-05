package org.sid.web;

import java.util.List;

import org.sid.bi.entitie.NbrAccidentParDate;
import org.sid.dao.NbrAccidentParDateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class NbrAccidentParDateRestService {
	@Autowired
	private NbrAccidentParDateRepository nbrAccidentParDateRepository;
	@RequestMapping(value="/nbrAccidentParDate",method=RequestMethod.GET)
	public List<NbrAccidentParDate> getNbrAccidentParDate(){
		return (List<NbrAccidentParDate>) nbrAccidentParDateRepository.findAll();
}
}
