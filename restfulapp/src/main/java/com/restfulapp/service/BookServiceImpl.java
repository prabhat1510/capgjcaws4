package com.restfulapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restfulapp.entity.Book;
import com.restfulapp.exception.BookNotFoundException;
import com.restfulapp.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	BookRepository bookRepository;
	
	@Override
	public List<Book> getAllBooks() {
		
		return (List<Book>) bookRepository.findAll();
	}

	@Override
	public Book getBook(Integer bookId) throws BookNotFoundException{
		/**
		Optional<Book> book = bookRepository.findById(bookId);
	
		if(book.isPresent()) {
			return book.get();
		}else {
			return new Book();
		}**/
		
		return  bookRepository.findById(bookId).orElseThrow(()-> new BookNotFoundException(bookId));
		
	}

	@Override
	public Book addBook(Book newBook) {
		return bookRepository.save(newBook);
	}

}
