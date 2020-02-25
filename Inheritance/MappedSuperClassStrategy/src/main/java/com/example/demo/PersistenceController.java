package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersistenceController {

	@Autowired
	PersistenceService persistenceService;

	@GetMapping("/")
	public String sayHello(){
		System.out.println("Inside PersistenceController");
		return "Hello";
	}
	
	@GetMapping("/books")
	public String getBooks(){
		System.out.println("Inside getBooks");
		final StringBuilder booksStr = new StringBuilder();
		Iterable<Book> books = persistenceService.getAllBooks();
		books.forEach(book -> booksStr.append(book).append("\n"));  
		books.forEach(book -> System.out.println(book));  
		return "Done" + booksStr.toString() ;
	}
}
