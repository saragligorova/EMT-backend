package emt.library.emtbackend.web.controllers;

import emt.library.emtbackend.model.enumerations.Category;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/categories")
public class CategoryController {

    @GetMapping("/list")
    public List<Category> findAll(){
        return Arrays.asList(Category.values());
    }
}
