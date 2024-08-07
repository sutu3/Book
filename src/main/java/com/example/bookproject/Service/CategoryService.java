package com.example.bookproject.Service;

import com.example.bookproject.Entity.Category;
import com.example.bookproject.Repository.CategoryRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService implements ICategoryService{
    @Autowired
    private CategoryRepository repository;
    @Override
    public List<Category> getAll() {
        // TODO Auto-generated method stub
        return repository.findAll();
    }

    @Override
    public Category getById(int id) throws EntityNotFoundException {
        Optional<Category> category = repository.findById(id);
        return category.orElseThrow(() -> new EntityNotFoundException("No category found with id " + id));
    }

    @Override
    public Category create(Category category) {
        return repository.save(category);
    }

    @Override
    public Category Update(Category category) {
        return repository.save(category);
    }

    @Override
    public void delete(int id ) {
        repository.deleteById(id);
    }
}
