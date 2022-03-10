package com.restfulapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.restfulapp.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {

}
