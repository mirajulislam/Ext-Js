package com.App.Room;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

@Service("room_Service_Imp")
public class Room_Service_Imp implements Room_Service{
	@Autowired
	private RoomRepository repo;
	
	@Query(value = "SELECT * FROM room WHERE capacity >= :capacity ORDER BY RAND() LIMIT 1", 
		      nativeQuery = true)
	public Integer validateCapacity(@Param("capacity") Integer capacity) {
		
	  return repo.validCapacity(capacity);
	}
}
