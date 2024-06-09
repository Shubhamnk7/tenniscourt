package com.example.tenniscourt.repository;

import com.example.tenniscourt.model.BookingSlot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingSlotRepository extends JpaRepository<BookingSlot, Integer> {
}
