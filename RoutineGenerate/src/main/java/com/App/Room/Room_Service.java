package com.App.Room;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface Room_Service {

	@Query(value = "SELECT * FROM room WHERE capacity >= :capacity ORDER BY RAND() LIMIT 1", 
		      nativeQuery = true)
	Integer validateCapacity(@Param("capacity") Integer capacity);
}
