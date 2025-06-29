package org.lld.parkinglot.controller;

import org.lld.parkinglot.dto.IssueTicketRequestDTO;
import org.lld.parkinglot.dto.IssueTicketResponseDTO;
import org.lld.parkinglot.dto.ResponseStatus;
import org.lld.parkinglot.models.Ticket;
import org.lld.parkinglot.service.TicketService;

public class TicketController {

    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponseDTO issueTicket(IssueTicketRequestDTO request) {

        IssueTicketResponseDTO response = new IssueTicketResponseDTO();
        try {
            Ticket ticket = ticketService.IssueTicket(
                    request.getLicensePlate(),
                    request.getOwnerName(),
                    request.getVehicleType(),
                    request.getGateId(),
                    request.getParkingLotId()
            );

            response.setResponseStatus(ResponseStatus.SUCCESS);
            response.setTicketId(ticket.getId());
//        response.setFloorNumber();

        }catch (Exception e){
            response.setResponseStatus(ResponseStatus.FAILURE);
            response.setFailureMessage(e.getMessage());
        }
        return response;
    }
}
