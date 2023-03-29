package com.example.entities;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import com.example.dto.Movie;

import lombok.Data;

@Entity
@Table(name = "ticket")
@Data
public class TicketEntity {
	@Id
	 private int ticketId;
	 private String type; 
	 //Balcony or Stalls 
	 private int unitPrice;
	 private double price;
	 private String title;
	 
	 @ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	 @JoinColumn(name="movie_id")
	 private MovieEntity movie;
	 
		public TicketEntity() {
		}
		
		public TicketEntity(int ticketId, String type, int unitPrice, double price) {
			super();
			this.ticketId = ticketId;
			this.type = type;
			this.unitPrice = unitPrice;
			this.price = price;
		}

}
