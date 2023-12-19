package com.fullstacktraining.hostelian.controllers;

import com.fullstacktraining.hostelian.entities.Room;
import com.fullstacktraining.hostelian.models.ResponseModel;
import com.fullstacktraining.hostelian.services.interfaces.RoomService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/room")
public class RoomController {
    @Autowired
    private RoomService roomService;

    //Room Requests Controller
    @PostMapping("/addroomdetails")
    public ResponseEntity<Room> addRoom(@Valid @RequestBody Room room){
        return roomService.addRoom(room);
    }
    @GetMapping("/roomdetails")
    public List<Room> getRoomDetails(){
        return roomService.getAllRooms();
    }

    @PutMapping("/updateroomdetails/{roomId}")
    public ResponseEntity<Room> updateRoom(@PathVariable Long roomId,@Valid @RequestBody Room room){
        return roomService.updateRoom(roomId,room);
    }
    @DeleteMapping("/deleteroom/{roomId}")
    public ResponseEntity<ResponseModel> deleteRoom(@PathVariable Long roomId){
        return roomService.deleteRoomDetails(roomId);
    }
    @GetMapping("/roomdetails/{roomId}")
    public ResponseEntity<Room> getUniqueRoomDetails(@PathVariable Long roomId){
        return roomService.getUniqueRoom(roomId);
    }
    @GetMapping("/roomdetails/availablerooms")
    public ResponseEntity<List<Room>> getAvailableRooms(){
        return roomService.findAvailableRooms();
    }

}
