package com.App.Result;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository("resultRepository")
public interface ResultRepository extends JpaRepository<Result, String>{
	
//	@Query(value = "SELECT COUNT(day) FROM result WHERE facultyName = :facultyName AND day = :day", 
//		    nativeQuery = true)
//	Integer findDayPerFacultyName(
//			@Param("facultyName") String facultyName, @Param("day") String day);
	
	@Query(value = "SELECT * FROM result", 
		    nativeQuery = true)
	List <Result> findAllFromDB();
	
	
	
	@Query(value = "SELECT COUNT(day) FROM result WHERE faculty_name = :facultyName AND day = :day", 
		      nativeQuery = true)
	Integer findTotalDayPerFacultyName(
			  @Param("facultyName") String facultyName, @Param("day") String day);
	
	
	
	@Query(value = "SELECT COUNT(faculty_name) FROM result WHERE faculty_name = :facultyName", 
		      nativeQuery = true)
	Integer countDayPerFacultyName(
			  @Param("facultyName") String facultyName);
	
	
	
	//INSERT INTO result (id, batch_name, capacity, course_name, day, faculty_name, period, room_no) VALUES ('', , , , , , , );
//	@Modifying
//	@Query(value = "INSERT INTO result (id, batch_name, capacity, course_name, day, faculty_name, period, room_no) VALUES (:id, :batch_name, :capacity, :course_name, :day, :faculty_name, :period, :room_no)",nativeQuery = true)
//	void insertResult(
//			@Param("id") Integer id,
//			@Param("batch_name") String batch_name,
//			@Param("capacity") Integer capacity,
//			@Param("course_name") String course_name,
//			@Param("day") String day,
//			@Param("faculty_name") String faculty_name,
//			@Param("period") String period,
//			@Param("room_no") Integer room_no
//			);

}
