package com.App.Routine;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service("routineService")
public class RoutineService {

	@Autowired
	private RoutineRepository routineRepository;
	
	public List<Routine> listAllRoutines() {
		
		return routineRepository.findAll();
	}
	
}
