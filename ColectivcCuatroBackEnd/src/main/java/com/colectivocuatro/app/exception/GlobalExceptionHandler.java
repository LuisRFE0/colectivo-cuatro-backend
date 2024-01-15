package com.colectivocuatro.app.exception;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
@ControllerAdvice
public class GlobalExceptionHandler {
	@Autowired
	ErrorDetails errorDetails;
	
	@ExceptionHandler( IllegalStateException.class )
	ResponseEntity<ErrorDetails> handleIllegalStateException(Exception exception,WebRequest webRequest){
		errorDetails.setMessage(exception.getMessage());
		errorDetails.setTimestamp(LocalDateTime.now());
		errorDetails.setErrorCode("RESOURCE_NOT_FOUND" );
		errorDetails.setPath( webRequest.getDescription(false));
		return new ResponseEntity<>( errorDetails, HttpStatus.BAD_REQUEST );
	}
}
