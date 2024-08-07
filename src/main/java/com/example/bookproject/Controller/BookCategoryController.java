package com.example.bookproject.Controller;

import com.example.bookproject.DTO.BookDto;
import com.example.bookproject.DTO.BookcategoryDto;
import com.example.bookproject.Entity.Bookcategory;
import com.example.bookproject.Service.CategoryBookService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("BookCategory")
public class BookCategoryController {
    @Autowired
    private CategoryBookService service;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping()
    public List<BookcategoryDto> getAll(){
        List<BookcategoryDto> listDTO=modelMapper.map(service.getall(),new
                TypeToken<List<BookcategoryDto>>() {}.getType());
        return listDTO;
    }
}
