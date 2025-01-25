package org.example;

import java.util.concurrent.atomic.AtomicBoolean;

public class Temp {
    AtomicBoolean flag = new AtomicBoolean(false);
//    boolean  flag = false;
    public void setFlagTrue() {
        this.flag.set(true);
    }
    public void  printFlagIfTrue(){
        while(!flag.get()){

        }
        System.out.println("flag is true");
    }
}
