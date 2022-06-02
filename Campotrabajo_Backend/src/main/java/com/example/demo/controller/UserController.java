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

/**
 * UserController contiene los métodos del controllador de SMS
 * @author Miller Luis
 *
 */
@RestController // Defines that this class is a spring bean
@RequestMapping("/api/v1/")
public class UserController {
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/Users")
/**
 * permite solicitar la lista de todos los user 
 * @return la lista completa
 */
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
/**
 * busca un user por id	
 * @param id id del user que se busca
 * @return el user que se solicita
 */
	@GetMapping("/Users/{id}")
	public User getUserByID(@PathVariable String id) {
		return userRepository.findById(id).get();
	}
/**
 * guarda un nuevo user
 * @param user estancia de la clase user para crear un nuevo user
 * @return retorna el nuevo user
 */
	@PostMapping("/Users")
	public User saveCustomer(@RequestBody User user){
		return userRepository.save(user);
	}
/**
 * permite crear varios user
 * @param users lista de estancias de user para crear nuevos user
 * @return retorna la lista de user creados
 */
	@PostMapping("/UserList")
	public List<User> saveListUsers(@RequestBody List<User> users) {
		return userRepository.saveAll(users);
	}
/**
 * permite modificar un user
 * @param id id del user a modificar
 * @param user estancia de la clase user que permite modificar al user
 * @return retorna el user modificado
 */
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
/**
 * borra un user
 * @param id id del user que se desea borrar
 * @return retorna el user eliminado
 */
	@DeleteMapping("/Users/{id}")
	public User deleteCustomerById(@PathVariable String id) {
		User _user = userRepository.findById(id).get();
		userRepository.deleteById(id);
		return _user;
	}
/**
 * elimina todos los usuarios
 */
	@DeleteMapping("/UsersList")
	public void deleteAll() {
		userRepository.deleteAll();
	}
}
