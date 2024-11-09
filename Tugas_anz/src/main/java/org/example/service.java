package org.example;
import org.example.model.Book;
import org.example.repository.BookRepository;

package org.example.service;


import java.util.List;

public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(Book book) {
        bookRepository.save(book);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(int id) {
        return bookRepository.findById(id);
    }

    public void removeBook(int id) {
        bookRepository.delete(id);
    }
}