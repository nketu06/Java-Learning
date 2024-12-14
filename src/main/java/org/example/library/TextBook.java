package org.example.library;

public class TextBook extends Book {
    private String subject;
    private int edition;

    TextBook( String subject, int edition, String isbn, String title, String author){
        super(isbn, title, author);
        this.subject = subject;
        this.edition = edition;
    }

    @Override
    public void displayBookDetails() {
        System.out.println("subject: " + subject);
        System.out.println("edition: " + edition);

    }
}
