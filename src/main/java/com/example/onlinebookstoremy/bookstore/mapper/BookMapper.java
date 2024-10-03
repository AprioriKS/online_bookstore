package com.example.onlinebookstoremy.bookstore.mapper;

import com.example.onlinebookstoremy.bookstore.config.MapperConfig;
import com.example.onlinebookstoremy.bookstore.domain.entity.Book;
import com.example.onlinebookstoremy.bookstore.dto.request.CreateBookRequestDto;
import com.example.onlinebookstoremy.bookstore.dto.response.BookDto;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfig.class)
public interface BookMapper {
    BookDto toDto(Book book);

    Book toModel(CreateBookRequestDto bookDto);
}
