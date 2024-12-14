package org.example.library;

public class Member extends User {
    private int borrowedBooksCount;
    private final static int MAX_BORROW_LIMIT = 5;

    Member(String name, String contactInfo){
        super(name,contactInfo);
        borrowedBooksCount=0;
    }

    Member(){
        super();
        borrowedBooksCount=0;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Member Dashboard");
        System.out.println("Name: " + getName());
        System.out.println("Contact Info: " + getContactInfo());
        System.out.println("Borrowed Books: " + borrowedBooksCount);

    }

    @Override
    public boolean canBorrowBooks() {
        return borrowedBooksCount < MAX_BORROW_LIMIT;

    }

    @Override
    public void returnBooks(){
        borrowedBooksCount--;
    }
}
