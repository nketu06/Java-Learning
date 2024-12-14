package org.example.library;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    List<Book> bookInventory = new ArrayList<>();
    List<User> registeredUsers = new ArrayList<>();

    public void addBook(Book book){
        bookInventory.add(book);
    }

    public void addUser(User user){
        registeredUsers.add(user);
    }

    public Book searchBook(String criteria){
        for(Book book : bookInventory){
            if(book.getTitle().equalsIgnoreCase(criteria)|| book.getAuthor().equalsIgnoreCase(criteria)){
                return book;
            }
        }
        return null;
    }

    public void displayBooks(){
        for(Book book : bookInventory){
            System.out.print(book.getTitle()+" "+book.isAvailable());
            book.displayBookDetails();
            System.out.println();
        }

    }
}
