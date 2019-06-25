package com.App;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.App.Batch.Batch;
import com.App.Batch.BatchRepository;
import com.App.Batch.BatchService;
import com.App.Batch.Batch_Service_Imp;
import com.App.Result.Result;
import com.App.Result.ResultRepository;
import com.App.Result.Result_Service_Imp;
import com.App.Room.RoomRepository;
import com.App.Room.Room_Service_Imp;
import com.App.Routine.Routine_Service_Imp;
import com.App.connection.DbConnection;
import com.App.connection.Test;



@SpringBootApplication
public class RoutineGenerateApplication implements CommandLineRunner{
	@Autowired
	BatchService batchService;
	
	@Autowired
	Batch_Service_Imp batch_Service_Imp;
	
	@Autowired
	private ResultRepository resultRepository;
	
	@Autowired
	private RoomRepository roomRepository;
	
	@Autowired 
	Routine_Service_Imp routine_Service_Imp;
	
	@Autowired
	Result_Service_Imp result_Service_Imp;
	
	@Autowired
	Room_Service_Imp room_Service_Imp;
	//Hard coded value
	String facultyName = "Mush";
	String batchName= "B1";
	String courseName= "Data structure";	
	
	

	public static void main(String[] args) {
		SpringApplication.run(RoutineGenerateApplication.class, args);
	}
	
public void run(String... strings) throws Exception {
//	Batch batch=new Batch();
//	batch.setBatchName("A3");
//	Batch batchNameExists = batch_Service_Imp.findBatchBybatchName(batch.getBatchName());
//	  
//	  if(batchNameExists != null) {
//	  System.out.println("This is all Ready Exites");
//	  }
	
	//Test t1=new Test();
	
	//t1.show();
	
	
//	
//	batchRepository.save(new Batch(1, "A1",40));
//	batchRepository.save(new Batch(2, "A2",40));
	
	//System.out.println(imp.findDayByFacultyName("Tamim", "Saturday"));	
//	batchRepository.FindByBatchName("A1");

		//System.out.println(resultRepository.findAllFromDB());
		//System.out.println(batch_Service_Imp.findDayByBatchName("A1", "Saturday"));
		
		//System.out.println(imp.findAllListFromDB());
	
		//System.out.println(repo.validCapacity(50));
		
		//System.out.println(routine_Service_Imp.findBySchedule("Saturday", "period1", 3));
	
	
//		
//		String [] str =new String[2];
//		//gives u empty day and period as well!!
//		str = periodIsEmpty(50);
//		System.out.println(str[0]+" "+str[1]+ str[2]);
//		
//	
//		//System.out.println(result_Service_Imp.findTotalDayByFacultyName(facultyName, "Saturday"));
//		//System.out.println(result_Service_Imp.countDayByFacultyName(facultyName));
//
//	String facultyValidation=facultyValidation(facultyName,str[0]);
//	
//	System.out.println(facultyValidation);
		//if(facultyValidation=="Success") {
			
		//}
	
	
	
//	Result result1 = new Result("AD d", "AD ds", "AD rewd", 34, "AD sff", "AS fdz", 12) ;
//	resultRepository.save(result1);
		
	}

	// check if a faculty is satisfied the condition
	private String facultyValidation(String faculty,String day) {
		int sameDayClassNo = result_Service_Imp.findTotalDayByFacultyName(faculty,day);
		int totalDaysPerWeek = result_Service_Imp.countDayByFacultyName(faculty);
		
		if((sameDayClassNo == 0) && (totalDaysPerWeek < 2)) {
			return "Ok";
		}
		else if((sameDayClassNo > 0) && (totalDaysPerWeek < 2)) {
			
			return "tryAnotherDay";
		}
		else
			return "alreadyGetTwoClasses";
			
	}
	
	 int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
	 String randomDay() {
		String[] days = {"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
		int randomDayIndex = getRandomNumberInRange(0,6);
		 return days[randomDayIndex];
	 }
	 String randomPeriod() {
		 String[] periods = {"period1","period2","period3"};		
		 int randomPeriodIndex = getRandomNumberInRange(0,2);
		 return periods[randomPeriodIndex];
	 }
	
	String[] periodIsEmpty(int capacity) {
		String[] arr = new String[3];
		
		String[] days = {"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
		
		int flag = 0;
		
		while(flag!=1) {
			int roomNo = room_Service_Imp.validateCapacity(capacity);
			String day = randomDay();
			String period = randomPeriod();
			if(routine_Service_Imp.findBySchedule(day, period, roomNo)==0) {
				arr[0]=day;
				arr[1]= period;
				arr[2]=String.valueOf(roomNo);
				return arr;
			}
			periodIsEmpty(capacity);
		}

		return arr;
	}
		

}
