package org.lld.parkinglot.strategy;

import org.lld.parkinglot.models.*;

public class RandomVehicleAssignStrategy implements VehicleAssignmentStrategy{
    @Override
    public ParkingSlot assignSlot(ParkingLot parkingLot, VehicleType vehicleType) {

        for(ParkingFloor floor : parkingLot.getParkingFloors()) {
            for(ParkingSlot slot : floor.getParkingSlots()) {
                if(slot.getParkingSlotStatus().equals(Status.AVAILABLE)
                        && slot.getVehicleType().equals(vehicleType)) {
                    slot.setParkingSlotStatus(Status.FILLED);
                    return slot;
                }
            }
        }

        return null;
    }
}
