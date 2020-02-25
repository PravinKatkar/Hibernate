package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillingDetailsService {

	@Autowired
	private CreditCardRepo ccrepo;
	
	@Autowired
	private BankAccoiuntRepo barepo;
	
	@Autowired
	private BillingDetailsRepo bdsrepo;
	
	public void saveBD() {
		
		CreditCard cc1 = new CreditCard("Pravin", "9765898989", "MasterCard", "09", "22");
		CreditCard cc2 = new CreditCard("Rituja", "9765898989", "ViseCard", "09", "23");
			
		BankAccount ba1 = new BankAccount("Pravin", "987878774", "ÏCICI", "32322");
		BankAccount ba2 = new BankAccount("Rajendra", "987878773", "AXIS", "32321");
		/*
		ccrepo.save(cc1);
		ccrepo.save(cc2);
		
		barepo.save(ba1);
		barepo.save(ba2);
		*/
		//CreditCard cc3 = ccrepo.getOne(1l);
		
		//System.out.println(cc3);

		//BankAccount ba3 = barepo.getOne(3l);
		
		//System.out.println(ba3);
		
		//BillingDetails ba4 = ccrepo.getOne(2l);
		
		//System.out.println(ba4);
		

		List<BillingDetails> bds = bdsrepo.findAll();
		
		for(BillingDetails bd : bds) {
			if(bd instanceof CreditCard) {
				System.out.println("Credit Card ##" + bd);
			}
			else if(bd instanceof BankAccount) {
				System.out.println("Bank Account ##" + bd);
			}
		}
	}
}
