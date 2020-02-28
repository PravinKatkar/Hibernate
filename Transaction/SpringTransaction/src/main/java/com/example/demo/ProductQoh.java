package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class ProductQoh implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="qoh_Id")
	private long qohId;

	//private long product_id;	 
	
	@Column
	private int qty;

	public ProductQoh() {
	}

	public ProductQoh(int qty) {
		this.qty = qty;
	}

	public Long getQohId() {
		return this.qohId;
	}

	public void setQohId(Long qohId) {
		this.qohId = qohId;
	}

	public int getQty() {
		return this.qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}



	public void setQohId(long qohId) {
		this.qohId = qohId;
	}

	

}
