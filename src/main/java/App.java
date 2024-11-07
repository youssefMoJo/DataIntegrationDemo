package main.java;

import main.java.model.Book;
import main.java.repository.BookRepository;

public class App {
    public static void main(String[] args) throws Exception {
        BookRepository bookRepository = new BookRepository();

        Book book = new Book(1, "Youssef", "1925-04-10", 1);

        bookRepository.insertBook(book);
    }
}
