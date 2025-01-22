package org.example.differentClasses;

/**
 * ✅ Defined inside another class (non-static).
 * ✅ Can access all members (including private) of the outer class.
 * ✅ Requires an instance of the outer class to create an object.
 * ✅ Useful for logically grouping related classes.
 */

class MemberOrInner {
    private String message = "Hello from Outer class";

    // Member Inner Class
    class Inner {
        void display() {
            System.out.println(message);  // Accessing outer class private variable
        }
    }
}