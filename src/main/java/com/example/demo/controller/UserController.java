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

import co.edu.poli.mongodb.model.Customer;
import co.edu.poli.mongodb.repository.CustomerRepository;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
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
	public User updateCustomer(@PathVariable String id, @RequestBody Customer customer) {
		
		User _user = userRepository.findById(id).get();
		
		_user.setFirstname(customer.getFirstname());
		_user.setLastname(customer.getLastname());
		_user.setAddress(customer.getAddress());
		_user.setAge(customer.getAge());
		_user.setSalary(customer.getSalary());
		_user.setMediosPago(customer.getMediosPago());
		_user.setListaCompras(customer.getListaCompras());
		
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
		customerRepository.deleteAll();
	}
}
