package com.example.onlinebookstoremy.bookstore.service;

import com.example.onlinebookstoremy.bookstore.dto.request.CreateBookRequestDto;
import com.example.onlinebookstoremy.bookstore.dto.response.BookDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BookService {

    BookDto save(CreateBookRequestDto requestDto);

    BookDto findById(Long id);

    Page<BookDto> findAll(Pageable pageable);

    BookDto update(CreateBookRequestDto requestDto, Long id);

    void delete(Long id);
}
