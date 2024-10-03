package com.example.onlinebookstoremy.bookstore.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateBookRequestDto {
    @NotNull
    private String title;

    @NotNull
    private String author;

    @NotNull
    @Pattern(regexp = "//d{13}", message = "Should be a valid ISBN number: 13 numbers only!")
    private String isbn;

    @NotNull
    @Min(0)
    private BigDecimal price;
    private String description;
    private String coverImage;
}
