package emt.library.emtbackend.model;

import lombok.Data;

@Data
public class Country {
    private Long id;
    private String name;
    private String continent;

    public Country(){
    }
    public Country(String name, String continent){
        this.name = name;
        this.continent = continent;
    }
}
