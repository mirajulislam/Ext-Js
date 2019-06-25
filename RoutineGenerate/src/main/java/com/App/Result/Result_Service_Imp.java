package com.App.Result;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

@Service("result_Service_Imp")
public class Result_Service_Imp implements Result_Service{
	
	@Autowired
	private ResultRepository resultRepository;
	
	@Query(value = "SELECT * FROM result", 
		    nativeQuery = true)
	public List <Result> findAllListFromDB(){
		return resultRepository.findAllFromDB();
	}
	
	
	// Total day count per Week for a specific faculty.
	// One can take at most one class par day
	@Query(value = "SELECT COUNT(day) FROM result WHERE faculty_name = :facultyName AND day = :day", 
		      nativeQuery = true)
	public Integer findTotalDayByFacultyName(
			  @Param("facultyName") String facultyName, @Param("day") String day) {
		return resultRepository.findTotalDayPerFacultyName(facultyName, day);
	}
	
	
	
	// count facultyName by weekly
	// One can take at most 2 classes per week.
	@Query(value = "SELECT COUNT(faculty_name) FROM result WHERE faculty_name = :facultyName", 
		      nativeQuery = true)
	@Override
	public Integer countDayByFacultyName(@Param("facultyName") String facultyName) {
		return resultRepository.countDayPerFacultyName(facultyName);
	}
	
	//INSERT INTO result (id, batch_name, capacity, course_name, day, faculty_name, period, room_no) VALUES ('', , , , , , , );
	
//	@Modifying
//	@Query
//	(value = "INSERT INTO result (id, batch_name, capacity, course_name, day, faculty_name, period, room_no) VALUES (:id, :batch_name, :capacity, :course_name, :day, :faculty_name, :period, :room_no)",nativeQuery = true)
//	@Override
//	public void insertInResult(
//			@Param("id") Integer id,
//			@Param("batch_name") String batch_name,
//			@Param("capacity") Integer capacity,
//			@Param("course_name") String course_name,
//			@Param("day") String day,
//			@Param("faculty_name") String faculty_name,
//			@Param("period") String period,
//			@Param("room_no") Integer room_no
//			) {
//		resultRepository.insertResult(id, batch_name, capacity, course_name, day, faculty_name, period, room_no);
//	}
	
	

	

}
