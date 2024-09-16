package com.example.onlinebookstoremy.bookstore.service;

import com.example.onlinebookstoremy.bookstore.domain.entity.Book;
import com.example.onlinebookstoremy.bookstore.domain.entity.repository.BookRepository;
import com.example.onlinebookstoremy.bookstore.dto.request.CreateBookReauestDto;
import com.example.onlinebookstoremy.bookstore.dto.respnse.BookDto;
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
    public Book save(CreateBookReauestDto requestDto) {
        Book book = bookMapper.toModel(requestDto);
        return bookRepository.save(book);
    }

    @Override
    public BookDto getBookById(Long id) {
        return bookMapper.toDto(bookRepository.findById(id));
    }

    @Override
    public List<BookDto> findAll() {
        return bookRepository.findAll().stream()
            .map(bookMapper::toDto)
            .toList();
    }
}
