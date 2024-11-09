package org.example;

package com.example.controller;

import com.example.model.Book;
import com.example.service.BookService;

import java.util.List;
import java.util.Scanner;

public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tampilkan Semua Buku");
            System.out.println("3. Hapus Buku");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("ID Buku: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Judul Buku: ");
                    String title = scanner.nextLine();
                    System.out.print("Pengarang Buku: ");
                    String author = scanner.nextLine();
                    bookService.addBook(new Book(id, title, author));
                    break;

                case 2:
                    List<Book> books = bookService.getAllBooks();
                    books.forEach(book -> System.out.println(book.getId() + ": " + book.getTitle() + " oleh " + book.getAuthor()));
                    break;

                case 3:
                    System.out.print("ID Buku yang akan dihapus: ");
                    int deleteId = scanner.nextInt();
                    bookService.removeBook(deleteId);
                    break;

                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}