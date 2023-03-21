package emt.library.emtbackend.service;

import emt.library.emtbackend.model.Country;

import java.util.List;
import java.util.Optional;

public interface CountryService {
    List<Country> findAll();
    Optional<Country> findById(Long id);
}
