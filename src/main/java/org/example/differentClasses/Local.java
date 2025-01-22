package org.example.differentClasses;

class Local {
    void outerMethod() {
        // Local class inside a method
        class LocalInner {
            void display() {
                System.out.println("Inside Local Inner Class");
            }
        }

        // Creating instance of local inner class
        LocalInner local = new LocalInner();
        local.display();
    }
}


