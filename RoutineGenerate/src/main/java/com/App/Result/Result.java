package com.App.Result;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="result")
public class Result {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String batchName;
	private String courseName;
	private String facultyName;
	private Integer capacity;
	private String day;
	private String period;
	private Integer room_no;
	
	public Result() {
		
	}
	public Result( String batchName, String courseName, String facultyName, Integer capacity, String day,
			String period, Integer room_no) {
		super();
		//this.id = id;
		this.batchName = batchName;
		this.courseName = courseName;
		this.facultyName = facultyName;
		this.capacity = capacity;
		this.day = day;
		this.period = period;
		this.room_no = room_no;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getFacultyName() {
		return facultyName;
	}
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}
	public Integer getCapacity() {
		return capacity;
	}
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	public Integer getRoom_no() {
		return room_no;
	}
	public void setRoom_no(Integer room_no) {
		this.room_no = room_no;
	}
	
	

	
	
	
	
}
