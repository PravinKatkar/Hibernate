package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService prodService;
		
	@GetMapping(value="/addP")
	public String addProduct() {
		prodService.addProduct();
		return "Done";
	}
	
	@GetMapping("/updateQ")
	public String updateProductQ() {
		prodService.updateProductQ();
		return "Done";
	}
	

}
