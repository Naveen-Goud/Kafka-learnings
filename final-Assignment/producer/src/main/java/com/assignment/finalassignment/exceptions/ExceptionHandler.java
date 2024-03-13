package com.assignment.finalassignment.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Date;


@ControllerAdvice
public class ExceptionHandler {
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @org.springframework.web.bind.annotation.ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ExceptionDetails> handleNotFoundException(NotFoundException e ){
        ExceptionDetails details=new ExceptionDetails(new Date(),e.getMessage(),HttpStatus.NOT_FOUND);
        return  new ResponseEntity<>(details,HttpStatus.NOT_FOUND);

    }

    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<ExceptionDetails> handleGlobalException(Exception exception){
        ExceptionDetails details=new ExceptionDetails();
        details.setMsg(exception.getMessage());
        details.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
        details.setDate(new Date());
        return new ResponseEntity(details, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<ExceptionDetails> handleBadRequestException(Exception exception){
        ExceptionDetails details=new ExceptionDetails();
        details.setMsg(exception.getMessage());
        details.setStatus(HttpStatus.BAD_REQUEST);
        details.setDate(new Date());
        return new ResponseEntity(details, HttpStatus.BAD_REQUEST);
    }
}
