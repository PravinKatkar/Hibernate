package com.example.demo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class StockDailyRecord {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long recordId;

	@Column
	private Float price;

	@Column
	private Date date;

	private long stock_id;
	
	
	public StockDailyRecord(Float price, Date date, long stock_id) {
		super();
		this.price = price;
		this.date = date;
		this.stock_id = stock_id;
	}
	public StockDailyRecord()
	{
		
	}
	public long getRecordId() {
		return recordId;
	}

	public void setRecordId(long recordId) {
		this.recordId = recordId;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public long getStock_id() {
		return stock_id;
	}

	public void setStock_id(long stock_id) {
		this.stock_id = stock_id;
	}
}
