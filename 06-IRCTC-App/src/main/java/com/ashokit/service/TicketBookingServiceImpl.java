package com.ashokit.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.repository.TicketRepository;
import com.ashokit.request.Passenger;
import com.ashokit.response.Ticket;

@Service
public class TicketBookingServiceImpl implements ITicketBookingService{
	@Autowired
	TicketRepository tktRepo;
	@Override
	public String bookTicket(Passenger passenger) {
		Ticket ticket=new Ticket();
		ticket.setStatus("success");
		ticket.setCost(500.00f);
		ticket.setPnr(new Random().nextInt(1000));
		ticket.setFrom(passenger.getFrom());
		ticket.setTo(passenger.getTo());
		ticket.setJdate(passenger.getJdate());
		ticket.setName(passenger.getName());
		Ticket save = tktRepo.save(ticket);
		if(save.getTicketId()==null) {
			return "ticket booking is unsuccess";
		}
		else {
			return "ticket booking is successful";
		}
	}
	@Override
	public Ticket getTicketByPnr(Integer pnr) {
		List<Ticket> findByPnr = tktRepo.findByPnr(pnr);
		Ticket ticket = new Ticket();
		if(findByPnr.size()==0) {
			
			return null;
		}
		else {
			ticket =findByPnr.get(0);
		}
		return ticket;
	}
	

}
