package emt.library.emtbackend.service.implementation;

import emt.library.emtbackend.model.Author;
import emt.library.emtbackend.model.Country;
import emt.library.emtbackend.model.dto.AuthorDto;
import emt.library.emtbackend.model.exceptions.CountryNotFoundException;
import emt.library.emtbackend.repository.AuthorRepository;
import emt.library.emtbackend.repository.CountryRepository;
import emt.library.emtbackend.service.AuthorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;
    private final CountryRepository countryRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository, CountryRepository countryRepository) {
        this.authorRepository = authorRepository;
        this.countryRepository = countryRepository;
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
    public Optional<Author> save(AuthorDto authorDto) {
        Country country = this.countryRepository.findById(authorDto.getCountryId())
                .orElseThrow(CountryNotFoundException::new);
        return Optional.of(this.authorRepository.save(new Author(authorDto.getName(), authorDto.getSurname(), country)));
    }
}
