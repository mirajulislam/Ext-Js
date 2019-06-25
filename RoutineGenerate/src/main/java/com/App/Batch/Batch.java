package com.App.Batch;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="batch")
public class Batch {
	@Id
	
	private int id;
	private String batchName;
	private int totalStudent;
	
	public Batch() {
		
	}

	public Batch(int id, String batchName, int totalStudent) {
		super();
		this.id = id;
		this.batchName = batchName;
		this.totalStudent = totalStudent;
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

	public int getTotalStudent() {
		return totalStudent;
	}

	public void setTotalStudent(int totalStudent) {
		this.totalStudent = totalStudent;
	}

	
	
	
}
