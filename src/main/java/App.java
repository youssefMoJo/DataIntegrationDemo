package main.java;

import java.util.List;

import main.java.model.Book;
import main.java.repository.BookRepository;

public class App {
    public static void main(String[] args) throws Exception {
        BookRepository bookRepository = new BookRepository();

        Book newBook = new Book(15, "Clean Code", "2012-01-21", 33);
        bookRepository.insertBook(newBook);

        Book bookDetails = bookRepository.getBookById(15);
        System.out.println(bookDetails);

        List<Book> allBooks = bookRepository.getAllBooks();
        System.out.println(allBooks);

        bookRepository.updateBook(15, "Introduction to Algorithms", "1111-11-11", 11);
        
        bookRepository.deleteBook(2);

    }
}
