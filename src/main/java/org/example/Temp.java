package org.example;

public class Temp {
    String name;
    boolean isStart=false;

    Temp(String name){
        this.name=name;
    }

    class Engine {
        void toStart() {
            isStart = true;
            System.out.println(name + " is start");
        }

        void toStop() {
            System.out.println(name + " to stop");
            isStart = false;
        }
    }

    static class Usb{
        String name;
        Usb(String name){
            this.name=name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
