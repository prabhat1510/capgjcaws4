package com.restfulapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restfulapp.entity.Book;
import com.restfulapp.exception.BookNotFoundException;
import com.restfulapp.service.BookService;
// http://localhost:8080/api/v1/allbooks

@RestController
@RequestMapping("/api/v1")
public class BookController {
	@Autowired
	BookService bookService;

	@GetMapping("/allbooks")
	public List<Book> getAllBooks() {
		return bookService.getAllBooks();

	}

	// http://localhost:8080/api/v1/book/15
	@GetMapping("/book/{bookId}")
	public Book getBook(@PathVariable Integer bookId) throws BookNotFoundException {
		return bookService.getBook(bookId);

	}

	// http://localhost:8080/api/v1/book?id=16
	@GetMapping("/book")
	public Book getBookUsingRequestParam(@RequestParam(name = "id") Integer bookId) throws BookNotFoundException {
		return bookService.getBook(bookId);

	}
	//http://localhost:8080/api/v1/addBook
	@PostMapping("/addbook")
	public Book addBook(@RequestBody Book newBook) {
		
		return bookService.addBook(newBook);
	}
	
	
	
	
	

}
