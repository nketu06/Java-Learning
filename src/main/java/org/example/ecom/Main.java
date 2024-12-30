package org.example.ecom;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Clothing(1,"Zara",300, 2,  8));
        items.add(new Clothing(3,"HM",600, 5,  4));
        items.add(new Electronics(5,"Apple",1600, 2,  2));
        items.add(new Electronics(2,"Nokia",100, 1,  5));
        items.add(new Book(4,"Physics",10, 18,  "myself"));
        items.add(new Book(6,"Chemistry",9, 18,  "myself"));

        for (Item item : items) {
            System.out.print(item.getName()+" ");
        }

        System.out.println("\n");
        System.out.println(" **************** SORTED ELEMENT *****************");
        items.sort(null);
//        Collections.sort(items);

        for (Item item : items) {
            System.out.print(item.getName()+" ");
        }

    }
}
