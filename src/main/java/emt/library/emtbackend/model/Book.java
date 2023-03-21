package emt.library.emtbackend.model;

import emt.library.emtbackend.model.enumerations.Category;
import lombok.Data;

@Data
public class Book {
    private Long id;
    private String name;
    private Category category;
    private Author author;
    private Integer availableCopies;

    public Book(){
    }

    public Book(String name, Category category, Author author, Integer availableCopies){
        this.name = name;
        this.category = category;
        this.author = author;
        this.availableCopies = availableCopies;
    }
}
