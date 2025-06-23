package org.lld.parkinglot.models;

import java.util.List;

public class ParkingLot{

    private List<ParkingFloor> parkingFloors;
    private Status parkingLotStatus;
    private List<Gate> entryGates;
    private List<Gate> exitGates;
    private int totalCapacity;
    private List<VehicleType> supportedVehicleTypes;


    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public Status getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(Status parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public List<Gate> getEntryGates() {
        return entryGates;
    }

    public void setEntryGates(List<Gate> entryGates) {
        this.entryGates = entryGates;
    }

    public List<Gate> getExitGates() {
        return exitGates;
    }

    public void setExitGates(List<Gate> exitGates) {
        this.exitGates = exitGates;
    }

    public int getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(int totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public List<VehicleType> getSupportedVehicleTypes() {
        return supportedVehicleTypes;
    }

    public void setSupportedVehicleTypes(List<VehicleType> supportedVehicleTypes) {
        this.supportedVehicleTypes = supportedVehicleTypes;
    }
}
