package com.example.bookproject.Controller;

import com.example.bookproject.DTO.BookdescriptionDto1;
import com.example.bookproject.Entity.Bookdescription;
import com.example.bookproject.Form.FormBookDescription;
import com.example.bookproject.Service.BookDescriptionService;
import com.example.bookproject.Service.BookService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/BookDescription")
public class BookDescriptionController {
    @Autowired
    private BookDescriptionService service;
    @Autowired
    private BookService bookService;
    @Autowired
    private ModelMapper modelMapper;
    @GetMapping()
    public List<BookdescriptionDto1> getAllBookDescriptions(){
        List<BookdescriptionDto1> listDTO=modelMapper.map(
                service.getall(),new TypeToken<List<BookdescriptionDto1>>() {}.getType());
        return listDTO;
    }
    @GetMapping("/{id}")
    public BookdescriptionDto1 getBookDescriptionById(@PathVariable(name = "id") int id){
        return modelMapper.map(service.getById(id),BookdescriptionDto1.class);
    }
    @PostMapping("/create")
    public BookdescriptionDto1 createBookDescription(@RequestBody FormBookDescription description){
        return modelMapper.map(service.create(description)
                ,BookdescriptionDto1.class);
    }
    @PutMapping("/update/{id}")
    public BookdescriptionDto1 updateBookDescription(@PathVariable(name = "id") Integer id, @RequestBody FormBookDescription description){
        return modelMapper.map(service.update(new Bookdescription(id,bookService.getbyid(description.getBook_id()),description.getTitle(),description.getDescription()))
               ,BookdescriptionDto1.class);
    }
    @DeleteMapping("/delete/{id}")
    public BookdescriptionDto1 deleteBookDescription(@PathVariable(name = "id") int id){
        BookdescriptionDto1 deleteEntity=  modelMapper.map(service.getById(id),BookdescriptionDto1.class);
        service.delete(id);
        return deleteEntity;
    }
}
