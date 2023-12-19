package com.fullstacktraining.hostelian.models;

import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;
import java.util.List;

public class ResponseModel {
    private List<String> message;
    private HttpStatus httpStatus;
    private ZonedDateTime timestamp;

    public ResponseModel() {
    }

    public ResponseModel(List<String> message, HttpStatus httpStatus, ZonedDateTime timestamp) {
        this.message = message;
        this.httpStatus = httpStatus;
        this.timestamp = timestamp;
    }


    public List<String> getMessage() {
        return message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public ZonedDateTime getTimestamp() {
        return timestamp;
    }

    public void setMessage(List<String> message) {
        this.message = message;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public void setTimestamp(ZonedDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "ExceptionResponseModel{" +
                "message='" + message + '\'' +
                ", httpStatus=" + httpStatus +
                ", timestamp=" + timestamp +
                '}';
    }
}
