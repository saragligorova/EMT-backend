package emt.library.emtbackend.service;

import emt.library.emtbackend.model.Author;
import emt.library.emtbackend.model.Country;

import java.util.List;
import java.util.Optional;

public interface AuthorService {
    List<Author> findAll();
    Optional<Author> findById(Long id);
    Optional<Author> save(String name, String  surname, Country country);
}
