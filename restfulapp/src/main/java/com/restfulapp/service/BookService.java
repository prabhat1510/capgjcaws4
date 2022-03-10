package com.restfulapp.service;

import java.util.List;

import com.restfulapp.entity.Book;
import com.restfulapp.exception.BookNotFoundException;

public interface BookService {
	
	public List<Book> getAllBooks();

	public Book getBook(Integer bookId) throws BookNotFoundException;

	public Book addBook(Book newBook);

}
