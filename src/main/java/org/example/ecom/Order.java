package org.example.ecom;

public class Order implements Comparable<Order> {
    private String orderId;
    private boolean isExpress;
    private int amount;

    public Order(String orderId, boolean isExpress, int amount) {
        this.orderId = orderId;
        this.isExpress = isExpress;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public boolean isExpress() {
        return isExpress;
    }

    public void setExpress(boolean express) {
        isExpress = express;
    }

    @Override
    public int compareTo(Order o) {
        if(this.isExpress==o.isExpress) {
            return this.orderId.compareTo(o.orderId);
        } else if (this.isExpress) {
            return -1;
        }else {
            return 1;
        }
    }
}
