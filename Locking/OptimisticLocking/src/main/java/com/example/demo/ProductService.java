package com.example.demo;

import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	LProdRepo productRepo;

	public void addProduct() {
		LProduct prod1 = new LProduct("IDEA", 10);
		LProduct prod2 = new LProduct("JIO", 8);

		productRepo.save(prod1);
		productRepo.save(prod2);

	}

	public void updateProductQ() {
		ExecutorService es = Executors.newFixedThreadPool(2);

		// -- User 1 update the quantity to 0
		es.execute(() -> {
			LProduct prod1 = findLProduct(1L);
			System.out.println("User 1 : find Lproduct : " + prod1);
			prod1.setQuantity(0);
			try {
				Thread.sleep(1000);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			try {
				productRepo.save(prod1);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			System.out.println("User 1 : Update Lproduct : " + prod1);
		});

		// -- User 2 updates the quantity to 7
		es.execute(() -> {
			LProduct prod1 = findLProduct(1L);
			System.out.println("User 2 : find Lproduct : " + prod1);
			prod1.setQuantity(7);
			try {
				productRepo.save(prod1);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			System.out.println("User 2 : Update Lproduct : " + prod1);
		});

		es.shutdown();
		try {
			es.awaitTermination(10, TimeUnit.MINUTES);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private LProduct findLProduct(long prodId) {
		Optional<LProduct> opt = productRepo.findById(prodId);
		return opt.isPresent() ? opt.get() : null;
	}
}
