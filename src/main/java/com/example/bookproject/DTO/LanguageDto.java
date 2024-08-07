package com.example.bookproject.DTO;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.example.bookproject.Entity.Language}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LanguageDto implements Serializable {
    Integer id;
    @NotNull
    @Size(max = 50)
    String name;
}