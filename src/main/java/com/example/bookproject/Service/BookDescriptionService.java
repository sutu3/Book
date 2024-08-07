package com.example.bookproject.Service;

import com.example.bookproject.DTO.BookDto;
import com.example.bookproject.DTO.BookdescriptionDto1;
import com.example.bookproject.Entity.Bookdescription;
import com.example.bookproject.Form.FormBookDescription;
import com.example.bookproject.Repository.BookdescriptionRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookDescriptionService implements IBookDescriptionService{
    @Autowired
    private BookdescriptionRepository repository;
    @Autowired
    private BookService bookService;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public List<Bookdescription> getall() {
        return repository.findAll();
    }

    @Override
    public Bookdescription getById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Bookdescription create(FormBookDescription bookdescription) {
        Bookdescription new1=new Bookdescription(
                bookService.getbyid(bookdescription.getBook_id())
                ,bookdescription.getTitle()
                ,bookdescription.getDescription());
        Bookdescription newEntity=repository
                .save(new1);
        return newEntity;
    };
    @Override
    public Bookdescription update(Bookdescription bookdescription) {
        Bookdescription newEntity=repository
                .save(bookdescription);
        return newEntity;
    };

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
