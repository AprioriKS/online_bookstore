package com.example.onlinebookstoremy.bookstore.service;

import com.example.onlinebookstoremy.bookstore.dto.request.CreateBookReauestDto;
import com.example.onlinebookstoremy.bookstore.dto.response.BookDto;
import java.util.List;

public interface BookService {

    BookDto save(CreateBookReauestDto requestDto);

    List<BookDto> findAll();

    BookDto getBookById(Long id);
}
