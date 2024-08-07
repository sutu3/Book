package com.example.bookproject.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "inventory")
public class Inventory {
    @Id
    @Column(name = "inventory_id", nullable = false)
    private Integer id;

    @NotNull
    @Lob
    @Column(name = "change_type", nullable = false)
    private String changeType;

    @Column(name = "change_id")
    private Integer changeId;

    @NotNull
    @Column(name = "quantity_change", nullable = false)
    private Integer quantityChange;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "purchase_price", precision = 10, scale = 2)
    private BigDecimal purchasePrice;

    @Column(name = "sale_price", precision = 10, scale = 2)
    private BigDecimal salePrice;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "change_date")
    private Instant changeDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Varient_id")
    private Bookvariant varient;

}