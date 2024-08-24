package com.example.eBook.service;

import com.example.eBook.model.Books;
import com.example.eBook.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BooksService {

    @Autowired
    private BooksRepository booksRepository;

    public Books createBooks(Books books){
        return booksRepository.save(books);
    }

    public Optional<Books> getBooksByName(String name){
        return booksRepository.findByName(name);
    }

    public Books updateBooks(Books books){
        return booksRepository.save(books);
    }

    public void deleteBooksById(Long id){
        booksRepository.deleteById(id);
    }

}
