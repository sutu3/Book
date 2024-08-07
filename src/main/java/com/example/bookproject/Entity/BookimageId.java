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
public class BookimageId implements Serializable {
    private static final long serialVersionUID = -6100364184650645879L;
    @NotNull
    @Column(name = "book_id", nullable = false)
    private Integer bookId;

    @NotNull
    @Column(name = "image_id", nullable = false)
    private Integer imageId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        BookimageId entity = (BookimageId) o;
        return Objects.equals(this.imageId, entity.imageId) &&
                Objects.equals(this.bookId, entity.bookId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageId, bookId);
    }

}