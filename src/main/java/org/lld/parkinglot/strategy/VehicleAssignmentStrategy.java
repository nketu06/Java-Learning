package org.lld.parkinglot.strategy;

import org.lld.parkinglot.models.ParkingLot;
import org.lld.parkinglot.models.ParkingSlot;
import org.lld.parkinglot.models.Vehicle;
import org.lld.parkinglot.models.VehicleType;

public interface VehicleAssignmentStrategy {

    public ParkingSlot assignSlot(ParkingLot parkingLot, VehicleType vehicleType);
}
