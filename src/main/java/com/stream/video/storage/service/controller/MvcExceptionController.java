package com.stream.video.storage.service.controller;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.NoSuchElementException;

@ControllerAdvice
public class MvcExceptionController {

    @ExceptionHandler(NoSuchElementException.class)
    ResponseEntity handleNoSuchElementException(NoSuchElementException exception)
    {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<Object> handleSQLIntegrityException(DataIntegrityViolationException exception)
    {
        {
            if(exception.getMessage().contains("null"))
                return new ResponseEntity<>("Unsigned value(s) for required field", HttpStatus.BAD_REQUEST);

            return new ResponseEntity<>(exception.getMessage(), HttpStatus.CONFLICT);

        }
    }


}
