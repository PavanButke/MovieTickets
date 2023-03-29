package com.example.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.Data;



@Entity
@Table(name = "movie")
@Data
public class MovieEntity {
	
	@Id
	private int movieId;
	private String title; 
	private String director;
	private String language;
	private int year;
	
	@OneToMany(mappedBy = "movie" ,cascade =  CascadeType.ALL,fetch = FetchType.LAZY )
	//@JoinTable(name = "ticket", joinColumns =  @JoinColumn(name = "movieId"), inverseJoinColumns = @JoinColumn(name="ticketId"))
	private List<TicketEntity> tickets;
	
	public MovieEntity() {
	}
	
	public MovieEntity(int movieId, String title, String director,String language, int year) {
		super();
		this.movieId = movieId;
		this.title = title;
		this.director = director;
		this.language = language;
		this.year = year;
	}
	
}
