package com.phegondev.PhegonHotel.repo;

import com.phegondev.PhegonHotel.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {

    Optional<Booking> findByBookingConfirmationCode(String confirmationCode);


    List<Booking> findByRoomId(Long roomId);
    List<Booking> findByUserId(Long userId);


}
