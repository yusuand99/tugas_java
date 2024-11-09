package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe"; // Ganti dengan URL Oracle Anda
    private static final String USER = "your_username"; // Ganti dengan username database Anda
    private static final String PASSWORD = "your_password"; // Ganti dengan password database Anda

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}