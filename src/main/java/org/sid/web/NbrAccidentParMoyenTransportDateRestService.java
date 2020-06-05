package org.sid.web;

import java.util.List;

import org.sid.bi.entitie.NbrAccidentParMoyenTransportDate;
import org.sid.dao.NbrAccidentParMoyenTransportDateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class NbrAccidentParMoyenTransportDateRestService {
	@Autowired
	private NbrAccidentParMoyenTransportDateRepository nbrAccidentParMoyenTransportDateRepository;
	@RequestMapping(value="/nbrAccidentParMoyenTransportDate",method=RequestMethod.GET)
	public List<NbrAccidentParMoyenTransportDate> getNbrAccidentParMoyenTransportDate(){
		return (List<NbrAccidentParMoyenTransportDate>) nbrAccidentParMoyenTransportDateRepository.findAll();
}
}
