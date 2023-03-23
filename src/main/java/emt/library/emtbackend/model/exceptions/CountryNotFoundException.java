package emt.library.emtbackend.model.exceptions;

public class CountryNotFoundException extends RuntimeException{
    public CountryNotFoundException(){
        super("Country Not Found");
    }
}
