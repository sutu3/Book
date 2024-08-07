package com.example.bookproject.Entity;

import com.example.bookproject.DTO.BookDto;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Data
@NoArgsConstructor
@Table(name = "bookdescriptions")
public class Bookdescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "description_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id")
    private Book book;

    @Size(max = 255)
    @Column(name = "title")
    private String title;

    @Lob
    @Column(name = "description")
    private String description;

    public Bookdescription(Book book, String title, String description) {
        this.book=book;
        this.title = title;
        this.description = description;
    }

    public Bookdescription(Integer id, Book book, String title, String description) {
        this.id = id;
        this.book = book;
        this.title = title;
        this.description = description;
    }
}