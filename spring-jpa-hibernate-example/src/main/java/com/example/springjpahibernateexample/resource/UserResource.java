package com.example.springjpahibernateexample.resource;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springjpahibernateexample.model.Users;
import com.example.springjpahibernateexample.repo.UserRepository;

@RestController
@RequestMapping("/rest/users")
public class UserResource {

	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/all")
	public List<Users> getAll() 
	{
		return userRepository.findAll();
	}
	
	@GetMapping("/{name}")
	public List<Users> getName(@PathVariable("name") final String name) 
	{
		//Optional<List<Users>> listOptional=
			return	userRepository.findByName(name);
		
		/*List<Users> users=
		//listOptional.orElse(new ArrayList<>());
		listOptional.orElseThrow(() -> new RuntimeException("Nooo"));
		
		return users;*/
	}
	
	@GetMapping("/id/{id}")
	public Users getId(@PathVariable("id") final Integer id) 
	{
		return userRepository.findAllById(id);
	}
	
	
	@GetMapping("/update/{id}/{name}")
	public Users update(@PathVariable("id") final Integer id,@PathVariable("name") final String name) 
	{
		
		Users user=getId(id);
		user.setName(name);
		return  userRepository.save(user);
	}
	
	
}
