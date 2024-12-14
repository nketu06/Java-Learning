package org.example.library;

public abstract class User {
    private String name;
    private String userId;
    private String contactInfo;
    private static int totalUsers=0;

    public final String generateUniqueId(){
        totalUsers++;
        return "User- " + totalUsers;
    }

    User(){
        this.userId = generateUniqueId();
    }

    User(String name, String contactInfo){
        this.name=name;
        this.contactInfo=contactInfo;
        this.userId = generateUniqueId();
    }

//    copy constructor
    User(User user){
        this.name=user.userId;
        this.userId=generateUniqueId();
        this.contactInfo=user.contactInfo;
    }

    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void displayDashboard();

    public abstract boolean canBorrowBooks();

    public abstract void returnBooks();



}
