package com.App.Faculty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

@Service("faculty_Service_Imp")
public class Faculty_Service_Imp {

	@Autowired
	private FacultyRepository repo;
	
	@Query(value = "SELECT COUNT(day) FROM result WHERE faculty_name = :facultyName AND day = :day", 
		      nativeQuery = true)
	public Integer findDayByFacultyName(
			  @Param("facultyName") String facultyName, @Param("day") String day) {
		return repo.findDayPerFacultyName(facultyName, day);
	}
}
