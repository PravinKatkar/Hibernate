package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "book")
public class Book extends Publication {

	@Column
	private int pages;
	
	public String toString() {
		return "Book id: " + this.id + " Title: "  + this.title + " Pages:" + this.pages + " version:" + this.getVersion() + " Date:" + this.getPublishingdate(); 
	}
}