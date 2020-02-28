package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	@Transactional(rollbackFor=Exception.class,propagation= Propagation.REQUIRES_NEW)
	public List<Product> getProducts() throws Exception {
		 List<Product> products = null;		
		 products = productRepository.findAll();
		/*
		 * int i = 9; if(i == 9) { throw new Exception(); }
		 */
		 return products;
	}
	
	@Transactional(rollbackFor=Exception.class,propagation= Propagation.REQUIRES_NEW)	
	public void saveProduct(Product prod) throws Exception{
		prod.setProductCode("23");
		productRepository.saveAndFlush(prod);
		
		int i = 2;
		if(i == 2) {
			throw new Exception();
		}

		prod.setProductCode("24");
		productRepository.saveAndFlush(prod);		
	}
	
	@Transactional(rollbackFor=Exception.class,propagation= Propagation.REQUIRES_NEW)
	public void saveAllProducts(List<Product> products) throws Exception {
		
		
		/*
		 * products.forEach(product->{ try { saveEachProduct(product); } catch
		 * (Exception e) { // TODO Auto-generated catch block e.printStackTrace();
		 * e.printStackTrace();} });
		 */
			
		  for(Product product : products) { saveEachProduct(product); }
		 
	}
	int i = 1;
	@Transactional(rollbackFor=Exception.class,propagation= Propagation.REQUIRED)
	private  void saveEachProduct(Product product) throws Exception {
		System.out.print("============== saveEachProduct: call ==========");
		System.out.println("BEFORE: "+ i);
		productRepository.save(product);		
	
		if(i == 2) {
			throw new Exception();
		}
		i+=1;
		System.out.println("AFTER: "+ i);
	}
}
