package emt.library.emtbackend.model;

import lombok.Data;

@Data
public class Author {
    private Long id;
    private String name;
    private String surname;
    private Country country;

    public Author(){
    }
    public Author(String name, String  surname, Country country){
        this.name = name;
        this.surname = surname;
        this.country = country;
    }
}
