package com.ashokit.service;

import com.ashokit.request.Passenger;
import com.ashokit.response.Ticket;

public interface ITicketBookingService {
	public String bookTicket(Passenger passenger);
	public Ticket getTicketByPnr(Integer pnr);
}
