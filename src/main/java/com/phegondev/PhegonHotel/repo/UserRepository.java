package com.phegondev.PhegonHotel.repo;

import com.phegondev.PhegonHotel.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    boolean existsById(String email);

    Optional<User> findById(String email);
}
