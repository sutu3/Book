package com.example.bookproject.Form;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FormBookDescription {
    private int book_id;
    private String title;
    private String description;
}
