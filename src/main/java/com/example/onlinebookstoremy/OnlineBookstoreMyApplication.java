package com.example.onlinebookstoremy;

import com.example.onlinebookstoremy.bookstore.domain.entity.Book;
import com.example.onlinebookstoremy.bookstore.mapper.BookMapper;
import com.example.onlinebookstoremy.bookstore.service.BookService;
import java.math.BigDecimal;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@RequiredArgsConstructor
@SpringBootApplication
public class OnlineBookstoreMyApplication {

    private final BookService bookService;
    private final BookMapper bookMapper;

    public static void main(String[] args) {
        SpringApplication.run(OnlineBookstoreMyApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            Book testBook = Book.builder()
                    .title("Title")
                    .author("Author")
                    .isbn("Isbn")
                    .coverImage("CoverImage")
                    .description("Description")
                    .price(BigDecimal.TEN)
                    .build();
        };
    }

}
