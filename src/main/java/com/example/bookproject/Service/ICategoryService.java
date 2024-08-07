package com.example.bookproject.Service;

import com.example.bookproject.Entity.Category;

import java.util.List;

public interface ICategoryService {
    public List<Category> getAll();
    public Category getById(int id);
    public Category create(Category category);
    public Category Update(Category category);
    public void delete(int id );
}
