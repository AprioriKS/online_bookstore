package com.example.onlinebookstoremy.bookstore.mapper;

import com.example.onlinebookstoremy.bookstore.config.MapperConfig;
import com.example.onlinebookstoremy.bookstore.domain.entity.Book;
import com.example.onlinebookstoremy.bookstore.dto.request.CreateBookRequestDto;
import com.example.onlinebookstoremy.bookstore.dto.response.BookDto;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(config = MapperConfig.class)
public interface BookMapper {
    BookDto toDto(Book book);

    Book toModel(CreateBookRequestDto bookDto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateModelFromDto(CreateBookRequestDto requestDto, @MappingTarget Book book);
}
