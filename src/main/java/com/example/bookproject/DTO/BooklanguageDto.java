package com.example.bookproject.DTO;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.example.bookproject.Entity.Booklanguage}
 */
@Value
public class BooklanguageDto implements Serializable {
    BooklanguageIdDto id;
    BookDto book;
    LanguageDto language;
}