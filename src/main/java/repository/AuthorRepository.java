package main.java.repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import main.java.config.DatabaseConnection;
import main.java.model.Author;

public class AuthorRepository {

    public void insertAuthor(Author author) throws SQLException {
        String insertSQL = "INSERT INTO authors (name, bio) VALUES (?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(insertSQL, Statement.RETURN_GENERATED_KEYS)) {
            pstmt.setString(1, author.getName());
            pstmt.setString(2, author.getBio());
            pstmt.executeUpdate();

            // Get the generated id and set it to the author object
            try (ResultSet rs = pstmt.getGeneratedKeys()) {
                if (rs.next()) {
                    author.setId(rs.getInt(1));
                }
            }
        }
    }

    public Author getAuthorById(int id) throws SQLException {
        String selectSQL = "SELECT * FROM authors WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(selectSQL)) {
            pstmt.setInt(1, id);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return new Author(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("bio")
                    );
                }
            }
        }
        return null; 
    }

     public List<Author> getAllAuthors() throws SQLException {
        List<Author> authors = new ArrayList<>();
        String selectAllSQL = "SELECT * FROM authors";
        try (Connection conn = DatabaseConnection.getConnection();
            Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(selectAllSQL)) {
            while (rs.next()) {
                Author author = new Author(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("bio")
                );
                authors.add(author);
            }
        }
        return authors;
    }

    public void updateAuthor(Author author) throws SQLException {
        String updateSQL = "UPDATE authors SET name = ?, bio = ? WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(updateSQL)) {
            pstmt.setString(1, author.getName());
            pstmt.setString(2, author.getBio());
            pstmt.setInt(3, author.getId());
            pstmt.executeUpdate();
        }
    }

    public void deleteAuthor(int id) throws SQLException {
        String deleteSQL = "DELETE FROM authors WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(deleteSQL)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        }
    }
}
