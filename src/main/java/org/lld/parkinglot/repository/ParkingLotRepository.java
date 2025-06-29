package org.lld.parkinglot.repository;

import org.lld.parkinglot.models.ParkingLot;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class ParkingLotRepository {

    Map<Integer, ParkingLot> parkingLots;

    public ParkingLotRepository() {
        parkingLots = new TreeMap<>();
    }

    public Optional<ParkingLot>  findById(int parkingLotId) {
        return Optional.ofNullable(parkingLots.get(parkingLotId));
    }
}
