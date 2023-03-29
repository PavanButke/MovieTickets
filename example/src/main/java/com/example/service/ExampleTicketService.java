package com.example.service;

import java.util.List;

import com.example.dto.Ticket;

public interface ExampleTicketService {
	
	 public Ticket createMovieTicket(Ticket ticket);
	 public Ticket getMovieTicketById(int ticketId);
	 public List<Ticket> getTicketsByMovieId(int movieId);
}
