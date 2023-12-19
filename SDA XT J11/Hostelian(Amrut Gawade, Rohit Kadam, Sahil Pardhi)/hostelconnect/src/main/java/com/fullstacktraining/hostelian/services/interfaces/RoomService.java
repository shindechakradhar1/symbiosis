package com.fullstacktraining.hostelian.services.interfaces;

import com.fullstacktraining.hostelian.entities.Room;
import com.fullstacktraining.hostelian.models.ResponseModel;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface RoomService {
    ResponseEntity<Room> addRoom(Room room);

    List<Room> getAllRooms();

    ResponseEntity<Room> getUniqueRoom(Long roomId);

    ResponseEntity<List<Room>> findAvailableRooms();

    ResponseEntity<Room> updateRoom(Long roomId,Room room);

    ResponseEntity<ResponseModel> deleteRoomDetails(Long roomId);
}
