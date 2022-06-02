package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.demo.model.User;

/**
 * interface que extiene la de MongoRepository y permite usarla con el controlador de User
 *
 */
public interface UserRepository extends MongoRepository<User, String>{

}
