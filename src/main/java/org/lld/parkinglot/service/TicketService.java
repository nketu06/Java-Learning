package org.lld.parkinglot.service;

import org.lld.parkinglot.models.*;
import org.lld.parkinglot.repository.GateRepository;
import org.lld.parkinglot.repository.ParkingLotRepository;
import org.lld.parkinglot.repository.TicketRepository;
import org.lld.parkinglot.repository.VehicleRepository;
import org.lld.parkinglot.strategy.VehicleAssignmentStrategy;

import java.util.Date;
import java.util.Optional;

public class TicketService {

    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private ParkingLotRepository parkingLotRepository;
    private TicketRepository ticketRepository;

    public TicketService(GateRepository gateRepository, VehicleRepository vehicleRepository, ParkingLotRepository parkingLotRepository, TicketRepository ticketRepository) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.ticketRepository = new TicketRepository();

    }

    public Ticket IssueTicket(String licensePlate, String ownerName, VehicleType vehicleType, int gateId, int parkinglotId) {

        Optional<Gate> getOptional = gateRepository.findById(gateId);
        Optional<Vehicle> getVehicleOptional = vehicleRepository.findByLisencePlate(licensePlate);
        Optional<ParkingLot> getParkingLotOptional = parkingLotRepository.findById(parkinglotId);

        if (getOptional.isEmpty()) {
            throw new IllegalArgumentException("Gate does not exist");
        }
        Gate gate = getOptional.get();

        Vehicle vehicle = null;
        if(getVehicleOptional.isEmpty()) {
            vehicle = new Vehicle(licensePlate, ownerName, vehicleType);
            vehicle= vehicleRepository.save(vehicle);
        }else{
            vehicle = getVehicleOptional.get();
        }

        if (getParkingLotOptional.isEmpty()) {
            throw new IllegalArgumentException("Parkinglot does not exist");
        }
        ParkingLot parkingLot = getParkingLotOptional.get();

        // Assign a slot
        ParkingSlot parkingSlot = parkingLot.getRandomVehicleAssignStrategy().assignSlot(parkingLot,vehicleType);

        Ticket ticket = new Ticket();
        ticket.setEntrygate(gate);
        ticket.setVehicle(vehicle);
        ticket.setParkingSlot(parkingSlot);
        ticket.setOperator(gate.getOperator());
        ticket.setCreatedAt(new Date());
        return ticketRepository.save(ticket);


    }

}
