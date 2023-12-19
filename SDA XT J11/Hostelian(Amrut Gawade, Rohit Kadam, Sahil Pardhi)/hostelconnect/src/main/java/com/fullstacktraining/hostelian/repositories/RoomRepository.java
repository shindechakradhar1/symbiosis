package com.fullstacktraining.hostelian.repositories;

import com.fullstacktraining.hostelian.entities.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RoomRepository extends JpaRepository<Room, Long> {
    @Query("SELECT r FROM Room r WHERE r.currentCapacity > 0")
    List<Room> findRoomsByCurrentCapacityGreaterThanZero();
}
