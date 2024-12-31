package org.example.ecom;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Clothing("1","Zara",300, 2,  8));
        items.add(new Clothing("3","HM",600, 5,  4));
        items.add(new Electronics("5","Apple",1600, 2,  2));
        items.add(new Electronics("2","Nokia",100, 1,  5));
        items.add(new Book("4","Physics",10, 18,  "myself"));
        items.add(new Book("6","Chemistry",9, 18,  "myself"));

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
        System.out.println("/n");

        /**
         *  demo of inventory
         */


        Inventory<Electronics> electronicsInventory = new Inventory<>();
        electronicsInventory.add(new Electronics("5","Apple",1600, 2,  2));
        electronicsInventory.add(new Electronics("2","Nokia",100, 1,  5));
        electronicsInventory.add(new Electronics("0","Redmi",1600, 2,  2));
        electronicsInventory.add(new Electronics("1","Blackberry",100, 1,  5));

//        will not work for cloth since in generic electronic is added
//        electronicsInventory.add(new Clothing("3","HM",600, 5,  4));

        System.out.println("**********  this is electronics inventory **********");
        for(Electronics e: electronicsInventory.getAllItems()){
            System.out.println(e.getName()+" -> "+e.getPrice());
        }

        /**
         * lruInventory is a lrucache
         */
        LruInventory<Electronics> lruInventory = new LruInventory<>(3);
        lruInventory.add(new Electronics("5","Apple",1600, 2,  2));
        lruInventory.add(new Electronics("2","Nokia",100, 1,  5));
        lruInventory.add(new Electronics("0","Redmi",1600, 2,  2));
        lruInventory.get("5");
        lruInventory.add(new Electronics("1","Blackberry",100, 1,  5));

        System.out.println("**********  Lru electronics inventory **********");
        for(Electronics e: lruInventory.getAllItems()){
            System.out.println(e.getName()+" -> "+e.getPrice());
        }

        /**
         * Order processing with natural ordering and comaparator
         */

//        OrderProcesser orderProcesser = new OrderProcesser(new OrderComparator());
        OrderProcesser orderProcesser = new OrderProcesser();
        orderProcesser.addOrder(new Order("1",false,500));
        orderProcesser.addOrder(new Order("3",true,200));
        orderProcesser.addOrder(new Order("2",true,900));

        while(orderProcesser.getSize()>0){
            System.out.println(orderProcesser.processOrder().getOrderId());
        }
    }
}
