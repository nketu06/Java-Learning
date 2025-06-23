package org.lld.parkinglot.models;

import java.util.Date;
import java.util.List;

public class Bill extends BaseModel{
    private  int totalAmount;
    private  Ticket ticket;
    private Date exitTime;
    private List<Payment> payments;
    private PaymentStatus paymentStatus;
    private Gate exitGate;
    private Operator operator;


}
