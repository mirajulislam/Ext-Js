package com.App.Room;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="room")
public class Room {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int id;
	private int capacity;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public Room(int id, int capacity) {
		super();
		this.id = id;
		this.capacity = capacity;
	}
	public Room() {
		
		// TODO Auto-generated constructor stub
	}
	
	
}
