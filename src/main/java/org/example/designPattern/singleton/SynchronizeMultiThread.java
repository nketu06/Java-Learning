package org.example.designPattern.singleton;

public class SynchronizeMultiThread {
    private static SynchronizeMultiThread instance = null;
    private SynchronizeMultiThread() {}

    synchronized public static SynchronizeMultiThread getInstance() {
        if (instance == null) {
            instance = new SynchronizeMultiThread();
        }
        return instance;
    }
}
