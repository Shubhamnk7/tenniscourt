package com.example.tenniscourt.repository;

import com.example.tenniscourt.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
