package emt.library.emtbackend.service.implementation;

import emt.library.emtbackend.model.Author;
import emt.library.emtbackend.model.Book;
import emt.library.emtbackend.model.dto.BookDto;
import emt.library.emtbackend.model.enumerations.Category;
import emt.library.emtbackend.model.exceptions.AuthorNotFoundException;
import emt.library.emtbackend.model.exceptions.BookNotFoundException;
import emt.library.emtbackend.model.exceptions.CategoryNotFoundException;
import emt.library.emtbackend.repository.AuthorRepository;
import emt.library.emtbackend.repository.BookRepository;
import emt.library.emtbackend.service.BookService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService{

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    public BookServiceImpl(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    @Override
    public List<Book> findAll() {
        return this.bookRepository.findAll();
    }

    @Override
    public Optional<Book> findById(Long id) {
        return this.bookRepository.findById(id);
    }

    @Override
    public Optional<Book> findByName(String name) {
        return this.bookRepository.findBookByName();
    }

    @Override
    public Optional<Book> save(BookDto bookDto) {
        int categoryCount = (int) Arrays.stream(Category.values())
                .filter(c -> c.toString().equalsIgnoreCase(bookDto.getCategory().toString())).count();
        if(categoryCount == 0){
            throw new CategoryNotFoundException();
        }
        Author author = this.authorRepository.findById(bookDto.getAuthorId())
                .orElseThrow(AuthorNotFoundException::new);
        return Optional.of(this.bookRepository.save(new Book(bookDto.getName(), bookDto.getCategory(), author, bookDto.getAvailableCopies())));
    }

    @Override
    public void delete(Long id) {
         this.bookRepository.deleteById(id);
    }

    @Override
    public Optional<Book> edit(Long id, BookDto bookDto) {
        Book book = this.bookRepository.findById(id)
                .orElseThrow(BookNotFoundException::new);
        Author author = this.authorRepository.findById(bookDto.getAuthorId())
                .orElseThrow(AuthorNotFoundException::new);

        book.setName(bookDto.getName());
        book.setAuthor(author);
        book.setCategory(bookDto.getCategory());
        book.setAvailableCopies(bookDto.getAvailableCopies());

        return Optional.of(this.bookRepository.save(book));

    }
}
