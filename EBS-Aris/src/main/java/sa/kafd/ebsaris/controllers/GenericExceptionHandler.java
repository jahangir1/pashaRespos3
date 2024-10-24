package sa.kafd.ebsaris.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import sa.kafd.ebsaris.httpBodies.response.GenericErrorMessage;


@ControllerAdvice
public class GenericExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = IllegalArgumentException.class)
    public ResponseEntity<GenericErrorMessage> handleIllegalArgument(IllegalArgumentException e) {
        GenericErrorMessage errorResponse = new GenericErrorMessage(e.getMessage(), HttpStatus.BAD_REQUEST.value()) ;
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }
}
