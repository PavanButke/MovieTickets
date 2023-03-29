package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.Movie;
import com.example.dto.Ticket;
import com.example.service.ExampleMovieService;
import com.example.service.ExampleTicketService;

@RestController
@RequestMapping(value = "/theater", produces = { MediaType.APPLICATION_JSON_VALUE,
		MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
				MediaType.APPLICATION_XML_VALUE })
public class ExampleMovieController {

	@Autowired
	private ExampleMovieService exampleMovieService;

	@Autowired
	private ExampleTicketService exampleTicketService;

	@GetMapping(value = "/movie/{movieId}")
	public ResponseEntity<Movie> getMovieDetails(@PathVariable("movieId") int movieId) {

		System.out.println("hey");
		return new ResponseEntity<Movie>(exampleMovieService.getMovieById(movieId), HttpStatus.OK);

	}

	@PostMapping(value = "/movie")
	public ResponseEntity<Movie> insertMovie(@RequestBody Movie movie) {
		System.out.println("hi");
		return new ResponseEntity<Movie>(exampleMovieService.createMovie(movie), HttpStatus.CREATED);

	}

	@GetMapping(value = "/movie/ticket/booking/{ticketId}")
	public ResponseEntity<Ticket> getTicketDetails(@PathVariable("ticketId") int ticketId) {

		return new ResponseEntity<Ticket>(exampleTicketService.getMovieTicketById(ticketId), HttpStatus.OK);

	}

	@PostMapping(value = "/movie/ticket/booking")
	public ResponseEntity<Ticket> createTicket(@RequestBody Ticket ticket) {

		return new ResponseEntity<Ticket>(exampleTicketService.createMovieTicket(ticket), HttpStatus.CREATED);

	}

	@GetMapping("/movie/{movieId}/ticket")
	public ResponseEntity<List<Ticket>> getAllTicketsByMovieId(@PathVariable("movieId") int movieId) {

		return new ResponseEntity<List<Ticket>>(exampleTicketService.getTicketsByMovieId(movieId), HttpStatus.OK);

	}

}
