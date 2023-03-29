package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dto.Movie;
import com.example.entities.MovieEntity;

public interface ExampleMovieRepo  extends JpaRepository<MovieEntity, Integer>{

}
