package org.example;

public class Main {
        public static void main(String[] args) {


            Test database = new Test.DatabaseBuilder().setHost("localhost").setPort(8080).build();
            System.out.println("Database Host: " + database);



        }
    }






