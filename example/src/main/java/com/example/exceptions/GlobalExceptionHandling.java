package com.example.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.entities.ErrorResponse;

@ControllerAdvice
public class GlobalExceptionHandling {

	

	@ExceptionHandler(value = NoSuchExistAlready.class )
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public @ResponseBody ErrorResponse handleException(NoSuchExistAlready ex) {
		return new ErrorResponse(HttpStatus.NOT_FOUND.value(), ex.getMessage());
	}

	@ExceptionHandler(value =  TicketExistsAlready.class)
	@ResponseStatus
	public @ResponseBody ErrorResponse handleException(TicketExistsAlready ex) {
		return new ErrorResponse(HttpStatus.CONFLICT.value(), ex.getMessage());
	}
}