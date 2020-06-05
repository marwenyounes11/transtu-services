package org.sid.web;

import java.util.List;

import org.sid.bi.entitie.NbrAccidentParDistrict;
import org.sid.dao.NbrAccidentParDistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class NbrAccidentParDistrictRestService {
	@Autowired
	private NbrAccidentParDistrictRepository nbrAccidentParDistrictRepository;
	@RequestMapping(value="/nbrAccidentParDistrict",method=RequestMethod.GET)
	public List<NbrAccidentParDistrict> getNbrAccidentParDistrict(){
		return (List<NbrAccidentParDistrict>) nbrAccidentParDistrictRepository.findAll();
}
}
