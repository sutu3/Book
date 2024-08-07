package com.example.bookproject.DTO;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link com.example.bookproject.Entity.Author}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorDto implements Serializable {
    Integer id;
    @NotNull
    @Size(max = 255)
    String name;
    String biography;
    byte[] photo;
    @NotNull
    Instant dateCreate;
}