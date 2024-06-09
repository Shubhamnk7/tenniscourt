package com.example.tenniscourt.repository;

import com.example.tenniscourt.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Integer> {
}
