package com.example.demo;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "Stock")
public class Stock {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long stock_id;

	@Column
	private String name;

	@Column
	private String stockCode;

	@Column
	private String stockName;

	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="stock_id" , referencedColumnName = "stock_id")
	@Fetch(FetchMode.JOIN) 
	@BatchSize(size = 10)
	private Set<StockDailyRecord> sdr;
	
	/*
	 * @OneToMany(fetch = FetchType.LAZY, mappedBy = "stock_id")
	 * @Cascade( org.hibernate.annotations.CascadeType.ALL)
	 * @Fetch(FetchMode.JOIN)
	 * @BatchSize(size = 10) 
	 * private Set<StockDailyRecord> sdr;
	 */
	public Set<StockDailyRecord> getSdr() {
		return sdr;
	}

	public void setSdr(Set<StockDailyRecord> sdr) {
		this.sdr = sdr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStockCode() {
		return stockCode;
	}

	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public long getStock_id() {
		return stock_id;
	}

	public void setStock_id(long stock_id) {
		this.stock_id = stock_id;
	}
}