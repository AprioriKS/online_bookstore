package com.example.onlinebookstoremy.bookstore.controller;

import com.example.onlinebookstoremy.bookstore.domain.entity.Book;
import com.example.onlinebookstoremy.bookstore.dto.request.CreateBookReauestDto;
import com.example.onlinebookstoremy.bookstore.dto.respnse.BookDto;
import com.example.onlinebookstoremy.bookstore.mapper.BookMapper;
import com.example.onlinebookstoremy.bookstore.service.BookService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/book")
public class BookController {
    private final BookService bookService;
    private final BookMapper bookMapper;

    @GetMapping
    public List<BookDto> findAll() {
        return bookService.findAll();
    }

    @GetMapping("/{id}")
    public BookDto getBookById(@PathVariable Long id) {
        return bookService.getBookById(id);
    }

    @PostMapping
    public Book save(@RequestBody CreateBookReauestDto requestDto) {
        return bookService.save(requestDto);
    }
}
