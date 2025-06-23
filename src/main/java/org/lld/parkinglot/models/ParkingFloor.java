package org.lld.parkinglot.models;

import java.util.List;

public class ParkingFloor extends BaseModel {

    private int number;
    private List<ParkingSlot> parkingSlots;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<ParkingSlot> getParkingSlots() {
        return parkingSlots;
    }

    public void setParkingSlots(List<ParkingSlot> parkingSlots) {
        this.parkingSlots = parkingSlots;
    }

    public Status getParkingFloorStatus() {
        return parkingFloorStatus;
    }

    public void setParkingFloorStatus(Status parkingFloorStatus) {
        this.parkingFloorStatus = parkingFloorStatus;
    }

    public List<VehicleType> getSupportedVehicleTypes() {
        return supportedVehicleTypes;
    }

    public void setSupportedVehicleTypes(List<VehicleType> supportedVehicleTypes) {
        this.supportedVehicleTypes = supportedVehicleTypes;
    }

    private Status parkingFloorStatus;
    private List<VehicleType> supportedVehicleTypes;



}
