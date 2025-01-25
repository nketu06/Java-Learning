package org.example;

public class Main {
        public static void main(String[] args) throws InterruptedException {
            Temp shared = new Temp();
            Thread reader = new Thread(() -> {
                shared.printFlagIfTrue();
            });
            Thread writer = new Thread(() -> {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                shared.setFlagTrue();
            });
            reader.start();
            writer.start();
            reader.join();
            writer.join();
        }
    }






