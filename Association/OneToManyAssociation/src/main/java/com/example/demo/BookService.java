package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

	@Autowired
	private BookCategoryRepository bookCategoryRepository;
	  
	@Autowired
	private BookRepository bookRepository;
	
	public void saveBooks() {
		BookCategory bc = new BookCategory("Category 1 ");
		bc = bookCategoryRepository.save(bc);
		
		Book b1 = new Book("Hello Koding 3",bc.getCat_id());
		Book b2 = new Book("Hello Koding 4", bc.getCat_id());

		bookRepository.save(b1);
		bookRepository.save(b2);
	}

	public List<BookCategory> getBookCategory() {
		return bookCategoryRepository.findAll();
	}
}