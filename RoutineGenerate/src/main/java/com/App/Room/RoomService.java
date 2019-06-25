package com.App.Room;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


public class RoomService {

	@Autowired
	private RoomRepository RoomRepository;
	
	public List<Room>listRoomAll(){
		return RoomRepository.findAll();
		
	}
}
