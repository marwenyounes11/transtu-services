package org.sid.web;

import java.util.List;

import org.sid.bi.entitie.NbrAccidentParMoyenTransport;
import org.sid.dao.NbrAccidentParMoyenTransportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class NbrAccidentParMoyenTransportRestService {
	@Autowired
	private NbrAccidentParMoyenTransportRepository nbrAccidentParMoyenTransportRepository;
	@RequestMapping(value="/nbrAccidentParMoyenTransport",method=RequestMethod.GET)
	public List<NbrAccidentParMoyenTransport> getNbrAccidentParMoyenTransport(){
		return (List<NbrAccidentParMoyenTransport>) nbrAccidentParMoyenTransportRepository.findAll();
}
}