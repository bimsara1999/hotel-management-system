package com.phegondev.PhegonHotel.repo;

import com.phegondev.PhegonHotel.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsById(String email);

    Optional<User> findById(String email);
}
