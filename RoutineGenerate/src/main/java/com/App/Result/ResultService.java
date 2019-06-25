package com.App.Result;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;


@Service("resultService")
public class ResultService {

	@Autowired
	private ResultRepository resultRepository;
	
	public List<Result> listAllResults() {
		return resultRepository.findAll();
	}
	//"SELECT * FROM Result r WHERE r.status = :status and r.name = :name"
	
//	public void insertResult(Result result) {
//		Result result1 = new Result("AD", "AD", "AD", 34, "AD", "AS", 5) ;
//		resultRepository.save(result1);
//	}
	
	
	
	
	}
	
