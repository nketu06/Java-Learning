package org.example.library;

public abstract class Book implements Lendable{
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    Book( ){
        this.isAvailable = true;
    }

    Book( String isbn, String title, String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }


    Book(Book book){
        this.isAvailable = book.isAvailable;
        this.isbn = book.isbn;
        this.title = book.title;
        this.author = book.author;
    }

    @Override
    public boolean lend(User user) {
        if(isAvailable && user.canBorrowBooks()){
            isAvailable=false;
            return true;
        }
        return false;
    }

    @Override
    public void returnBook(User user) {
        isAvailable=true;
        user.returnBooks();
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    public abstract void displayBookDetails();
}
