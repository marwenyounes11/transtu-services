package org.sid.web;

import java.util.List;

import org.sid.bi.entitie.NbrBlesserExterneParSousTypeAccident;
import org.sid.dao.NbrBlesserExterneParSousTypeAccidentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class NbrBlesserExterneParSousTypeAccidentRestService {
	@Autowired
	private NbrBlesserExterneParSousTypeAccidentRepository nbrBlesserExterneParSousTypeAccidentRepository;
	@RequestMapping(value="/nbrBlesserExterneParSousTypeAccident",method=RequestMethod.GET)
	public List<NbrBlesserExterneParSousTypeAccident> getNbrBlesserExterneParSousTypeAccident(){
		return (List<NbrBlesserExterneParSousTypeAccident>) nbrBlesserExterneParSousTypeAccidentRepository.findAll();
	}
}
