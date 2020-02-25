package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffService {


	@Autowired 
	TeachingStaffRepo teachingStaffRepo;
	
	@Autowired 
	NonTeachingStaffRepo nonteachingStaffRepo;
	
	public String save() {
	    //Teaching staff entity 
	      TeachingStaff ts1 = new TeachingStaff(1,"Gopal","MSc MEd","Maths");
	      TeachingStaff ts2 = new TeachingStaff(2, "Manisha", "BSc BEd", "English");
	      
	      teachingStaffRepo.save(ts1);
	      teachingStaffRepo.save(ts2);
	      
	      //Non-Teaching Staff entity
	      NonTeachingStaff nts1 = new NonTeachingStaff(3, "Satish", "Accounts");
	      NonTeachingStaff nts2 = new NonTeachingStaff(4, "Krishna", "Office Admin");

	      nonteachingStaffRepo.save(nts1);
	      nonteachingStaffRepo.save(nts2);
	      return "Done";
	}
}
