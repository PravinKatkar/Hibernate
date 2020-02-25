package com.example.demo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="BankAccount")
public class BankAccount extends BillingDetails {

	@Column
	private String bankName; 

	@Column
	private String swift;

	public BankAccount(String owner, String number, String bankName, String swift) {
		super(owner, number);
		this.bankName = bankName;
		this.swift = swift;
	}

	public BankAccount() {
		super();
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getSwift() {
		return swift;
	}

	public void setSwift(String swift) {
		this.swift = swift;
	}

	@Override
	public String toString() {
		return "BankAccount [bankName=" + bankName + ", swift=" + swift + ", id=" + id + ", owner=" + owner
				+ ", number=" + number + "]";
	}
	
}
