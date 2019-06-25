package com.App.Batch;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface Btach_Service_Search {
	
public Batch findBatchBybatchName(String batchName);

	@Query(value = "SELECT COUNT(day) FROM result WHERE batch_name = :batchName AND day = :day", 
			nativeQuery = true)
	Integer findDayByBatchName(
			@Param("batchName") String batchName, @Param("day") String day);
}
