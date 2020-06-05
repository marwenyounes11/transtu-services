
package org.sid.web;

import java.util.List;

import org.sid.jwtauthentication.repository.RoleRepository;
import org.sid.jwtauthentication.model.Role;
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
public class RoleRestService {
	@Autowired
	private RoleRepository roleRepository ;
	@RequestMapping(value="/role",method=RequestMethod.GET)
	public List<Role> getRole(){
		return roleRepository.findAll();
	}
	@RequestMapping(value="/role/{id}",method=RequestMethod.GET)
	public Role getRole(@PathVariable Long id){
		return roleRepository.findById(id).orElse(null);
	}
	@RequestMapping(value="/chercherRole",method=RequestMethod.GET)
	public Page<Role> chercher(
			@RequestParam(name="mc",defaultValue="")String mc,
			@RequestParam(name="page",defaultValue="0")int page,
			@RequestParam(name="size",defaultValue="5")int size){
		return roleRepository.chercherRole("%"+mc+"%",PageRequest.of(page,size));
	}
	
	@RequestMapping(value="/role",method=RequestMethod.POST)
	public Role save(@RequestBody Role r ){
		return roleRepository.save(r);
	}
	
	@RequestMapping(value="/role/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		roleRepository.deleteById(id);
		return true;
	}
	
	@RequestMapping(value="/role/{id}",method=RequestMethod.PUT)
	public Role save(@PathVariable Long id,@RequestBody Role r ){
		r.setId(id);
		return roleRepository.save(r);
	}
}
