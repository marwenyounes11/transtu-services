package org.sid.web;

import java.util.List;

import org.sid.bi.entitie.NbrMortsParDate;

import org.sid.dao.NbrMortsParDateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class NbrMortsParDateRestService {
	@Autowired
	private NbrMortsParDateRepository nbrMortsParDateRepository;
	@RequestMapping(value="/nbrMortsParDate",method=RequestMethod.GET)
	public List<NbrMortsParDate> getNbrMortsParDate(){
		return (List<NbrMortsParDate>) nbrMortsParDateRepository.findAll();
	}
}
