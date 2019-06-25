package com.App.Faculty;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IFaculty_Service {
	@Query(value = "SELECT COUNT(day) FROM result WHERE faculty_name = :facultyName AND day = :day", 
		      nativeQuery = true)
	Integer findDayByFacultyName(
			  @Param("facultyName") String facultyName, @Param("day") String day);
}
