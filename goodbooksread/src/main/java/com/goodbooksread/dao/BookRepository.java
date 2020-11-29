package com.goodbooksread.dao;

import org.springframework.data.repository.CrudRepository;

import com.goodbooksread.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {

	Book findByNameAndAuthor(String name, String author);
}
