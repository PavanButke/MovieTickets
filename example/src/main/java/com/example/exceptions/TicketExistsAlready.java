package com.example.exceptions;

public class TicketExistsAlready extends RuntimeException {

	private String message;

	public TicketExistsAlready() {
		super();

	}

	public TicketExistsAlready(String message) {
		super(message);
		this.message = message;
	}
}