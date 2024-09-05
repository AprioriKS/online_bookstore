package com.example.onlinebookstoremy.bookstore.service;

import com.example.onlinebookstoremy.bookstore.domain.entity.Book;
import java.util.List;

public interface BookService {

    Book save(Book book);

    List<Book> findAll();
}
