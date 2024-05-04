package com.marcilio.usermanager.resource.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.marcilio.usermanager.services.exceptions.ResourceNotFoundException;

import java.util.Date;

@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e) {
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError err = new StandardError(new Date(), status.value(), "Not Found", e.getMessage(), e.getClass().getName());
		return ResponseEntity.status(status).body(err);
	}
}
