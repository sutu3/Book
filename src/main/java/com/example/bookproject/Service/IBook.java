package com.example.bookproject.Service;

import com.example.bookproject.Entity.Book;
import com.example.bookproject.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IBook implements BookService{
    @Autowired
    private BookRepository repository;
    @Override
    public List<Book> getall() {
        return repository.findAll();
    }

    @Override
    public Book getbyid(int id) {
        return repository.findById(id).orElse(null);
    }
}
