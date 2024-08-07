package com.example.bookproject.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "images")
public class Image {
    @Id
    @Column(name = "image_id", nullable = false)
    private Integer id;

    @Size(max = 255)
    @Column(name = "url")
    private String url;

    @Lob
    @Column(name = "description")
    private String description;

}