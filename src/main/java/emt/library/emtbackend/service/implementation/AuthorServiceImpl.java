package emt.library.emtbackend.service.implementation;

import emt.library.emtbackend.model.Author;
import emt.library.emtbackend.model.Country;
import emt.library.emtbackend.repository.AuthorRepository;
import emt.library.emtbackend.service.AuthorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }


    @Override
    public List<Author> findAll() {
        return this.authorRepository.findAll();
    }

    @Override
    public Optional<Author> findById(Long id) {
        return this.authorRepository.findById(id);
    }

    @Override
    public Optional<Author> save(String name, String surname, Country country) {
        return Optional.of(this.authorRepository.save(new Author(name, surname, country)));
    }
}
