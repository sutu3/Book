package com.example.bookproject.Service;

import com.example.bookproject.Entity.Book;

import java.util.List;

public interface BookService {
    public List<Book> getall();
    public Book getbyid(int id);
}
