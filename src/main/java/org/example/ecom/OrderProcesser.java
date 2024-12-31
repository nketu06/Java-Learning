package org.example.ecom;

import java.util.PriorityQueue;
import java.util.Queue;

public class OrderProcesser {

    PriorityQueue<Order> orders;

    public OrderProcesser() {
        orders = new PriorityQueue<>();
    }
    public OrderProcesser(OrderComparator orderComparator) {
        orders = new PriorityQueue<>(orderComparator);
    }

    public void addOrder(Order order) {
        orders.offer(order);
    }

    public Order processOrder() {
        return orders.poll();
    }

    public int getSize(){
        return orders.size();
    }
}
