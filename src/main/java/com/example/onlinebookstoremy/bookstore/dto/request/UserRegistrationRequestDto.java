package com.example.onlinebookstoremy.bookstore.dto.request;

import com.example.onlinebookstoremy.bookstore.domain.entity.Role;
import com.example.onlinebookstoremy.bookstore.validators.FieldMatch;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.util.Set;
import lombok.Data;

@Data
@FieldMatch(first = "password", second = "repeatPassword")
public class UserRegistrationRequestDto {

    private Long id;

    @NotBlank
    @Size(min = 4, max = 64)
    private String username;

    @NotBlank
    @Size(min = 4, max = 64)
    @Email
    private String email;

    @NotBlank
    @Size(min = 6, max = 64)
    private String password;

    @NotBlank
    @Size(min = 6, max = 64)
    private String repeatPassword;

    @NotBlank
    @Size(min = 2, max = 128)
    private String firstName;

    @NotBlank
    @Size(min = 2, max = 128)
    private String lastName;

    private String shippingAddress;

    private Set<Role> roles;
}
