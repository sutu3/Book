package com.example.bookproject.DTO;

import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.example.bookproject.Entity.BookcategoryId}
 */
@Value
public class BookcategoryIdDto implements Serializable {
    @NotNull
    Integer bookId;
    @NotNull
    Integer categoryId;
}