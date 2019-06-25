package com.App.Routine;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository("routineRepository")
public interface RoutineRepository extends JpaRepository<Routine, String>{

//	@Query(value = "SELECT id FROM routine where period1 is null ORDER BY RAND() LIMIT 1", 
//		      nativeQuery = true)
//	String emptyPeriod1();
//	
//	@Query(value = "SELECT id FROM routine where period2 is null ORDER BY RAND() LIMIT 1", 
//		      nativeQuery = true)
//	String emptyPeriod2();
//	
//	@Query(value = "SELECT id FROM routine where period3 is null ORDER BY RAND() LIMIT 1", 
//		      nativeQuery = true)
//	String emptyPeriod3();
	
	
	
//	@Modifying
//	@Query("UPDATE routine set period1 = 3 where id = ")
//	void updateSchedule(@Param("period") String period, 
//	  @Param("name") String name);
	
	//SELECT COUNT(*) FROM routine where day = "Saturday" AND period = "period1" AND room_no = 5
	
	@Query(value = "SELECT COUNT(*) FROM routine where day = :day AND period = :period AND room_no = :room_no", 
		      nativeQuery = true)
	public Integer findSchedule(
			  @Param("day") String day, @Param("period") String period,@Param("room_no") Integer room_no);

}
