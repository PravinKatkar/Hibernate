package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JoinedController {

	@Autowired
	JoinedService js;
	
	@GetMapping("/pb")
	public String savePub() {
		js.savePub();
		return "Hello";
	}

	@GetMapping("/demo")
	public String demoPub() {
		return "Hello";
	}
	
}
