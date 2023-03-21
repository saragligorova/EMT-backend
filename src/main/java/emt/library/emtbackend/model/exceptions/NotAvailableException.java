package emt.library.emtbackend.model.exceptions;

public class NotAvailableException extends RuntimeException{
    public NotAvailableException(){
        super("The book you wanted is not available");
    }
}
