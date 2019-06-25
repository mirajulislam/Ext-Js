package com.App.Batch;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository("batchRepository")
public interface BatchRepository extends JpaRepository<Batch, Integer>{
//	
   Batch findBybatchName(String batchName);

   @Query(value = "SELECT COUNT(day) FROM result WHERE batch_name = :batchName AND day = :day", 
		      nativeQuery = true)
	Integer findDayPerBatchName(
			  @Param("batchName") String batchName, @Param("day") String day);
}
