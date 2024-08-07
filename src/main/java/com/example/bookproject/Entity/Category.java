package com.example.bookproject.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Thêm annotation này
    @Column(name = "category_id", nullable = false)
    private Integer id;

    @Size(max = 255)
    @NotNull
    @Column(name = "name", nullable = false)
    private String name;
    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "Date_Create", nullable = false)
    private Instant dateCreate;
    public Category(String name,Instant dateCreate) {
        this.name = name;
        this.dateCreate=dateCreate;
    }
}