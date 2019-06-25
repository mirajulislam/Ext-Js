package com.App.Room;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository("roomRepository")
public interface RoomRepository extends JpaRepository<Room, Integer> {

	//SELECT * FROM `room` WHERE capacity >= 50 LIMIT 1
	
	@Query(value = "SELECT * FROM room WHERE capacity >= :capacity ORDER BY RAND() LIMIT 1", 
		      nativeQuery = true)
	Integer validCapacity(@Param("capacity") Integer capacity);

}
