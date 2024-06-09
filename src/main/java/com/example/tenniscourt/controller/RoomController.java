package com.example.tenniscourt.controller;

import com.example.tenniscourt.model.Room;
import com.example.tenniscourt.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/rooms")
public class RoomController {
    @Autowired
    private RoomService roomService;

    @GetMapping
    public List<Room> getAllRooms() {
        return roomService.getAllRooms();
    }

    @GetMapping("/{id}")
    public Optional<Room> getRoomById(@PathVariable Integer id) {
        return roomService.getRoomById(id);
    }

    @PostMapping
    public Room createRoom(@RequestBody Room room) {
        return roomService.saveRoom(room);
    }

    @PutMapping("/{id}")
    public Room updateRoom(@PathVariable Integer id, @RequestBody Room roomDetails) {
        Room room = roomService.getRoomById(id).orElseThrow();
        room.setRoomName(roomDetails.getRoomName());
        return roomService.saveRoom(room);
    }

    @DeleteMapping("/{id}")
    public void deleteRoom(@PathVariable Integer id) {
        roomService.deleteRoom(id);
    }
}

