package com.fullstacktraining.hostelian.services;

import com.fullstacktraining.hostelian.CustomExceptionClasses.DataDeletionException;
import com.fullstacktraining.hostelian.CustomExceptionClasses.DataFetchingException;
import com.fullstacktraining.hostelian.CustomExceptionClasses.DataInsertionException;
import com.fullstacktraining.hostelian.entities.Room;
import com.fullstacktraining.hostelian.models.ResponseModel;
import com.fullstacktraining.hostelian.repositories.RoomRepository;
import com.fullstacktraining.hostelian.services.interfaces.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomRepository roomRepository;


    //Room Entity CRUD Operations
    @Override
    public ResponseEntity<Room> addRoom(Room room) {
        Room roomResponse;
        if (room.getTotalCapacity() < room.getCurrentCapacity())
            throw new DataInsertionException("Current capacity must be less than or equal to total capacity");
        roomResponse = roomRepository.save(room);
        if (roomResponse != null)
            return new ResponseEntity<>(roomResponse, HttpStatus.CREATED);
        else
            throw new DataInsertionException("Data Insertion Failed");
    }
    @Override
    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }
    @Override
    public ResponseEntity<Room> getUniqueRoom(Long roomId) {
        Room room = roomRepository.findById(roomId).orElse(null);
        if (room == null) {
            throw new DataFetchingException("There is no room with room id " + roomId);
        }
        return new ResponseEntity<>(room, HttpStatus.FOUND);
    }

    @Override
    public ResponseEntity<List<Room>> findAvailableRooms() {
        List<Room> rooms = roomRepository.findRoomsByCurrentCapacityGreaterThanZero();
        return new ResponseEntity<>(rooms, HttpStatus.FOUND);
    }

    @Override
    public ResponseEntity<Room> updateRoom(Long roomId,Room room) {
        Room existingRoom = roomRepository.findById(roomId).orElse(null);
        if (room == null) {
            throw new DataFetchingException("There is no room with room id " + roomId);
        }
        existingRoom.setCost(room.getCost());
        existingRoom.setCurrentCapacity(room.getCurrentCapacity());
        existingRoom.setTotalCapacity(room.getTotalCapacity());

        return new ResponseEntity<>(roomRepository.save(existingRoom), HttpStatus.FOUND);
    }
    @Override
    public ResponseEntity<ResponseModel> deleteRoomDetails(Long roomId) {
        List<String> message = new ArrayList<>();
        if (roomRepository.existsById(roomId))
            roomRepository.deleteById(roomId);
        else
            throw new DataDeletionException("Room is not available with id "+roomId);
        message.add("Successfully Deleted");
        return new ResponseEntity<>(new ResponseModel(message,HttpStatus.OK, ZonedDateTime.now()),HttpStatus.OK);
    }

}
