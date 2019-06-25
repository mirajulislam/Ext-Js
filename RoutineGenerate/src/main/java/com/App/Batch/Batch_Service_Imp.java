package com.App.Batch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
@Service("batch_Service_Imp")
public class Batch_Service_Imp implements Btach_Service_Search{
	@Autowired
	private BatchRepository batchRepository;
	
	public Batch findBatchBybatchName(String batchName) {
		// TODO Auto-generated method stub
		return batchRepository.findBybatchName(batchName);
	}

	@Query(value = "SELECT COUNT(day) FROM result WHERE batch_name = :batchName AND day = :day", 
			nativeQuery = true)
	public Integer findDayByBatchName(
			@Param("batchName") String batchName, @Param("day") String day) {
		return batchRepository.findDayPerBatchName(batchName, day);
	}
	

}
