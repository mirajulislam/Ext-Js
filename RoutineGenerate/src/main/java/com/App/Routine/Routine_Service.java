package com.App.Routine;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface Routine_Service {
	
//	@Query(value = "SELECT id FROM routine where period1 is null ORDER BY RAND() LIMIT 1", 
//		      nativeQuery = true)
//	String freePeriod1();
//	@Query(value = "SELECT id FROM routine where period2 is null ORDER BY RAND() LIMIT 1", 
//		      nativeQuery = true)
//	String freePeriod2();
//	@Query(value = "SELECT id FROM routine where period3 is null ORDER BY RAND() LIMIT 1", 
//		      nativeQuery = true)
//	String freePeriod3();
	
	@Query(value = "SELECT COUNT(*) FROM routine where day = :day AND period = :period AND room_no = :room_no", 
		      nativeQuery = true)
	public Integer findBySchedule(
			  @Param("day") String day, @Param("period") String period,@Param("room_no") Integer room_no);

}
