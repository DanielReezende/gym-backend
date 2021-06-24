package br.edu.unifeso.gymapi.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import br.edu.unifeso.gymapi.exceptions.ItemAlreadyExistsException;

@RestControllerAdvice
public class ExceptionsController {

	@ExceptionHandler(ItemAlreadyExistsException.class)
	public ResponseEntity<String> handleItemAlreadyExistsException(ItemAlreadyExistsException exception) {
		return ResponseEntity.status(HttpStatus.CONFLICT).header("x-erro-msg", exception.getMessage()).build();
	}
}
