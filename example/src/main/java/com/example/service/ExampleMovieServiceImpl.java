package com.example.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.Movie;
import com.example.dto.Ticket;
import com.example.repo.ExampleMovieRepo;
import com.example.entities.MovieEntity;
import com.example.exceptions.NoSuchExistAlready;

@Service
public class ExampleMovieServiceImpl implements ExampleMovieService {
	@Autowired
	private ExampleMovieRepo exampleMovieRepo;
	
	@Autowired
	private ModelMapper modelMapper;	 

	@Override
	public Movie createMovie(Movie movie) {
		MovieEntity movieObj = modelMapper.map(movie , MovieEntity.class);

		MovieEntity newMovie = exampleMovieRepo.save(movieObj);

		return modelMapper.map(newMovie, Movie.class);
	}

	@Override
	public Movie getMovieById(int movieId) {
		MovieEntity movie = exampleMovieRepo.findById(movieId).get();
			if(movie== null)
				throw new NoSuchExistAlready("No Such Movie Exists.");
		return modelMapper.map(movie, Movie.class);
	}
}
	

