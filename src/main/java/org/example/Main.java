package org.example;


import java.util.List;

public class Main {

        public static void main(String[] args) {
            Temp t1 = new Temp("bmw");
            Temp.Engine e1 = t1.new Engine();

            e1.toStart();

            Temp.Usb myusb = new Temp.Usb("usb");
            System.out.println(myusb.getName());


        }
    }






