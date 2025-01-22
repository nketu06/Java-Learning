package org.example.designPattern.singleton;

public class DoubleLock {
    private static DoubleLock instance = null;
    private DoubleLock() {}
    public static DoubleLock getInstance() {
        if (instance == null) {
            synchronized(DoubleLock.class){
                if (instance == null) {
                    instance = new DoubleLock();
                }
            }
        }
        return instance;
    }
}
