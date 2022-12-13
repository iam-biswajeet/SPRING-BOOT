package com.ashokit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashokit.response.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket,Integer>  {
	public List<Ticket> findByPnr(Integer pnr);

}
