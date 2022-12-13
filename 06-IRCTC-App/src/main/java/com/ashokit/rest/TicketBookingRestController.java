package com.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.request.Passenger;
import com.ashokit.response.Ticket;
import com.ashokit.service.ITicketBookingService;
@RestController
public class TicketBookingRestController {
	@Autowired
	ITicketBookingService service;
	@PostMapping(value = "/bookticket", 
			
			consumes={MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<String> BookTkt(@RequestBody Passenger passenger){
		String bookTicket = service.bookTicket(passenger);
		return new ResponseEntity<String>(bookTicket,HttpStatus.CREATED);
	}
	@GetMapping(value="/train/{pnr}",produces={"application/xml","application/json"})
	public ResponseEntity<Ticket> getTicket(@PathVariable("pnr") Integer pnr){
		Ticket ticket=service.getTicketByPnr(pnr);
		return new ResponseEntity<>(ticket,HttpStatus.OK);
	}

}
