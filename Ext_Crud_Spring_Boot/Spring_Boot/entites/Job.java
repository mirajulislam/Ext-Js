package com.example.demo.entites;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "spring_ext_curd")
public class Job {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int jobId;
	private String title;
	private String type;
	private String location;
	private String category;
	
	public Job() {
		
	}
	
	public Job(int jobId, String title, String type, String location, String category) {
		this.jobId = jobId;
		this.title = title;
		this.type = type;
		this.location = location;
		this.category = category;
	}

	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
    
	
	
}
