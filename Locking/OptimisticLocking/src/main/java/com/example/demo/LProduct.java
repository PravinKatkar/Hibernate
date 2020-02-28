package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table
public class LProduct {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	@Column
	private String pName;
	
	@Column
	private int quantity;

	@Version
	private int version;
	
	public LProduct() {
		
	}
	public LProduct(String pName, int quantity) {
		super();
		this.pName = pName;
		this.quantity = quantity;
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int getVersion() {
		return version;
	}
	
	public void setVersion(int version) {
		this.version = version;
	}
	@Override
	public String toString() {
		return "LProduct [id=" + id + ", pName=" + pName + ", quantity=" + quantity + ", version=" + version + "]";
	}	
}
