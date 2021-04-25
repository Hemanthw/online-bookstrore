package com.b2tech.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.b2tech.onlinebookstore.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long>{
	 
}
