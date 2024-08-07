package com.example.bookproject.Repository;

import com.example.bookproject.Entity.Bookcategory;
import com.example.bookproject.Entity.BookcategoryId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookcategoryRepository extends JpaRepository<Bookcategory, BookcategoryId> {
}