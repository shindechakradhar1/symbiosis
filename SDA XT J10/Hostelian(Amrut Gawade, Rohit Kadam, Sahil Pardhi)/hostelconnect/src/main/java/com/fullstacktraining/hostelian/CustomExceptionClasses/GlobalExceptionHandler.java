package com.fullstacktraining.hostelian.CustomExceptionClasses;

import com.fullstacktraining.hostelian.models.ResponseModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class GlobalExceptionHandler {
    private List<String> messages;
    @ExceptionHandler(value = {DataInsertionException.class})
    public ResponseEntity<Object> HandleExceptionResponse(DataInsertionException exception){
        messages = new ArrayList<>();
        messages.add(exception.getMessage());
        ResponseModel exceptionResponseModel = new ResponseModel(messages, HttpStatus.BAD_REQUEST, ZonedDateTime.now());
        return new ResponseEntity<>(exceptionResponseModel,HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(value = {DataFetchingException.class})
    public ResponseEntity<Object> HandleDataFetchingExceptionResponse(DataFetchingException exception){
        messages = new ArrayList<>();
        messages.add(exception.getMessage());
        ResponseModel exceptionResponseModel = new ResponseModel(messages, HttpStatus.BAD_REQUEST, ZonedDateTime.now());
        return new ResponseEntity<>(exceptionResponseModel,HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(value = {DataDeletionException.class})
    public ResponseEntity<Object> HandleDataDeletionExceptionResponse(DataDeletionException exception){
        messages = new ArrayList<>();
        messages.add(exception.getMessage());
        ResponseModel exceptionResponseModel = new ResponseModel(messages, HttpStatus.BAD_REQUEST, ZonedDateTime.now());
        return new ResponseEntity<>(exceptionResponseModel,HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = {MethodArgumentNotValidException.class})
    public ResponseEntity<ResponseModel> HandleMethodArgumentNotValidExc(MethodArgumentNotValidException exception){
        messages = new ArrayList<>();
        exception.getBindingResult().getFieldErrors().forEach(fieldError -> {
            messages.add(fieldError.getDefaultMessage());
        });

        ResponseModel exceptionResponseModel = new ResponseModel(messages,HttpStatus.BAD_REQUEST,ZonedDateTime.now());
        return new ResponseEntity<>(exceptionResponseModel,HttpStatus.BAD_REQUEST);
    }
}
