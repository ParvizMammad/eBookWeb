package com.example.eBook.controller;

import com.example.eBook.model.Books;
import com.example.eBook.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BooksController {
    @Autowired
    private BooksService booksService;
    @PostMapping
    public Books createBooks(@RequestBody Books books){
        return booksService.createBooks(books);
    }
    @GetMapping("/{name}")
    public Optional<Books> getBooksByName(@PathVariable String name){
        return booksService.getBooksByName(name);
    }

    @PutMapping
    public Books updateBooks(@RequestBody Books books){
        return booksService.updateBooks(books);
    }

    @DeleteMapping("/{id}")
    public void deleteBooksById(@PathVariable Long id){
        booksService.deleteBooksById(id);
    }

}
