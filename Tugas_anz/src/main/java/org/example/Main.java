package com.example;

import com.example.controller.BookController;
import com.example.repository.BookRepository;
import com.example.repository.BookRepositoryImpl;
import com.example.service.BookService;

import java.sql.Connection;

public class Application {
    public static void main(String[] args) {
        try {
            Connection connection = DatabaseConnection.getConnection();
            BookRepository bookRepository = new BookRepositoryImpl(connection);
            BookService bookService = new BookService(bookRepository);
            BookController bookController = new BookController(bookService);

            bookController.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}