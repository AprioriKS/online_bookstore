package com.example.onlinebookstoremy.bookstore.domain.repository;

import com.example.onlinebookstoremy.bookstore.domain.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
