
package org.sid.web;

import java.util.List;

import org.sid.jwtauthentication.repository.UserRepository;
import org.sid.jwtauthentication.model.User;
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

public class UserRestService {
	@Autowired
	private UserRepository userRepository ;
	@RequestMapping(value="/user",method=RequestMethod.GET)
	public List<User> getUser(){
		return userRepository.findAll();
	}
	@RequestMapping(value="/user/{id}",method=RequestMethod.GET)
	public User getUser(@PathVariable Long id){
		return userRepository.findById(id).orElse(null);
	}
	@RequestMapping(value="/chercherUser",method=RequestMethod.GET)
	public Page<User> chercher(
			@RequestParam(name="mc",defaultValue="")String mc,
			@RequestParam(name="page",defaultValue="0")int page,
			@RequestParam(name="size",defaultValue="5")int size){
		return userRepository.chercherUser("%"+mc+"%",PageRequest.of(page,size));
	}
	
	@RequestMapping(value="/user",method=RequestMethod.POST)
	public User save(@RequestBody User u ){
		return userRepository.save(u);
	}
	
	@RequestMapping(value="/user/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		userRepository.deleteById(id);
		return true;
	}
	
	@RequestMapping(value="/user/{id}",method=RequestMethod.PUT)
	public User save(@PathVariable Long id,@RequestBody User u ){
		u.setId(id);
		return userRepository.save(u);
	}
}
