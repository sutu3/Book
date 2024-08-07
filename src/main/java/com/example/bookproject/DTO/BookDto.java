package com.example.bookproject.DTO;

import com.example.bookproject.Entity.Bookvariant;
import com.example.bookproject.Entity.Publicationyear;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

/**
 * DTO for {@link com.example.bookproject.Entity.Book}
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDto implements  Serializable{
    Integer id;
    @NotNull
    @Size(max = 255)
    String title;
    @NotNull
    AuthorDto author;
    SeriesDto series;
    @NotNull
    PublisherDto publisher;
    List<LanguageDto> languages;
    List<Publicationyear> years;
    List<BookvariantDto> variants;
    List<BookdescriptionDto2> descriptions;
    @Size(max = 255)
    String dimensions;
    BigDecimal weight;
    Integer pages;
    @Size(max = 255)
    String translator;
    byte[] coverImage;
    @NotNull
    Instant dateCreate;
    @NotNull
    Boolean isDeleted;

    /**
     * DTO for {@link com.example.bookproject.Entity.Bookdescription}
     */
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class BookdescriptionDto2 implements Serializable {
        Integer id;
        String title;
        String description;
    }
}