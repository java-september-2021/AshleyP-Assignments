package com.ashley.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ashley.mvc.models.Book;
import com.ashley.mvc.repositories.BookRepository;

@Service
public class BookService {
	private final BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	// returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        
        }
    }
    // updates a book
    public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
    	Book updatebook = new Book();
    	updatebook.setId(id);
    	updatebook.setTitle(title);
    	updatebook.setDescription(desc);
    	updatebook.setLanguage(lang);
    	updatebook.setNumberOfPages(numOfPages);
    	return this.bookRepository.save(updatebook);
    }
    // deletes a book
    public String deleteBook(Long id) {
    	this.bookRepository.deleteById(id);
    	return "Book has been deleted";
    }
}
