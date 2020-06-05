package org.sid.web;


import java.util.List;

import org.sid.bi.entitie.NbrVictimeParDate;
import org.sid.dao.NbrVictimeParDateRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class NbrVictimeParDateRestService {
	@Autowired
	private NbrVictimeParDateRepository nbrVictimeParDateRepository;
	@RequestMapping(value="/nbrVictimeParDate",method=RequestMethod.GET)
	public List<NbrVictimeParDate> getNbrVictimeParDate(){
		return (List<NbrVictimeParDate>) nbrVictimeParDateRepository.findAll();
	}
}
