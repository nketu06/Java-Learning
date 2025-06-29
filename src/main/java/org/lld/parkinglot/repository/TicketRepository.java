package org.lld.parkinglot.repository;

import org.lld.parkinglot.models.Ticket;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class TicketRepository {

    private Map<Integer, Ticket> tickets;
    private static int counter;

    public TicketRepository() {
        tickets = new HashMap<>();
        counter = 0;

    }

    public Ticket save(Ticket ticket) {
        counter++;
        ticket.setId(counter);
        tickets.put(counter, ticket);
        return ticket;
    }


}
