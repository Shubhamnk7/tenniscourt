package com.example.tenniscourt.controller;

import com.example.tenniscourt.model.BookingSlot;
import com.example.tenniscourt.model.Room;
import com.example.tenniscourt.service.BookingSlotService;
import com.example.tenniscourt.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/bookingSlot")
public class BookingSlotController {
    @Autowired
    private BookingSlotService bookingSlotService;

    @GetMapping
    public List<BookingSlot> getAllBookingSlot() {
        return bookingSlotService.getAllBookingSlot();
    }

    @GetMapping("/{id}")
    public Optional<BookingSlot> getBookingSlotById(@PathVariable Integer id) {
        return bookingSlotService.getBookingSlotById(id);
    }

    @PostMapping
    public BookingSlot createBookingSlot(@RequestBody BookingSlot bookingSlot) {
        //bookingSlot.setHourlyCharges(1000);
        return bookingSlotService.saveBookingSlot(bookingSlot);
    }

//    @PutMapping("/{id}")
//    public BookingSlot updateBookingSlot(@PathVariable Integer id, @RequestBody BookingSlot bookingSlotDetails) {
//        BookingSlot bookingSlot = bookingSlotService.getBookingSlotById(id).orElseThrow();
//        bookingSlotDetails.setRoomName(bookingSlotDetails.getRoomName());
//        return roomService.saveRoom(room);
//    }

    @DeleteMapping("/{id}")
    public void deleteBooking(@PathVariable Integer id) {
        bookingSlotService.deleteBooking(id);
    }
}


