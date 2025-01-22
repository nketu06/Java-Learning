package org.example.differentClasses;


/**
 * An inner class declared static, which can be used without an instance of the outer class.
 */

public class StaticExm {

    String name= "static class";

    public String getName() {
        return name;
    }

    static  class MyStaticClass {
        public MyStaticClass( String name ) {
            this.name = name;
        }
        String name ;
        public String getName() {
            return name;
        }
    }
}
