package org.example.library;

public class LibraryMain {
    public static void main(String[] args){

        LibraryManagementSystem lms = new LibraryManagementSystem();

        User user1 = new Member("nishant","");
        User user2 = new Librarian("nishant","","");

        Book book1 = new NovelBook("0","novel1","me","adventure");
        Book book2 = new TextBook("1",0,"me","myLife","adventure");

        lms.addBook(book1);
        lms.addBook(book2);

        lms.addUser(user1);
        lms.addUser(user2);

        Book searched=lms.searchBook("myLife");
        searched.displayBookDetails();
        System.out.println(searched.getTitle());
        book1.displayBookDetails();
        book1.lend(user1);
        System.out.println(book1.isAvailable()+" user 1 lended");
        book1.returnBook(user1);
        System.out.println(book1.isAvailable()+" user 1 lended");
        System.out.println(book1.lend(user2));
        lms.displayBooks();

    }
}
