package com.example.onlinebookstoremy.bookstore.service;

import com.example.onlinebookstoremy.bookstore.domain.entity.Book;
import com.example.onlinebookstoremy.bookstore.domain.repository.BookRepository;
import com.example.onlinebookstoremy.bookstore.dto.request.CreateBookReauestDto;
import com.example.onlinebookstoremy.bookstore.dto.response.BookDto;
import com.example.onlinebookstoremy.bookstore.mapper.BookMapper;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    @Override
    public BookDto save(CreateBookReauestDto createBookRequestDto) {
        Book book = bookMapper.toBookEntity(createBookRequestDto);
        bookRepository.save(book);
        return bookMapper.toBookDto(book);
    }

    @Override
    public BookDto getBookById(Long id) {
        return bookMapper.toBookDto(bookRepository.findById(id));
    }

    @Override
    public List<BookDto> findAll() {
        return bookRepository.findAll().stream()
            .map(bookMapper::toBookDto)
            .toList();
    }
}
