package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Book")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int book_id;

	private String name;

	private int cat_id;
	
	public Book(String name) {
		this.name = name;
	}
	
	public Book() {
		super();
	}


	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Book(String name, int cat_id) {
		super();
		this.name = name;
		this.cat_id = cat_id;
	}

}
