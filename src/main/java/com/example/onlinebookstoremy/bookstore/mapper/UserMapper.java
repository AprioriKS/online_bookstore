package com.example.onlinebookstoremy.bookstore.mapper;

import com.example.onlinebookstoremy.bookstore.config.MapperConfig;
import com.example.onlinebookstoremy.bookstore.domain.entity.User;
import com.example.onlinebookstoremy.bookstore.dto.request.UserRegistrationRequestDto;
import com.example.onlinebookstoremy.bookstore.dto.response.UserResponseDto;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfig.class)
public interface UserMapper {
    User toModel(UserRegistrationRequestDto userRegistrationRequestDto);

    UserResponseDto toDto(User user);
}
