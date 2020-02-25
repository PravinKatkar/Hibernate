package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "blogpost")
public class BlogPost extends Publication {

	@Column
	private String url;
}