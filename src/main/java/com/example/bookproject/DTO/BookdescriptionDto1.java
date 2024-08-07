package com.example.bookproject.DTO;

import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.example.bookproject.Entity.Bookdescription}
 */
@NoArgsConstructor
@Data
public class BookdescriptionDto1 implements Serializable {
    Integer id;
    Integer bookId;
    String bookTitle;
    @Size(max = 255)
    String title;
    String description;
}