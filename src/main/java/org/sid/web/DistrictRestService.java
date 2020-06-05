package org.sid.web;

import java.util.List;

import org.sid.dto.DistrictDto;
import org.sid.entities.District;
import org.sid.services.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class DistrictRestService {
	@Autowired
	private DistrictService districtService;
	@RequestMapping(value="/list-district",method=RequestMethod.GET)
	public List<District> getDistrict(){
		return districtService.fetchListDistrict();
	}
	@RequestMapping(value="/district/{id}",method=RequestMethod.GET)
	public District getDistrict(@PathVariable Long id){
		return districtService.findById(id).orElse(null);
	}
	
	@RequestMapping(value="/chercher-district",method=RequestMethod.GET)
	public Page<District> chercher(
			@RequestParam(name="mc",defaultValue="") String mc,
			@RequestParam(name="page",defaultValue="0") int page,
			@RequestParam(name="size",defaultValue="5") int size){
		return districtService.chercherDistrict("%"+mc+"%",PageRequest.of(page,size));
	}
	
	@RequestMapping(value="/district",method=RequestMethod.POST)
	public District save(@RequestBody DistrictDto d ){
		return districtService.saveDistrict(d);
	}
	
	@RequestMapping(value="/district/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		districtService.deleteById(id);
		return true;
	}
	
	@RequestMapping(value="/district/{id}",method=RequestMethod.PUT)
	public District save(@PathVariable Long id,@RequestBody DistrictDto dpot ){	
		return districtService.updateDistrict(id, dpot);
	}
}
