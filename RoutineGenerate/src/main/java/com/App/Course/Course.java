package com.App.Course;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="course")
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String courseName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return courseName;
	}
	public void setName(String name) {
		this.courseName = name;
	}
	public Course(int id, String name) {
		super();
		this.id = id;
		this.courseName = name;
	}
	public Course() {
		
	}
	
	
}
