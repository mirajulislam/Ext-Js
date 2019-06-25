package com.App.Course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service("courseService")
public class CourseService {
	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course>listCourseAll(){
		return courseRepository.findAll();
		
	}

}
