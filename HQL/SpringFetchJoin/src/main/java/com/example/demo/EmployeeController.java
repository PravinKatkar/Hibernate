package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	private EmpService empSrvice;
	
	@GetMapping("/saveEmp")
	public void saveEmp() {
		empSrvice.saveEmp();
	}

	@GetMapping("/showEmp")
	public List<Employee> showEmp() {
		return empSrvice.executeQuery();
	}

}
