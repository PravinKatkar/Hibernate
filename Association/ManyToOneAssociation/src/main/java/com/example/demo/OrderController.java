package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@Autowired 
	private OrderService orderService;

	
	@GetMapping("/saveO")
	public String saveOrder() {
		orderService.saveOrder();
		return "done";
	}

	@GetMapping("/showOrder")
	public List<JOrder> showOrder() {
		return orderService.getOrders();
	}
	
	@GetMapping("/showProd")
	public List<JProduct> showProd() {
		return orderService.showProd();
	}
	
	public OrderController() {
		super();
		System.out.println("Hello");

	}
	

}
