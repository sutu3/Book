package com.example.bookproject.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class BookpublicationyearId implements Serializable {
    private static final long serialVersionUID = 5664034536880407310L;
    @NotNull
    @Column(name = "book_id", nullable = false)
    private Integer bookId;

    @NotNull
    @Column(name = "year_id", nullable = false)
    private Integer yearId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        BookpublicationyearId entity = (BookpublicationyearId) o;
        return Objects.equals(this.bookId, entity.bookId) &&
                Objects.equals(this.yearId, entity.yearId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, yearId);
    }

}