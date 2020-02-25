package com.example.demo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name="JBook")
public class JBook extends JPublication {

	@Column
	private int pages;

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	@Override
	public String toString() {
		return "JBook [pages=" + pages + ", id=" + id + ", title=" + title + ", vrsion=" + vrsion + "]";
	}

	public JBook( String title, int vrsion, Date publishingDate, int pages) {
		super( title, vrsion, publishingDate);
		this.pages = pages;
	}
	
	public JBook() {
		super();
	}
}
