package emt.library.emtbackend.model.exceptions;

public class CategoryNotFoundException extends RuntimeException{
    public CategoryNotFoundException(){
        super("Category for this book is not found");
    }
}
