package org.example.ecom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory<T extends Item> {

     private Map<String, T> inventory;

    public Inventory() {
//        inventory = new LruInventory<>(3);// if want LRU cache
        inventory = new HashMap<>();
    }

    public void add(T item) {
        inventory.put(item.getId(), item);
    }

    public T getItems(String id) {
        return inventory.get(id);
    }

    public boolean remove(String id) {
        if (inventory.containsKey(id)) {
            inventory.remove(id);
            return true;
        }
        return false;
    }

    public List<T> getAllItems() {
        return new ArrayList<T>(inventory.values());
    }


}
