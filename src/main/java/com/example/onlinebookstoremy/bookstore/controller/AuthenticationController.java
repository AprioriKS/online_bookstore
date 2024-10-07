package com.example.onlinebookstoremy.bookstore.controller;

import com.example.onlinebookstoremy.bookstore.dto.request.UserRegistrationRequestDto;
import com.example.onlinebookstoremy.bookstore.dto.response.UserResponseDto;
import com.example.onlinebookstoremy.bookstore.exception.RegistrationException;
import com.example.onlinebookstoremy.bookstore.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthenticationController {
    private final UserService userService;

    @PostMapping("/registration")
    public UserResponseDto register(
            @RequestBody @Valid UserRegistrationRequestDto userRegistrationRequestDto)
            throws RegistrationException {
        return userService.register(userRegistrationRequestDto);
    }
}
