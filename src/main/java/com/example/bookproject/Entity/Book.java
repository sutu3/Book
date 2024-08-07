package com.example.bookproject.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@Table(name = "books")
public class Book implements Serializable {
    private static final long serialVersionUID=1L;
    @Id
    @Column(name = "book_id", nullable = false)
    private Integer id;

    @Size(max = 255)
    @NotNull
    @Column(name = "title", nullable = false)
    private String title;

    @NotNull
    @ManyToOne()
    @JoinColumn(name = "author_id", nullable = false)
    private Author author;

    @ManyToOne()
    @JoinColumn(name = "series_id")
    private Series series;

    @NotNull
    @ManyToOne()
    @JoinColumn(name = "publisher_id", nullable = false)
    private Publisher publisher;
    @ManyToMany
    @JoinTable(
            name = "Bookpublicationyears",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "year_id")
    )
    private List<Publicationyear> publicationYears;
    @ManyToMany
    @JoinTable(
            name = "BookLanguages",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "language_id")
    )
    private List<Language> languages;
    @OneToMany(mappedBy = "book",cascade =CascadeType.ALL, orphanRemoval = true)
    private List<Bookvariant> variants;
    @OneToMany(mappedBy = "book",cascade =CascadeType.ALL, orphanRemoval = true)
    private List<Bookdescription> descriptions;
    @Size(max = 255)
    @Column(name = "dimensions")
    private String dimensions;

    @Column(name = "weight", precision = 10, scale = 2)
    private BigDecimal weight;

    @Column(name = "pages")
    private Integer pages;

    @Size(max = 255)
    @Column(name = "translator")
    private String translator;

    @Column(name = "cover_image")
    private byte[] coverImage;

    @NotNull
    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "Date_Create", nullable = false)
    private Instant dateCreate;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "IsDeleted", nullable = false)
    private Boolean isDeleted = false;

    @Column(name = "Date_Deleted")
    private Instant dateDeleted;

}