package com.App.Routine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

@Service("routine_Service_Imp")
public class Routine_Service_Imp implements Routine_Service{
	@Autowired
	private RoutineRepository repo;
	
//	@Query(value = "SELECT id FROM routine where period1 is null ORDER BY RAND() LIMIT 1", 
//		      nativeQuery = true)
//	public String freePeriod1() {
//		return repo.emptyPeriod1();
//	}
//	@Query(value = "SELECT id FROM routine where period2 is null ORDER BY RAND() LIMIT 1", 
//		      nativeQuery = true)
//	public String freePeriod2() {
//		return repo.emptyPeriod2();
//	}
//	@Query(value = "SELECT id FROM routine where period3 is null ORDER BY RAND() LIMIT 1", 
//		      nativeQuery = true)
//	public String freePeriod3() {
//		return repo.emptyPeriod3();
//	}
	
	
	
//	@Modifying
//	@Query("UPDATE routine set period1 = 3 where id = ")
//	void updateSchedule(@Param("status") Integer status, 
//	  @Param("name") String name);

	@Query(value = "SELECT COUNT(*) FROM routine where day = :day AND period = :period AND room_no = :room_no", 
		      nativeQuery = true)
	public Integer findBySchedule(
			  @Param("day") String day, @Param("period") String period,@Param("room_no") Integer room_no) {
		return repo.findSchedule(day, period, room_no);
	}

}
