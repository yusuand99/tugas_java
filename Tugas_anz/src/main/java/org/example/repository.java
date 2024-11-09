package org.example;

import org.example.model.Book;
import java.util.List;


public class repository {
    public interface BookRepository {
        void save(Book book);
        List<Book> findAll();
        Book findById(int id);
        void delete(int id);
    }
}
