package emt.library.emtbackend.bootstrap;

import emt.library.emtbackend.model.Author;
import emt.library.emtbackend.model.Book;
import emt.library.emtbackend.model.Country;
import emt.library.emtbackend.model.enumerations.Category;
import emt.library.emtbackend.repository.AuthorRepository;
import emt.library.emtbackend.repository.BookRepository;
import emt.library.emtbackend.repository.CountryRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

@Component
public class DataHolder {
    private final AuthorRepository authorRepository;
    private final CountryRepository countryRepository;
    private final BookRepository bookRepository;

    public DataHolder(AuthorRepository authorRepository, CountryRepository countryRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.countryRepository = countryRepository;
        this.bookRepository = bookRepository;
    }

    @PostConstruct
    public void initData(){
        Country country = new Country("Macedonia", "Europe");
        Country country1 = new Country("Serbia", "Europe");
        Country country2 = new Country("Italy", "Europe");
        Country country3 = new Country("Spain", "Europe");
        Country country4 = new Country("Portugal", "Europe");
        Country country5 = new Country("France", "Europe");
        Country country6 = new Country("Russia", "Asia");
        Country country7 = new Country("China", "Asia");
        Country country8 = new Country("Japan", "Europe");
        Country country9 = new Country("Canada", "North America");
        Country country10 = new Country("Argentina", "South America");

        countryRepository.save(country);
        countryRepository.save(country1);
        countryRepository.save(country2);
        countryRepository.save(country3);
        countryRepository.save(country4);
        countryRepository.save(country5);
        countryRepository.save(country6);
        countryRepository.save(country7);
        countryRepository.save(country8);
        countryRepository.save(country9);
        countryRepository.save(country10);

        Author author1 = new Author("Blaze", "Koneski", country);
        Author author2 = new Author("James", "Patterson", country5);
        Author author3 = new Author("Gjoko", "Zdraveski", country1);
        Author author4 = new Author("David", "Baldacci", country7);
        Author author5 = new Author("Nora", "Roberts", country2);
        Author author6 = new Author("Colleen", "Hoover", country9);
        Author author7 = new Author("Michael", "Connelly", country6);

        authorRepository.save(author1);
        authorRepository.save(author2);
        authorRepository.save(author3);
        authorRepository.save(author4);
        authorRepository.save(author5);
        authorRepository.save(author6);
        authorRepository.save(author7);

        Book book1 = new Book("Vezilka", Category.HISTORY, author1, 3);
        Book book2 = new Book("Hero", Category.FANTASY, author7, 13);
        Book book3 = new Book("Smile", Category.THRILER, author4, 6);
        Book book4 = new Book("It ends with us", Category.DRAMA, author6, 30);
        Book book5 = new Book("Flower", Category.BIOGRAPHY, author3, 5);
        Book book6 = new Book("Hello", Category.CLASSICS, author2, 3);
        Book book7 = new Book("Pure Love", Category.NOVEL, author5, 9);

        bookRepository.save(book1);
        bookRepository.save(book2);
        bookRepository.save(book3);
        bookRepository.save(book4);
        bookRepository.save(book5);
        bookRepository.save(book6);
        bookRepository.save(book7);


    }
}
