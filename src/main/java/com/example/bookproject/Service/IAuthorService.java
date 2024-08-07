package com.example.bookproject.Service;

import com.example.bookproject.Entity.Author;

import java.util.List;

public interface IAuthorService {
    public List<Author> getall();
    public Author getById(int id);
    public Author create(Author author);
    public Author update(Author author);
    public void delete(int id );
}
