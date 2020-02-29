package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	ProdRepo productRepo;

	public void addProduct() {
		CProduct p1 = new CProduct("SONY", 23);
		CProduct p2 = new CProduct("SAMSUNG", 12);

		productRepo.save(p1);
		productRepo.save(p2);
	}

	public List<CProduct> getProducts() {
		return productRepo.findAll();
	}

	public CProduct saveProd(CProduct cprod) {
		return productRepo.save(cprod);
	}
	public void checkCache() {


		CProduct newProduct1 = getProduct(1l);
		System.out.println("Product1 : " + newProduct1);
	

		CProduct newProduct2 = getProduct(1l);
		System.out.println("Product2 : " + newProduct2);
	
		CProduct newProduct3 = getProduct(2l);
		System.out.println("Product3 : " + newProduct3);

		CProduct newProduct4 = getProduct(1l);
		System.out.println("Product4 : " + newProduct4);

	}

	@Cacheable("CProduct")
	private CProduct getProduct(long id) {
		System.out.println("Inside ## getProduct(long id) " + id);
		Optional<CProduct> opt = productRepo.findById(id);
		return opt.isPresent() ? opt.get() : null;
	}

}
