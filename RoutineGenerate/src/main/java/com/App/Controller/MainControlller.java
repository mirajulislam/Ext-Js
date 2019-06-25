package com.App.Controller;

import java.util.List;
import java.util.Random;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.App.Batch.Batch;
import com.App.Batch.BatchService;
import com.App.Batch.Batch_Service_Imp;
import com.App.Course.Course;
import com.App.Course.CourseService;
import com.App.Faculty.Faculty;
import com.App.Faculty.FacultyService;
import com.App.Result.ResultRepository;
import com.App.Result.Result_Service_Imp;
import com.App.Room.RoomRepository;
import com.App.Room.Room_Service_Imp;
import com.App.Routine.Routine_Service_Imp;

@Controller
public class MainControlller {
	@Autowired
	BatchService batchService;

	@Autowired
	Batch_Service_Imp batch_Service_Imp;

	@Autowired
	private FacultyService facultyServices;

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
//	@Autowired
//	Batch_Service_Imp batch_Service_Imp;
//	@Autowired
//	Routine_Service_Imp routine_Service_Imp;
//	
//	//Hard coded value
//	String facultyName = "Shakib";
//	String batchName= "B1";
//	String courseName= "Data structure";

	@RequestMapping(value = { "/", "/insert" }, method = RequestMethod.GET)
	public ModelAndView insert(Model model1) {

		ModelAndView model = new ModelAndView();

//	  Batch batch=new Batch();
//	  List<Batch>listbatch=batchService.listAllBatches();
//	  model1.addAttribute("batches",listbatch);

//	  
//	  Course course=new Course();
//	  List<Course>listcourse=courseService.listCourseAll();
//	  model1.addAttribute("courses",listcourse);

//	  Faculty faclty=new Faculty();
//	  List<Faculty>listfaculty=facultyService.listFacultyAll();
//	  model1.addAttribute("facultys",listfaculty);

		model.setViewName("user/Menu");
		return model;
	}

//	
//	@RequestMapping(value= {"/signup"}, method=RequestMethod.GET)
//	 public ModelAndView signup() {
//	  ModelAndView model = new ModelAndView();
//	  Batch batch = new Batch();
//	  model.addObject("batch", batch);
//	  model.setViewName("signup");
//	  
//	  return model;
//	 }
//	
//	@RequestMapping(value= {"/signup"}, method=RequestMethod.GET)
//	 public String signup() { 
//	  return "index";
//	 }
//	
	@RequestMapping(value = { "/datasave" }, method = RequestMethod.POST)
	public ModelAndView createUser(@Valid Batch batch, BindingResult bindingResult) {
		ModelAndView model = new ModelAndView();
//	  Batch batchNameExists = batch_Service_Imp.findBatchBybatchName(batch.getBatchname());
//	  
//	  if(batchNameExists != null) {
//		  bindingResult.rejectValue("batchname", "error.user", "This Batch name already exists!");
//	  }else {
//		  model.addObject("msg", "User has been registered successfully!");
//		  model.setViewName("signup");
//	  }

		String[] str = new String[2];
		// gives u empty day and period as well!!
		str = periodIsEmpty(50);
		System.out.println(str[0] + " " + str[1] +" " + str[2]);
		Faculty faculty1 = new Faculty();
		System.out.println(faculty1.getName());
		
		String facultyValidation = facultyValidation(faculty1.getName(), str[0]);

		System.out.println(facultyValidation);

		return model;
	}

	private String facultyValidation(String faculty, String day) {
		int sameDayClassNo = result_Service_Imp.findTotalDayByFacultyName(faculty, day);
		int totalDaysPerWeek = result_Service_Imp.countDayByFacultyName(faculty);

		if ((sameDayClassNo == 0) && (totalDaysPerWeek < 2)) {
			return "Ok";
		} else if ((sameDayClassNo > 0) && (totalDaysPerWeek < 2)) {

			return "tryAnotherDay";
		} else
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
		String[] days = { "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };
		int randomDayIndex = getRandomNumberInRange(0, 6);
		return days[randomDayIndex];
	}

	String randomPeriod() {
		String[] periods = { "period1", "period2", "period3" };
		int randomPeriodIndex = getRandomNumberInRange(0, 2);
		return periods[randomPeriodIndex];
	}

	String[] periodIsEmpty(int capacity) {
		String[] arr = new String[3];

		String[] days = { "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };

		int flag = 0;

		while (flag != 1) {
			int roomNo = room_Service_Imp.validateCapacity(capacity);
			String day = randomDay();
			String period = randomPeriod();
			if (routine_Service_Imp.findBySchedule(day, period, roomNo) == 0) {
				arr[0] = day;
				arr[1] = period;
				arr[2] = String.valueOf(roomNo);
				return arr;
			}
			periodIsEmpty(capacity);
		}

		return arr;
	}

}
