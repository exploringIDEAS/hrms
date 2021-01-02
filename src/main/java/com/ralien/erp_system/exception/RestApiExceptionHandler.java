package com.ralien.erp_system.exception;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@RestControllerAdvice
public class RestApiExceptionHandler {
    @ExceptionHandler(value = {DataIntegrityViolationException.class})
    public ResponseEntity<RestApiException> handleDataIntegrityViolationException(DataIntegrityViolationException e, WebRequest request) {
        RestApiException restApiException = new RestApiException("Entry Already Exists.", HttpStatus.BAD_REQUEST.name(), new Date(), HttpStatus.BAD_REQUEST.value(), request.getDescription(false));
        return new ResponseEntity<>(restApiException, HttpStatus.BAD_REQUEST);
    }
}
