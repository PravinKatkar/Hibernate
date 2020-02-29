package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@Autowired
	ProductService ps;
	
	@GetMapping(value="/addP")
	public String addProduct() {
		ps.addProduct();
		return "Done";
	}
	
	@GetMapping(value="/showP")
	public List<CProduct> getProducts(){
		return ps.getProducts();
	}
	
	@GetMapping(value="/chache")
	public String checkCache() {
		ps.checkCache();
		return "Done";
	}
	
	@PostMapping(value="/saveProd")
	public CProduct createProduct(@RequestBody CProduct cprod) {
		return ps.saveProd(cprod);
	}
}
