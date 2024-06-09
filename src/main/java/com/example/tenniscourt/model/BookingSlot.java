package com.example.tenniscourt.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class BookingSlot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookingSlotId;

    private LocalTime startTime;
    private LocalTime endTime;
    private boolean availability;
    private double hourlyCharges;
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Integer getBookingSlotId() {
        return bookingSlotId;
    }

    public void setBookingSlotId(Integer bookingSlotId) {
        this.bookingSlotId = bookingSlotId;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public double getHourlyCharges() {
        return hourlyCharges;
    }

    public void setHourlyCharges(double hourlyCharges) {
        this.hourlyCharges = hourlyCharges;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
