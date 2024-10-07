package com.example.onlinebookstoremy.bookstore.service;

import com.example.onlinebookstoremy.bookstore.dto.request.CreateBookRequestDto;
import com.example.onlinebookstoremy.bookstore.dto.response.BookResponseDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BookService {

    BookResponseDto save(CreateBookRequestDto requestDto);

    BookResponseDto findById(Long id);

    Page<BookResponseDto> findAll(Pageable pageable);

    BookResponseDto update(CreateBookRequestDto requestDto, Long id);

    void delete(Long id);
}
