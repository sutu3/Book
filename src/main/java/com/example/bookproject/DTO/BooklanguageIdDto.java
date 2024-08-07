package com.example.bookproject.DTO;

import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.example.bookproject.Entity.BooklanguageId}
 */
@Value
public class BooklanguageIdDto implements Serializable {
    @NotNull
    Integer bookId;
    @NotNull
    Integer languageId;
}