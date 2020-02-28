package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {


	@Autowired
	ProductService productService;
	
	@PostMapping("/addProd")
	public String addProduct(String prodName) {
		System.out.println("Product Name Passed" + prodName);
		return "name is " + prodName;
	}
	
	@GetMapping("/products")
	public List<Product> getProducts() {
		List<Product> products = null;
		try {
			products =  productService.getProducts();
			products.forEach( res -> {
				System.out.println( "Hello " + res.getProduct_id() );
			});
			System.out.println( "Before calling get size" );
			getProductQoh(products);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		
		}
		return products;
	}
	
	private void getProductQoh(List<Product> products) {
		products.forEach( res -> {
			System.out.println( "Hello " + res.getListSize() );
		});
	}
	/*
	 * @GetMapping("/") public String getName() { return "Hello Pravin"; }
	 */
	
	@GetMapping("/saveP")	
	public void getSaveP() throws Exception {
		Product product1=new Product();
		product1.setProductCode("P1");
		product1.setProductDesc("P1 DES");
		productService.saveProduct(product1);
	}
	
	@GetMapping("/save")
	public String getSave()  {
		List<Product> products = new ArrayList<>();
		
		Product product1=new Product();
		product1.setProductCode("P1");
		product1.setProductDesc("P1 DES");
		
		ProductQoh qoh = new ProductQoh(12);
		ProductQoh qoh1 = new ProductQoh(13);
		ProductQoh qoh2 = new ProductQoh(124);
		
		product1.getPrdouctQohList().add(qoh);
		product1.getPrdouctQohList().add(qoh1);
		product1.getPrdouctQohList().add(qoh2);
		
		Product product2=new Product();
		product2.setProductCode("P2");
		product2.setProductDesc("P2 DES");

		ProductQoh qoh3 = new ProductQoh(133);
		ProductQoh qoh4 = new ProductQoh(1294);
		
		product2.getPrdouctQohList().add(qoh3);
		product2.getPrdouctQohList().add(qoh4);
		
		
		products.add(product1);
		products.add(product2);

		
		try {
			productService.saveAllProducts(products);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "Sucess";
	}
}
