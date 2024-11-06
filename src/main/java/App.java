package main.java;

import main.java.config.DatabaseConnection;
import main.java.model.Book;

public class App {
    public static void main(String[] args) throws Exception {
        Book book = new Book(1, "The Great Gatsby", "1925-04-10", 1);


        System.out.println(DatabaseConnection.getConnection());
        System.out.println(book.getTitle());
        
    }
}
