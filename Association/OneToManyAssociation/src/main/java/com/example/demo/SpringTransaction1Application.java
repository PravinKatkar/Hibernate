package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringTransaction1Application implements CommandLineRunner {

//	  @Autowired
//	    private BookCategoryRepository bookCategoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringTransaction1Application.class, args);
	}

	@Override
	public void run(String... args) {
		// Create a couple of Book and BookCategory
		// bookCategoryRepository.save(new BookCategory("Category 1", new Book("Hello
		// Koding 1"), new Book("Hello Koding 2")));
	}
}