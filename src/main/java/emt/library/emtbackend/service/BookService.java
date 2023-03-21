package emt.library.emtbackend.service;

import emt.library.emtbackend.model.Author;
import emt.library.emtbackend.model.Book;
import emt.library.emtbackend.model.dto.BookDto;
import emt.library.emtbackend.model.enumerations.Category;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> findAll();
    Optional<Book> findById(Long id);
    Optional<Book> save(BookDto bookDto);
    void delete(Long id);
    Optional<Book> edit(Long id, BookDto bookDto);
    Optional<Book> lendBookById(Long id);

}
