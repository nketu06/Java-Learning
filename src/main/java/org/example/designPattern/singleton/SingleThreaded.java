package org.example.designPattern.singleton;

public class SingleThreaded {

    private static SingleThreaded instance=null;

    private SingleThreaded(){}

    public static SingleThreaded getInstance(){
        if(instance==null){
            instance=new SingleThreaded();
        }
        return instance;
    }
}
