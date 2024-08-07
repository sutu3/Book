package com.example.bookproject.DTO;

import jakarta.validation.constraints.Size;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.example.bookproject.Entity.Bookdescription}
 */
@Value
public class BookdescriptionDto implements Serializable {
    Integer id;
    BookDto book;
    @Size(max = 255)
    String title;
    String description;
}