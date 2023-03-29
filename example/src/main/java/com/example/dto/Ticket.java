package com.example.dto;

public class Ticket {
	
	 private int ticketId;
	 private String title;
	 private String type;
	private int unitPrice; 
	private int noOfTickets;
	private double price;
	
	public Ticket() {
		super();
	}

	public Ticket(int ticketId, String title, String type, int unitPrice, int noOfTickets, double price) {
		super();
		this.ticketId = ticketId;
		this.title = title;
		this.type = type;
		this.unitPrice = unitPrice;
		this.noOfTickets = noOfTickets;
		this.price = price;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getNoOfTickets() {
		return noOfTickets;
	}

	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", title=" + title + ", type=" + type + ", unitPrice=" + unitPrice
				+ ", noOfTickets=" + noOfTickets + ", price=" + price + "]";
	}
	

}
