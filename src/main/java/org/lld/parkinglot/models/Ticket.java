package org.lld.parkinglot.models;

import java.util.Date;

public class Ticket extends BaseModel {
    private Vehicle vehicle;
    private Date date;
    private ParkingSlot parkingSlot;
    private Operator  operator;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public Gate getEntrygate() {
        return Entrygate;
    }

    public void setEntrygate(Gate entrygate) {
        Entrygate = entrygate;
    }

    private Gate  Entrygate;
}
