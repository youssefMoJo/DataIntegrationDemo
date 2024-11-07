package main.java.model;

public class Book {
    private int id;
    private String title;
    private String publicationDate;
    private int authorId;

    public Book(int id, String title, String publicationDate, int authorId){
        this.id = id;
        this.title = title;
        this.publicationDate = publicationDate;
        this.authorId = authorId;
    }

    public String toString() {
        return "Book [id=" + id + ", title=" + title + ", publicationDate=" + publicationDate + ", authorId=" + authorId + "]";
    }

    public int getId(){
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public int getAuthorId() {
        return authorId;
    }
}
