package org.lld.parkinglot.controller;

import org.lld.parkinglot.models.*;
import org.lld.parkinglot.repository.GateRepository;

import java.util.List;

public class ParkingLotController {

    public ParkingLot getParkingLot() {

//        initilize 2 parking floor with 2 slots

        ParkingSlot parkingSlot1 = new ParkingSlot(1, Status.AVAILABLE, VehicleType.TWO_WHEELER);
        ParkingSlot parkingSlot2 = new ParkingSlot(2, Status.AVAILABLE, VehicleType.TWO_WHEELER);
        ParkingFloor parkingFloor1 = new ParkingFloor(1,1,
                List.of(parkingSlot1,parkingSlot2),
                Status.AVAILABLE,List.of(VehicleType.TWO_WHEELER));

        ParkingSlot parkingSlot3 = new ParkingSlot(3, Status.AVAILABLE, VehicleType.HEAVY_VEHICLE);
        ParkingSlot parkingSlot4 = new ParkingSlot(4, Status.AVAILABLE, VehicleType.FOUR_WHEELER);

        ParkingFloor parkingFloor2 = new ParkingFloor(2,2,
                List.of(parkingSlot3,parkingSlot4),Status.AVAILABLE,
                List.of(VehicleType.FOUR_WHEELER,VehicleType.HEAVY_VEHICLE));


        GateRepository gateRepository = GateRepository.getInstance();

        return new ParkingLot(List.of(parkingFloor2,parkingFloor1),
                Status.AVAILABLE, gateRepository.findByEnter(),
                gateRepository.findByExit(),4,
                List.of(VehicleType.TWO_WHEELER,
                        VehicleType.FOUR_WHEELER,
                        VehicleType.HEAVY_VEHICLE));

    }
}
