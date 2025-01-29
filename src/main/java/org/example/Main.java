package org.example;

public class Main {
        public static void main(String[] args) {


            for(int i = 1; i<=20; i++){
                if(i%3==0 && i%5==0){
                    System.out.println(i+"");
                    continue;
                }

                if(i%3==0){
                    System.out.println(i+"foo");
                }
                if(i%5==0){
                    System.out.println(i+"boo");
                }
            }

        }
    }






