package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersistenceService {


	@Autowired
	BlogPostRepository blogPostRepository;
	
	@Autowired
	BookRepository bookRepository;
	
	
	public Iterable<Book> getAllBooks(){
		return bookRepository.findAll();
	}
	

	public Iterable<BlogPost> getAllBlogPost(){
		return blogPostRepository.findAll();
	}
	
}
