package org.lld.parkinglot;

import org.lld.parkinglot.controller.ParkingLotController;
import org.lld.parkinglot.controller.TicketController;
import org.lld.parkinglot.dto.IssueTicketRequestDTO;
import org.lld.parkinglot.dto.IssueTicketResponseDTO;
import org.lld.parkinglot.dto.ResponseStatus;
import org.lld.parkinglot.models.ParkingLot;
import org.lld.parkinglot.models.VehicleType;
import org.lld.parkinglot.repository.GateRepository;
import org.lld.parkinglot.repository.ParkingLotRepository;
import org.lld.parkinglot.repository.TicketRepository;
import org.lld.parkinglot.repository.VehicleRepository;
import org.lld.parkinglot.service.TicketService;

public class main {
    public static void main(String[] args) {

        GateRepository gateRepository = GateRepository.getInstance();
        VehicleRepository vehicleRepository = new VehicleRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        TicketRepository ticketRepository = new TicketRepository();

        ParkingLotController parkingLotController = new ParkingLotController();

        ParkingLot parkingLot = parkingLotController.getParkingLot();
        parkingLotRepository.save(parkingLot);

        TicketService ticketService = new TicketService(
                gateRepository, vehicleRepository, parkingLotRepository, ticketRepository
        );

        TicketController ticketController = new TicketController(ticketService);

        IssueTicketRequestDTO issueTicketRequestDTO = new IssueTicketRequestDTO();
        issueTicketRequestDTO.setGateId(1);
        issueTicketRequestDTO.setParkingLotId(1);
        issueTicketRequestDTO.setLicensePlate("XXX");
        issueTicketRequestDTO.setVehicleType(VehicleType.TWO_WHEELER);
        issueTicketRequestDTO.setOwnerName("John Doe");


        IssueTicketResponseDTO response = ticketController.issueTicket(issueTicketRequestDTO);
        if(response.getResponseStatus()== ResponseStatus.FAILURE){
            System.out.println("Issue Ticket Failed");
            System.out.println(response.getResponseStatus());
        }else{
            System.out.println("Issue Ticket Success.");
            System.out.println(response.getSlotNumber());
        }


        issueTicketRequestDTO = new IssueTicketRequestDTO();
        issueTicketRequestDTO.setGateId(1);
        issueTicketRequestDTO.setParkingLotId(1);
        issueTicketRequestDTO.setLicensePlate("YYY");
        issueTicketRequestDTO.setVehicleType(VehicleType.TWO_WHEELER);
        issueTicketRequestDTO.setOwnerName("Jamie nelson");

        response = ticketController.issueTicket(issueTicketRequestDTO);
        if(response.getResponseStatus()== ResponseStatus.FAILURE){
            System.out.println("Issue Ticket Failed");
            System.out.println(response.getResponseStatus());
        }else{
            System.out.println("Issue Ticket Success.");
            System.out.println(response.getSlotNumber());
        }

    }

    // add data and make it run
    // try to add factory for slot assignment strategy
}
