package com.example.bookproject.DTO;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

/**
 * DTO for {@link com.example.bookproject.Entity.Bookvariant}
 */
@Data
@NoArgsConstructor
public class BookvariantDto implements Serializable {
    Integer id;
    Integer bookId;
    String bookTitle;
    String bookDimensions;
    BigDecimal bookWeight;
    Integer bookPages;
    String bookTranslator;
    byte[] bookCoverImage;
    Instant bookDateCreate;
    Boolean bookIsDeleted;
    Instant bookDateDeleted;
    LanguageDto language;
    @Size(max = 50)
    String format;
    BigDecimal price;
    Integer stock;
    BookversionDto version;
    @NotNull
    Instant dateCreate;
}