package org.lld.parkinglot.models;

public class ParkingSlot extends BaseModel{
    private int number;
    private Status parkingSlotStatus;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Status getParkingSlotStatus() {
        return parkingSlotStatus;
    }

    public void setParkingSlotStatus(Status parkingSlotStatus) {
        this.parkingSlotStatus = parkingSlotStatus;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    private VehicleType vehicleType;


}
