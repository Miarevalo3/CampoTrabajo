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

import com.example.demo.model.Job;
import com.example.demo.model.User;
import com.example.demo.repository.JobRepository;
/**
 * JobController contiene los métodos del controllador de Job
 * @author Miller Luis
 *
 */
@RestController // Defines that this class is a spring bean
@RequestMapping("/api/v1/")
public class JobController {
@Autowired
	JobRepository jobRepository;
	
	@GetMapping("/Jobs")
/**
 * Solicita la lista de Jobs almacenada
 * @return Devuelve la lista completa
 */
	public List<Job> getAllJobs(){
		return jobRepository.findAll();
	}
/**
 * Busca un Job en especifico
 * @param id id del Job que se desea encontrar
 * @return
 */
	@GetMapping("/Jobs/{id}")
	public Job getJobByID(@PathVariable String id) {
		return jobRepository.findById(id).get();
	}
/**
 * Guarda un nuevo Job
 * @param job Estancia e la clase Job que se usa para crear un nuevo job
 * @return retorna el job creado
 */
	@PostMapping("/Jobs")
	public Job saveJob(@RequestBody Job job){
		return jobRepository.save(job);
	}
/**
 * Guarda varios jobs 
 * @param jobs lista de instancias de job para crear los nuevos job
 * @return retorna la lista de jobs creados
 */
	@PostMapping("/JobList")
	public List<Job> saveListJobs(@RequestBody List<Job> jobs) {
		return jobRepository.saveAll(jobs);
	}
/**
 * Permite modificar un job
 * @param id id del job que se desea modificar
 * @param job estancia del objeto para modificarlo
 * @return retorna el job que se modificó
 */
	@PutMapping("/Jobs/{id}")
	public Job updateCustomer(@PathVariable String id, @RequestBody Job job) {
		
		Job _job = jobRepository.findById(id).get();
		
		_job.setLfAbleToRelocate(job.isLfAbleToRelocate());
		_job.setLfExperience(job.getLfExperience());
		_job.setLfSkills(job.getLfSkills());
		_job.setLfStudies(job.getLfStudies());
		_job.setLfWillingToCapacitate(job.isLfWillingToCapacitate());
		_job.setNvacancies(job.getNvacancies());
		_job.setOfertCapacitate(job.isOfertCapacitate());
		_job.setOfertLivingPlace(job.isOfertLivingPlace());
		_job.setOtherAdvantages(job.getOtherAdvantages());
		_job.setSalary(job.getSalary());
		_job.setUrgency(job.getUrgency());
		
		jobRepository.save(_job);
		
		return _job;
	}
/**
 * permite borrar un job
 * @param id id del job que se desea borrar
 * @return retorna el job eliminado
 */
	@DeleteMapping("/Jobs/{id}")
	public Job deleteCustomerById(@PathVariable String id) {
		Job _job = jobRepository.findById(id).get();
		jobRepository.deleteById(id);
		return _job;
	}
/**
 * elimina todos los jobs almacenados
 */
	@DeleteMapping("/JobsList")
	public void deleteAll() {
		jobRepository.deleteAll();
	}
}
