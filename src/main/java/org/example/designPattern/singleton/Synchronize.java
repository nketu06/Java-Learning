package org.example.designPattern.singleton;

public class Synchronize {
    private static Synchronize instance = null;
    private Synchronize() {}

    synchronized public static Synchronize getInstance() {
        if (instance == null) {
            instance = new Synchronize();
        }
        return instance;
    }
}
