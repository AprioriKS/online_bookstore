package com.example.onlinebookstoremy.bookstore.dto.response;

import lombok.Data;

@Data
public class UserResponseDto {
    private Long id;
    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private String shippingAddress;
}
