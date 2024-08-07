package com.example.bookproject.Service;

import com.example.bookproject.Entity.Author;
import com.example.bookproject.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService implements IAuthorService{
    @Autowired
    private AuthorRepository repository;

    @Override
    public List<Author> getall() {
        return repository.findAll();
    }

    @Override
    public Author getById(int id) {
        return repository.findById(id).orElse(null);
    }
    @Override
    public Author create(Author author) {
        return repository.save(author);
    }

    @Override
    public Author update(Author author) {
        return repository.save(author);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
