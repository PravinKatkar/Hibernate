package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Product")
public class Product implements java.io.Serializable {
	private static final long serialVersionUID = 2L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="product_id")
	private long product_id;
	
	@Column(name="product_Code")
	private String productCode;
	
	@Column(name="product_Desc")
	private String productDesc;	


	//@OrderBy("createdDate ASC")
	//,cascade = CascadeType.ALL, fetch=FetchType.LAZY, orphanRemoval = false)
	//@LazyCollection(LazyCollectionOption.EXTRA)
	@OneToMany( cascade = CascadeType.ALL)
	@JoinColumn(name = "product_id", referencedColumnName="product_id")	
	public List<ProductQoh> prdouctQohList = new ArrayList<ProductQoh>();
	

	public Product() {
	}

	public Product(String productCode, String productDesc) {
		this.productCode = productCode;
		this.productDesc = productDesc;
	}

	public int getListSize() {
		return prdouctQohList.size();
	}

	public long getProduct_id() {
		return product_id;
	}
	public void setProduct_id(long product_Id) {
		this.product_id = product_id;
	}
	public List<ProductQoh> getPrdouctQohList() {
		return prdouctQohList;
	}
	public void setPrdouctQohList(List<ProductQoh> prdouctQohList) {
		this.prdouctQohList = prdouctQohList;
	}
	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductDesc() {
		return this.productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
}
