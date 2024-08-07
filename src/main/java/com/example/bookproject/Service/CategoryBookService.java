package com.example.bookproject.Service;

import com.example.bookproject.Entity.Bookcategory;
import com.example.bookproject.Repository.BookcategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryBookService implements ICategoryBookService{
    @Autowired
    private BookcategoryRepository repository;
    @Override
    public List<Bookcategory> getall() {
        return repository.findAll();
    }
}
