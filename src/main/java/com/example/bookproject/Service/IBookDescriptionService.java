package com.example.bookproject.Service;

import com.example.bookproject.Entity.Bookdescription;
import com.example.bookproject.Form.FormBookDescription;

import java.util.List;

public interface IBookDescriptionService {
    public List<Bookdescription> getall();
    public Bookdescription getById(int id);
    public Bookdescription create(FormBookDescription bookdescription);
    public Bookdescription update(Bookdescription bookdescription);
    public void delete(int id );
}
