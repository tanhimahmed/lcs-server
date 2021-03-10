package com.xfinity.interview.lcs.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class LcsExceptionHandler {

	@ExceptionHandler(value=HttpMessageNotReadableException.class)
	@ResponseBody
	public ResponseEntity<Object> NotReadableException(HttpMessageNotReadableException e) {
		return new ResponseEntity<>("The Set of Strings is in an invalid format.", HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(value=HttpMediaTypeNotSupportedException.class)
	@ResponseBody
	public ResponseEntity<Object> IllegalFormatException(HttpMediaTypeNotSupportedException e) {
		return new ResponseEntity<>("The Set of Strings is in an invalid format.", HttpStatus.BAD_REQUEST);	
	}

	@ExceptionHandler(value=NullPointerException.class)
	@ResponseBody
	public ResponseEntity<Object> IllegalFormatException(NullPointerException e) {
		return new ResponseEntity<>("The Set of Strings is in an invalid format.", HttpStatus.BAD_REQUEST);	
	}

	@ExceptionHandler(value=SetContainsDuplicateException.class)
	@ResponseBody
	public ResponseEntity<Object> DuplicateException(SetContainsDuplicateException e) {
		return new ResponseEntity<>("The Set of Strings cannot contain any duplicate values.", HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(value=IndexOutOfBoundsException.class)
	@ResponseBody
	public ResponseEntity<Object> EmptyJsonBodyException(IndexOutOfBoundsException e) {
		return new ResponseEntity<>("The Set of Strings cannot be empty.", HttpStatus.BAD_REQUEST);
	}
} 