package emt.library.emtbackend.service;

import emt.library.emtbackend.model.User;

import java.util.Optional;

public interface UserService{
    Optional<User> findByUsername(String username);
}
