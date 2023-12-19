package com.fullstacktraining.hostelian.CustomExceptionClasses;

public class DataDeletionException extends RuntimeException{
    public DataDeletionException(String message){
        super(message);
    }

    public DataDeletionException(String message, Throwable cause) {
        super(message, cause);
    }
}
