package org.lld.parkinglot.models;

public class Payment extends BaseModel{
    private int amount;
    private String refNumber;
    private PaymentMode paymentMode;
    private Bill bill;
    private PaymentStatus paymentStatus;

}
