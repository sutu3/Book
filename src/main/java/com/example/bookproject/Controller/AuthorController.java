package com.example.bookproject.Controller;

import com.example.bookproject.Entity.Author;
import com.example.bookproject.Form.FormAuthor;
import com.example.bookproject.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.List;

@RestController
@RequestMapping("/Author")
public class AuthorController {
    @Autowired
    private AuthorService service;
    @GetMapping()
    public List<Author> getAllAuthors(){
        return service.getall();
    }
    @GetMapping(value = "/{id}")
    public Author getAuthorById(@PathVariable(name = "id") int id){
        return service.getById(id);
    }
    @PostMapping(value = "create")
    public Author createAuthor(@RequestBody FormAuthor author){
        Author newEntity = new Author(author.getName(),"",null, Instant.now());
        return service.create(newEntity);
    }
    @PutMapping(value = "update/{id}")
    public Author updateAuthor(@PathVariable(name = "id") int id, @RequestBody FormAuthor author){
        Author updatEntity=service.getById(id);
        updatEntity.setName(author.getName());
        return service.update(updatEntity);
    }
    @DeleteMapping(value="delete/{id}")
    public int deteleAuthor(@PathVariable(name="id") int id){
        service.delete(id);
        return id;
    }
}
