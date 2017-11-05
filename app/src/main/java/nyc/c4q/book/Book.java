package nyc.c4q.book;

/**
 * Created by jervon.arnoldd on 11/5/17.
 */

public class Book {

    private String title;
    private String author;
    private int publishingYear;


    public Book(String title, String author, int publishingYear) {
        this.title = title;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublishingYear() {
        return publishingYear;
    }




}
