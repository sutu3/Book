package com.example.bookproject.Controller;

import com.example.bookproject.DTO.BookDto;
import com.example.bookproject.Entity.Book;
import com.example.bookproject.Service.IBook;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private IBook service;
    @Autowired
    private ModelMapper modelMapper;

    @GetMapping()
    public List<BookDto> getAllBooks() {
    List<Book> listbook=service.getall();
        return modelMapper.map(listbook,new
                TypeToken<List<BookDto>>() {}.getType());
    }
}
