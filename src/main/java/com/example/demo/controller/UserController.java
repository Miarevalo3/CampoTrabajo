package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@RestController // Defines that this class is a spring bean
@RequestMapping("/api/v1/")
public class UserController {
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/Users")

	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	@GetMapping("/Users/{id}")
	public User getUserByID(@PathVariable String id) {
		return userRepository.findById(id).get();
	}
	
	@PostMapping("/Users")
	public User saveCustomer(@RequestBody User user){
		return userRepository.save(user);
	}
	
	@PostMapping("/UserList")
	public List<User> saveListUsers(@RequestBody List<User> users) {
		return userRepository.saveAll(users);
	}
	
	@PutMapping("/Users/{id}")
	public User updateCustomer(@PathVariable String id, @RequestBody User user) {
		
		User _user = userRepository.findById(id).get();
		
		_user.setName(user.getName());
		_user.setLastname1(user.getLastname1());
		_user.setLastname2(user.getLastname2());
		_user.setJobOfferts(user.getJobOfferts());
		_user.setMyForm(user.getMyForm());
		_user.setPassword(user.getPassword());
		_user.setPhone(user.getPhone());
		_user.setRol(user.getRol());
		
		userRepository.save(_user);
		
		return _user;
	}
	
	@DeleteMapping("/Users/{id}")
	public User deleteCustomerById(@PathVariable String id) {
		User _user = userRepository.findById(id).get();
		userRepository.deleteById(id);
		return _user;
	}
	
	@DeleteMapping("/CustomersList")
	public void deleteAll() {
		userRepository.deleteAll();
	}
}
