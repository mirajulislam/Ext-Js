package SpringBoot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringBoot.entites.Job;
import SpringBoot.repository.JobRepository;



@Service
public class  JobServices {
	
	@Autowired
	private JobRepository jobRepository;
	

	public List<Job>allUser(){
		
		return jobRepository.findAll();
		
	}
	
	public void add(Job job) {
		jobRepository.save(job);
		
	}
	
	public void update(Job job) {
		 jobRepository.saveAndFlush(job);
	}
	
	public void delete(Job job) {
		jobRepository.delete(job);
	}
 
}
