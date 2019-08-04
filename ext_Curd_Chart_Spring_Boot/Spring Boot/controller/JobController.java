package SpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import SpringBoot.entites.Job;
import SpringBoot.services.JobServices;


@RestController
public class JobController {
	
	@Autowired
	private JobServices jobServices;
	
	@GetMapping("/jobs")	
	public List<Job> getAllUser(){
		return jobServices.allUser();
	}

	@PostMapping("/jobs/add")
	public void addSave(@RequestBody Job job){
		jobServices.add(job);
		
	}
	
	@PutMapping("jobs/update")
	public void update( @RequestBody Job job) {
		jobServices.update(job);	
		
	}
	
	@DeleteMapping("jobs/delete")
	public void delete(@RequestBody Job job) {	
		jobServices.delete(job);	
	}
	
}
