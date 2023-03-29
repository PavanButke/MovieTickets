package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.Movie;
import com.example.dto.Ticket;
import com.example.repo.ExampleMovieRepo;
import com.example.repo.ExampleTicketRepo;
import com.example.entities.MovieEntity;
import com.example.entities.TicketEntity;
import com.example.exceptions.NoSuchExistAlready;
import com.example.exceptions.TicketExistsAlready;

@Service
public class ExampleTicketServiceImpl implements ExampleTicketService{
	@Autowired
	private ExampleTicketRepo exampleTicketRepo;
	@Autowired
	private ExampleMovieRepo exMovieRepo;
	@Autowired
	private ModelMapper modelMapper;	 


	public Ticket createMovieTicket(Ticket ticket) {
		TicketEntity ticketObj = modelMapper.map(ticket , TicketEntity.class);
		
		TicketEntity getTicket = exampleTicketRepo.findById(ticketObj.getTicketId()).orElse(null);
		if(getTicket==null)
		{
			TicketEntity newTicket= exampleTicketRepo.save(ticketObj);
			return modelMapper.map(newTicket, Ticket.class);
		}
		else
		{
			throw new TicketExistsAlready("Duplicate Values !!! Ticket Already Exists");
		}
		
	}

	public Ticket getMovieTicketById(int ticketId) {
		TicketEntity ticket = exampleTicketRepo.findById(ticketId).get();	
			if(ticket==null)
				throw new NoSuchExistAlready("No Such Ticket Exists");
		ticket.setTitle(ticket.getMovie().getTitle());
		return modelMapper.map(ticket, Ticket.class);
	}

	public List<Ticket> getTicketsByMovieId(int movieId) {

				
			List<TicketEntity> tickets = exampleTicketRepo.getAllTickets(movieId);
			List<Ticket> ticketDtos = new ArrayList<Ticket>();

			for (TicketEntity ticket : tickets) {
				ticket.setTitle(ticket.getMovie().getTitle());
				ticketDtos.add(modelMapper.map(ticket, Ticket.class));
			}

			return ticketDtos;
		}
	}

