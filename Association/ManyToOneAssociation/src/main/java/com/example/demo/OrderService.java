package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	
	@Autowired
	OrderRepo orp;

	@Autowired 
	OrderItemRepo oirp;
	
	@Autowired
	ProductRepository pr;
	
	public void saveOrder() {
				
		JOrder o1 = new JOrder("myOrder");
		o1 = orp.save(o1);
		
		JOrderItem oi1p1 = new JOrderItem();
		oi1p1.setSeqNo(1);
		oi1p1.setOrder(o1);
		oirp.save(oi1p1);		
		
		JOrderItem oi1p2 = new JOrderItem();
		oi1p2.setSeqNo(2);
		oi1p2.setOrder(o1);
		oirp.save(oi1p2);		
		

		JOrderItem oi1p3 = new JOrderItem();
		oi1p3.setSeqNo(3);
		oi1p3.setOrder(o1);
		oirp.save(oi1p3);		
	
		
		JProduct p = new JProduct();
		p.setProductName("sam");
		p.setJorderItem(oi1p2);
		
		pr.save(p);
	}
	
	public List<JOrder> getOrders(){
		return orp.findAll();
	}
	
	public List<JProduct> showProd(){
		return pr.findAll();
	}
	
}
