package com.example.demo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="CreditCard")
public class CreditCard extends BillingDetails {

	@Column
	private String type;
	
	@Column
	private String expMonth;
	
	@Column
	private String expYear;

	
	public CreditCard(String owner, String number, String type, String expMonth, String expYear) {
		super(owner, number);
		this.type = type;
		this.expMonth = expMonth;
		this.expYear = expYear;
	}

	public CreditCard()	{
		super();
	}
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getExpMonth() {
		return expMonth;
	}

	public void setExpMonth(String expMonth) {
		this.expMonth = expMonth;
	}

	public String getExpYear() {
		return expYear;
	}

	public void setExpYear(String expYear) {
		this.expYear = expYear;
	}

	@Override
	public String toString() {
		return "CreditCard [type=" + type + ", expMonth=" + expMonth + ", expYear=" + expYear + ", id=" + id
				+ ", owner=" + owner + ", number=" + number + "]";
	}

	

}
