package com.example.onlinebookstoremy.bookstore.service;

import com.example.onlinebookstoremy.bookstore.dto.request.UserRegistrationRequestDto;
import com.example.onlinebookstoremy.bookstore.dto.response.UserResponseDto;

public interface UserService {

    UserResponseDto register(UserRegistrationRequestDto userRegistrationRequestDto);
}
