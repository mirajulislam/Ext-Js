package com.App.Faculty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="faculty")
public class Faculty {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String facultyName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return facultyName;
	}
	public void setName(String facultyname) {
		this.facultyName = facultyname;
	}
	public Faculty() {
		
	}
	public Faculty(int id, String facultyname) {
		super();
		this.id = id;
		this.facultyName = facultyname;
	}
	
	
}
