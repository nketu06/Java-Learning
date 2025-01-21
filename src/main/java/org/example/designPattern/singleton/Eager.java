package org.example.designPattern.singleton;

public class Eager {

    private static Eager eager = new Eager();

    private Eager() {}

    public static Eager getInstance() {
        return eager;
    }
}
