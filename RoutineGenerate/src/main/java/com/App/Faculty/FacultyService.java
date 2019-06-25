package com.App.Faculty;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service("facultyService")

public class FacultyService {
	
	@Autowired
	private FacultyRepository facultyRepository;
	
	public List<Faculty>listFacultyAll(){
		return facultyRepository.findAll();
		
	}
	


}
