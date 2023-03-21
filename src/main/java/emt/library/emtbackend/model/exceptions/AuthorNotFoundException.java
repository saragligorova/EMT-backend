package emt.library.emtbackend.model.exceptions;

public class AuthorNotFoundException extends RuntimeException{
    public AuthorNotFoundException(){
        super("Author to this book is not found");
    }
}
