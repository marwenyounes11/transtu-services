package org.sid.web;

import java.util.List;

import org.sid.bi.entitie.NbrBlesserInterneParSousTypeAccident;
import org.sid.dao.NbrBlesserInterneParSousTypeAccidentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class NbrBlesserInterneParSousTypeAccidentRestService {
	@Autowired
	private NbrBlesserInterneParSousTypeAccidentRepository nbrBlesserInterneParSousTypeAccidentRepository;
	@RequestMapping(value="/nbrBlesserInterneParSousTypeAccident",method=RequestMethod.GET)
	public List<NbrBlesserInterneParSousTypeAccident> getNbrBlesserInterneParSousTypeAccident(){
		return (List<NbrBlesserInterneParSousTypeAccident>) nbrBlesserInterneParSousTypeAccidentRepository.findAll();
	}
}
