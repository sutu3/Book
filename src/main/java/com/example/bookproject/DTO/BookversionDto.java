package com.example.bookproject.DTO;

import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

/**
 * DTO for {@link com.example.bookproject.Entity.Bookversion}
 */
@Value
public class BookversionDto implements Serializable {
    Integer id;
    BigDecimal originalPrice;
    BigDecimal salePrice;
    Integer quantity;
    Instant purchaseDate;
    BigDecimal price;
    @NotNull
    Instant dateCreate;
}