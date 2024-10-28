package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Author;
import com.example.demo.model.Book;
import com.example.demo.service.LibraryService;

@RestController
@RequestMapping("/api")
public class LibraryController {
	
	 @Autowired
	 private LibraryService libraryService;

	    @PostMapping("/authors")
	    public Author addAuthorWithBooks(@RequestBody Author author) {
	        return libraryService.addAuthorWithBooks(author);
	    }

	    @GetMapping("/authors")
	    public List<Author> getAllAuthors() {
	        return libraryService.getAllAuthors();
	    }

	    @GetMapping("/books")
	    public List<Book> getAllBooks() {
	        return libraryService.getAllBooks();
	    }
}
