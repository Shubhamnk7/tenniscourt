package com.example.tenniscourt.service;

import com.example.tenniscourt.model.BookingSlot;
import com.example.tenniscourt.repository.BookingSlotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingSlotService {
    @Autowired
    private BookingSlotRepository bookingSlotRepository;

    public List<BookingSlot> getAllBookingSlot() {
        return bookingSlotRepository.findAll();
    }

    public Optional<BookingSlot> getBookingSlotById(Integer id) {
        return bookingSlotRepository.findById(id);
    }

    public BookingSlot saveBookingSlot(BookingSlot bookingSlot) {
        return bookingSlotRepository.save(bookingSlot);
    }

    public void deleteBooking(Integer id) {
        bookingSlotRepository.deleteById(id);
    }
}


