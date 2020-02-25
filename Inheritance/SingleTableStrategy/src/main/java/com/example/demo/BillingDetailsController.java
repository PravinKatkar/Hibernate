package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BillingDetailsController {

	@Autowired
	private BillingDetailsService bds;
	
	@GetMapping (value="/bd")
	public String getBankDetails() {
		bds.saveBD();
		return "Done";
	}
}
