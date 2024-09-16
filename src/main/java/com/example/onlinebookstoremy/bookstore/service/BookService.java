package com.example.onlinebookstoremy.bookstore.service;

import com.example.onlinebookstoremy.bookstore.domain.entity.Book;
import com.example.onlinebookstoremy.bookstore.dto.request.CreateBookReauestDto;
import com.example.onlinebookstoremy.bookstore.dto.respnse.BookDto;
import java.util.List;

public interface BookService {

    Book save(CreateBookReauestDto requestDto);

    List<BookDto> findAll();

    BookDto getBookById(Long id);
}
