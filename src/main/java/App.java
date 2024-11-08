package main.java;

import java.util.List;

import main.java.model.Author;
import main.java.model.Book;
import main.java.repository.AuthorRepository;
import main.java.repository.BookRepository;

public class App {
    public static void main(String[] args) throws Exception {

        //Testing the BookRepository
        // BookRepository bookRepository = new BookRepository();

        // Book newBook = new Book(15, "Clean Code", "2012-01-21", 33);
        // bookRepository.insertBook(newBook);

        // Book bookDetails = bookRepository.getBookById(15);
        // System.out.println(bookDetails);

        // List<Book> allBooks = bookRepository.getAllBooks();
        // System.out.println(allBooks);

        // bookRepository.updateBook(15, "Introduction to Algorithms", "1111-11-11", 11);
        
        // bookRepository.deleteBook(2);


        //Testing the AuthorRepository
        AuthorRepository authorRepository = new AuthorRepository();

        Author newAuthor = new Author(0 ,"J.K. Rowling" , "Author of Harry Potter series");
        authorRepository.insertAuthor(newAuthor);

        // Author authorDetails = authorRepository.getAuthorById(2);
        // System.out.println(authorDetails);

        // List<Author> allAuthors = authorRepository.getAllAuthors();
        // System.out.println(allAuthors);

        // Author updateAuthor = new Author(1 ,"Youssef Mohamed" , "Author of How to become a cloud Engineer?");
        // authorRepository.updateAuthor(updateAuthor);

        // authorRepository.deleteAuthor(2);

    }
}
