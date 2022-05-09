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

@RestController // Defines that this class is a spring bean
@RequestMapping("/api/v1/")
public class JobController {
	@Autowired
	JobRepository jobRepository;
	
	@GetMapping("/Jobs")

	public List<Job> getAllJobs(){
		return jobRepository.findAll();
	}
	
	@GetMapping("/Jobs/{id}")
	public Job getJobByID(@PathVariable String id) {
		return jobRepository.findById(id).get();
	}
	
	@PostMapping("/Jobs")
	public Job saveJob(@RequestBody Job job){
		return jobRepository.save(job);
	}
	
	@PostMapping("/JobList")
	public List<Job> saveListJobs(@RequestBody List<Job> jobs) {
		return jobRepository.saveAll(jobs);
	}
	
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
	
	@DeleteMapping("/Jobs/{id}")
	public Job deleteCustomerById(@PathVariable String id) {
		Job _job = jobRepository.findById(id).get();
		jobRepository.deleteById(id);
		return _job;
	}
	
	@DeleteMapping("/JobsList")
	public void deleteAll() {
		jobRepository.deleteAll();
	}
}
