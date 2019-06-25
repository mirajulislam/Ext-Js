package com.App.Faculty;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository("facultyRepository")

public interface FacultyRepository extends JpaRepository<Faculty, Integer> {

	@Query(value = "SELECT COUNT(day) FROM result WHERE faculty_name = :facultyName AND day = :day", 
		      nativeQuery = true)
	Integer findDayPerFacultyName(
			  @Param("facultyName") String facultyName, @Param("day") String day);
}
