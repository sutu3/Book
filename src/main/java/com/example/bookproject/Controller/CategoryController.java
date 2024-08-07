package com.example.bookproject.Controller;

import com.example.bookproject.Entity.Category;
import com.example.bookproject.Form.FormCategories;
import com.example.bookproject.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("categories")
public class CategoryController {
    @Autowired
    private CategoryService service;
    @GetMapping()
    public List<Category> getAllCategories(){
        return service.getAll();
    }
    @GetMapping(value="/{id}")
    public Category getCategoryById(@PathVariable(name="id") int id){
        return service.getById(id);
    }
    @PostMapping(value="create")
    public Category createCategory(@RequestBody FormCategories category){
        Category newEntity=new Category(category.getCategory(), Instant.now());
        return service.create(newEntity);
    }
    @PutMapping(value="Update/{id}")
    public Category updateCategory(@PathVariable(name="id") int id, @RequestBody FormCategories category )
    {
        Category UpdateEntity=service.getById(id);
        System.out.println(UpdateEntity);
        UpdateEntity.setName(category.getCategory());
        return service.Update(UpdateEntity);
    }
    @DeleteMapping(value="Delete/{id}")
    public Category deleteCategory(@PathVariable(name="id") int id){
        Category tampto=service.getById(id);
        service.delete(id);
        return tampto;
    }
}
