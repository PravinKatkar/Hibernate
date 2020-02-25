package com.example.demo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name="JBlogPost")
public class JBlogPost extends JPublication {

	@Column(name="url")
	private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "JBlogPost [url=" + url + ", id=" + id + ", title=" + title + ", vrsion=" + vrsion + "]";
	}

	public JBlogPost(String title, int vrsion, Date publishingDate, String url) {
		super(title, vrsion, publishingDate);
		this.url = url;
	}
	
	public JBlogPost() {
		super();
	}
}
