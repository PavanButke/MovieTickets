package com.example.dto;

public class Movie {
	
	  private int movieId;
	  private String title;
	  private String director;
	  private String language;
	  private int year;
	  
	public Movie() {
		super();
	}

	public Movie(int movieId, String title, String director, String language, int year) {
		super();
		this.movieId = movieId;
		this.title = title;
		this.director = director;
		this.language = language;
		this.year = year;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", title=" + title + ", director=" + director + ", language=" + language
				+ ", year=" + year + "]";
	}
	  
	 

	  
	  
	
	  
	  
	  
	
	
}
