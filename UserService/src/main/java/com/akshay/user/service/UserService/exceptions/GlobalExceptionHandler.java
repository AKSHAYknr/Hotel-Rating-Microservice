package com.akshay.user.service.UserService.exceptions;

import com.akshay.user.service.UserService.payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ApiResponse> handlerResourceNotFoundException(UserNotFoundException exception){
        String message = exception.getMessage();
        ApiResponse apiResponse = ApiResponse.builder()
                                .message(message)
                                .success(true)
                                .status(HttpStatus.NOT_FOUND)
                                .build();
        return new ResponseEntity<>(apiResponse, HttpStatus.NOT_FOUND);
    }
}
