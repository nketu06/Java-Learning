package org.lld.parkinglot.models;

public class Operator extends BaseModel{
     private String name;

     public Operator(int id, String name) {
          super(id);
          this.name = name;
     }
}
