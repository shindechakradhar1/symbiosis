package com.fullstacktraining.hostelian.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import org.hibernate.annotations.Type;

import javax.annotation.processing.Generated;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatterBuilder;
import java.util.List;

@Entity
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roomId;
    @NotNull(message = "Eneter Total Capacity")
    @Min(value = 0,message = "Minimum Total capacity must be 0")
    private Integer totalCapacity;
    @NotNull(message = "Enter current capacity")
    @Min(value = 0,message = "Minimum current capacity must be 0")
    private Integer currentCapacity;
    @NotNull(message = "Enter cost")
    @Min(value = 0, message = "Minimum cost is 0")
    private Double cost;

    private LocalDateTime timestamp;

    public Room() {
    }

    public Room(Integer totalCapacity, Integer currentCapacity, Double cost) {
        this.totalCapacity = totalCapacity;
        this.currentCapacity = currentCapacity;
        this.cost = cost;
        timestamp = LocalDateTime.now();
    }

    public Room(Long roomId, Integer totalCapacity, Integer currentCapacity, Double cost) {
        this.roomId = roomId;
        this.totalCapacity = totalCapacity;
        this.currentCapacity = currentCapacity;
        this.cost = cost;
        timestamp = LocalDateTime.now();
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public Integer getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(Integer totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public Integer getCurrentCapacity() {
        return currentCapacity;
    }

    public void setCurrentCapacity(Integer currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }


    @Override
    public String toString() {
        return "Room{" +
                "roomId=" + roomId +
                ", totalCapacity=" + totalCapacity +
                ", currentCapacity=" + currentCapacity +
                ", cost=" + cost +
                ", timestamp=" + timestamp +
                '}';
    }
}
