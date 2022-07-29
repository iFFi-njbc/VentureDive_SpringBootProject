package com.RestProject1.springrestapi.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import io.swagger.annotations.ApiResponse;

@ControllerAdvice
public class GlobalExceptionHandler{
	
	
	//execute if there is an error in binding jason object into our model

	@ExceptionHandler(DataIntegrityViolationException.class)
	public ResponseEntity<?> handleException1(DataIntegrityViolationException ex)
	{
		String msg = "Enter all the required feilds : " + ex.getMessage();
		return new ResponseEntity(msg, HttpStatus.FORBIDDEN);
	}
	
	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<?> handleException2(RuntimeException ex)
	{
		String msg = ex.getMessage();
		return new ResponseEntity(msg, HttpStatus.FORBIDDEN);
	} 
	
}