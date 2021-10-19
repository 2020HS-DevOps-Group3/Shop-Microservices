package com.devops.paymentservice.config;

import com.devops.paymentservice.dtos.ServiceResponse;
import com.devops.paymentservice.exceptions.BadRequestException;
import com.devops.paymentservice.exceptions.NotFoundException;
import com.devops.paymentservice.utils.Constants;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class ExceptionsHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    public ResponseEntity<ServiceResponse<Void>> handleAllExceptions(MethodArgumentNotValidException ex, WebRequest request) {
        return ServiceResponse.badRequest(null, Constants.ResponseMessages.BAD_REQUEST_MESSAGE);
    }

    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    public ResponseEntity<ServiceResponse<String>> handleAllExceptions(NotFoundException ex, WebRequest request) {
        return ServiceResponse.notFound(ex.getMessage());
    }

    @ExceptionHandler(BadRequestException.class)
    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    public ResponseEntity<ServiceResponse<String>> handleAllExceptions(BadRequestException ex, WebRequest request) {
        return ServiceResponse.notFound(ex.getMessage());
    }
}
