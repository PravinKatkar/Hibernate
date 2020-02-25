package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	@Autowired
	private BookService bs;
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello Pravin";
	}
	
	@GetMapping("/sb")
	public String saveBooks() {
		bs.saveBooks();
		return "Done";
	}
	
	@GetMapping("/showBooks")
	public List<Book> getCategory() {
		List<Book> books = new ArrayList<Book>();
		List<BookCategory> bcl = bs.getBookCategory();
		for(BookCategory bc: bcl) {
			List<Book> bs = bc.getBooks();
			for(Book b: bs) {
				books.add(b);
			}
		}
		return books;
	}
}
