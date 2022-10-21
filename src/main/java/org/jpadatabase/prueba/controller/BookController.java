package org.jpadatabase.prueba.controller;

import org.jpadatabase.prueba.entities.Book;
import org.jpadatabase.prueba.repositories.BooKRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    //attributes
    private BooKRepository bookRepository;
    //constructor
    public BookController(BooKRepository bookRepository){
        this.bookRepository = bookRepository;
    }
    //methods for rest application
    @GetMapping("/api/books")
    public List<Book> findAll(){
        //recover and deliver ALL of books from database
        return bookRepository.findAll();
    }
}
