package com.example.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class StaffController {

	@Autowired StaffService staffService;

	@GetMapping("/show")
	public String show() {
		
		return staffService.save();
	}
}
