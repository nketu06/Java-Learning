package org.example.ecom;

public class Clothing extends Item {
    private int size;

    public Clothing(String id, String name, int price, int quantity,int size) {
        super(id,name,price,quantity);
        this.size = size;
    }

    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
}
