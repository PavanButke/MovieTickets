package com.example.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.dto.Ticket;
import com.example.entities.TicketEntity;

public interface ExampleTicketRepo extends JpaRepository<TicketEntity, Integer>{
	
	@Query(value = "select * from ticket where movie_id=:movieId ", nativeQuery = true)
	List<TicketEntity> getAllTickets(@Param("movieId") int movieId);
}
