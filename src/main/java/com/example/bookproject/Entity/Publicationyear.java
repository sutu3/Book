package com.example.bookproject.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "publicationyears")
public class Publicationyear {
    @Id
    @Column(name = "year_id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "year", nullable = false)
    private Integer year;

}