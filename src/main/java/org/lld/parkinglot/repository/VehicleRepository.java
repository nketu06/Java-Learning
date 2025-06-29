package org.lld.parkinglot.repository;

import org.lld.parkinglot.models.Vehicle;

import java.util.HashMap;
import java.util.Optional;

public class VehicleRepository {

    private HashMap<String, Vehicle> vehicles;
    private static int counter = 0;

    public VehicleRepository() {
        vehicles = new HashMap<>();
    }

     public Optional<Vehicle> findByLisencePlate(String licensePlate) {
        return Optional.ofNullable(vehicles.get(licensePlate));
    }

    public Vehicle save(Vehicle vehicle) {
        counter++;
        vehicle.setId(counter);
        vehicles.put(vehicle.getLicensePlate(), vehicle);
        return vehicle;
    }
}
