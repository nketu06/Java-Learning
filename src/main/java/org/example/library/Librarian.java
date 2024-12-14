package org.example.library;

public class Librarian extends User {
    private String employeeNumber;

    Librarian(){
        super();
    }

    Librarian(String name,String contactInfo, String employeeNumber){
        super(name,contactInfo);
        this.employeeNumber = employeeNumber;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Librarian Dashboard");
        System.out.println("Name: " + getName());
        System.out.println("Employee Number: " + employeeNumber);

    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }

    @Override
    public void returnBooks() {

    }

    void addNewBook(Book book){

    }

    void removeBook(Book book){

    }
}
