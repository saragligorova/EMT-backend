package emt.library.emtbackend.model.exceptions;

public class BookNotFoundException extends RuntimeException{
    public BookNotFoundException(){
        super("Book not found");
    }
}
