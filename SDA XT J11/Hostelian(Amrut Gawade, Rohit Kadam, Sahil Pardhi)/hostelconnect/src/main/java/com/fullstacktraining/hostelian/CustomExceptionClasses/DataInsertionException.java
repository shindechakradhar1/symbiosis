package com.fullstacktraining.hostelian.CustomExceptionClasses;

public class DataInsertionException extends RuntimeException{
    public DataInsertionException(String message){
        super(message);
    }

    public DataInsertionException(String message, Throwable cause) {
        super(message, cause);
    }
}
