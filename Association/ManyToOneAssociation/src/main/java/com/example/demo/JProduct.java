package com.example.demo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class JProduct {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id", updatable=false, nullable=false)
	private long id;
	
	@Column
	private String productName;
	
	@Column int productNumber;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "orderitemId" , referencedColumnName = "orderitemId")
	private JOrderItem jorderItem;

	public JProduct() {
		super();
	}
	public JProduct(String productName, int productNumber) {
		super();
		this.productName = productName;
		this.productNumber = productNumber;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(int productNumber) {
		this.productNumber = productNumber;
	}
	public JOrderItem getJorderItem() {
		return jorderItem;
	}
	public void setJorderItem(JOrderItem jorderItem) {
		this.jorderItem = jorderItem;
	}
	@Override
	public String toString() {
		return "JProduct [id=" + id + ", productName=" + productName + ", productNumber=" + productNumber
				+ ", jorderItem=" + jorderItem + "]";
	}
	
}
