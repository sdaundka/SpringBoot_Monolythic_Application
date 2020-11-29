package com.goodbooksread.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.goodbooksread.dao.BookRepository;
import com.goodbooksread.entity.Book;

@RestController
@RequestMapping("/books")
public class BookResource {
	
	@Autowired
	private BookRepository bookRepository;
	
	@GetMapping
	public List<Book> getBooks() {
		List<Book> bookList = new ArrayList<>();
		bookRepository.findAll().forEach(bookList::add);
		return bookList;
	}
	
	@PostMapping
	public void addBook(@RequestBody Book book) {
		System.out.println("Saving the Book");
		System.out.println(book);
		bookRepository.save(book);
	}
}
