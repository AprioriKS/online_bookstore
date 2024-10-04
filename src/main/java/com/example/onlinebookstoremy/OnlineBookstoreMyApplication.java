package com.example.onlinebookstoremy;

import com.example.onlinebookstoremy.bookstore.mapper.BookMapper;
import com.example.onlinebookstoremy.bookstore.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RequiredArgsConstructor
@SpringBootApplication
public class OnlineBookstoreMyApplication {

    private final BookService bookService;
    private final BookMapper bookMapper;

    public static void main(String[] args) {
        SpringApplication.run(OnlineBookstoreMyApplication.class, args);
    }

}
