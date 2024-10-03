package com.example.onlinebookstoremy.bookstore.controller;

import com.example.onlinebookstoremy.bookstore.dto.request.CreateBookRequestDto;
import com.example.onlinebookstoremy.bookstore.dto.response.BookDto;
import com.example.onlinebookstoremy.bookstore.service.BookService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Books store", description = "Endpoints for managing books")
@RequiredArgsConstructor
@RestController
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;

    @Operation(summary = "Get all books")
    @GetMapping
    public List<BookDto> getAll(Pageable pageable) {
        return bookService.findAll(pageable);
    }

    @Operation(summary = "Get a book", description = "Get a particular book by id")
    @GetMapping("/{id}")
    public BookDto getBookById(@PathVariable Long id) {
        return bookService.findById(id);
    }

    @Operation(summary = "Create a new book", description = "Create a new book")
    @PostMapping
    public BookDto create(@RequestBody @Valid CreateBookRequestDto bookDto) {
        return bookService.save(bookDto);
    }

    @Operation(summary = "Update a book", description = "Update a particular book by id")
    @PutMapping("/{id}")
    public BookDto update(@RequestBody @Valid CreateBookRequestDto bookDto, @PathVariable Long id) {
        return bookService.update(bookDto, id);
    }

    @Operation(summary = "Delete a book", description = "Delete a particular book by id")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        bookService.delete(id);
    }
}
