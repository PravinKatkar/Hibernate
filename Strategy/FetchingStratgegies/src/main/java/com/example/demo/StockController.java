package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {

	@Autowired
	StockService ss;
	
	@GetMapping("/saveS")
	public String saveStock() {
		
		ss.saveStock();
		return "Done";
	}
	
	
	@GetMapping("/showS")
	public String showStocks() {
		ss.showStocks();
		return "Done";
	}
}
