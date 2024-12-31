package org.example.ecom;

import java.util.*;

public class LruInventory<T extends Item> extends LinkedHashMap<String,T> {

    private int capacity;

    public LruInventory(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<String, T> eldest) {
        return size() > capacity;
    }

    public void add(T item) {
        super.put(item.getId(), item);
    }

    public T getItems(String id) {
        return super.get(id);
    }

    public boolean remove(String id) {
        if (super.containsKey(id)) {
            super.remove(id);
            return true;
        }
        return false;
    }

    public List<T> getAllItems() {
        return new ArrayList<T>(super.values());
    }


}
