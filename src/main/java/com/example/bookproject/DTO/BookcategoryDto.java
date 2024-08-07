package com.example.bookproject.DTO;

import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link com.example.bookproject.Entity.Bookcategory}
 */
@Value
public class BookcategoryDto implements Serializable {
    BookcategoryIdDto id;
    BookDto book;
    CategoryDto category;
    @NotNull
    Instant dateCreate;
}