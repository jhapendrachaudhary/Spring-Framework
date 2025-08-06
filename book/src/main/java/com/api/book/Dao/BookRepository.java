package com.api.book.Dao;

import org.springframework.data.repository.CrudRepository;

import com.api.book.entities.book;
import java.util.List;


public interface BookRepository extends CrudRepository<book,Integer> {

    public book findByBookId(int bookId);
} 
