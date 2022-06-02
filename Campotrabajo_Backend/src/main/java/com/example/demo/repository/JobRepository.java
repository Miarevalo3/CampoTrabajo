package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Job;
/**
 * Interface que extiende la de MongoRepository y permite usarla con el controlador de Job
 * @author Miller Luis
 *
 */
public interface JobRepository extends MongoRepository<Job, String> {

}
